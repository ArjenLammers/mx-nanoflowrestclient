export async function DoRequest(url, method, body, headers, timeout) {
    return new Promise(function(resolve, reject) {
        console.debug(`[rest] ${method}: ${url} (timeout: ${timeout})`);
        let timeoutId = null;
        let requestObject = {
            method: method,
            body: body,
            headers: new Headers({
                'Content-Type': 'application/json'
            })
        };
        
        let nativeDebuggingEnabled = (typeof GLOBAL !== 'undefined' && GLOBAL.__DEV__) ? true : false;
        if (!nativeDebuggingEnabled && timeout && timeout != null && parseInt(timeout.toString()) != 0) {
            var controller = new AbortController();
            timeoutId = setTimeout(() => {
                    console.warn(`[rest] Timeout for ${method} ${url}`);
                    controller.abort();
                }, parseInt(timeout.toString()));
            requestObject.signal = controller.signal;
        }

        let request = new Request(url, requestObject);

        for (let i = 0; i < headers.length; i++) {
            request.headers.set(headers[i].get("Key"), headers[i].get("Value"));
        }

        fetch(request).then(response => {
            if (timeoutId)
                clearTimeout(timeoutId);
            console.debug(`[rest] ${method}: ${url} (STATUS: ${response.status})`);

			mx.data.create({
                entity: "System.HttpResponse",
                callback: function(mxObject) {
                    mxObject.set("StatusCode", response.status);
                    mxObject.set("ReasonPhrase", response.statusText);
                    response.text().then(function (txt) {
                        mxObject.set("Content", txt);
                        resolve(mxObject);
                    }).catch(err => {
                        reject(err);
                    });
                }
            });
        }).catch(reason => {
            reject(reason);
        });
    });
}