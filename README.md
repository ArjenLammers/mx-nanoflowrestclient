# Mendix REST client from Nanoflow

## Description

This module provides a means to perform REST calls from a nanoflow.
An action per HTTP method is exposed as nanoflow action.

Key functionalities:

- Implemented HTTP methods: GET/POST/PUT/DELETE/HEAD/OPTIONS/PATCH
- Headers for request and response.
- Timeout (call will be aborted if the call took a certain amount of ms).
- Parse a JSON to a Mendix object structure.
- Serialize a Mendix object structure to JSON.
- Works on native and web.

## Installation
Import the module from the App Store.

## Usage

### Assemble payload
If required:
- Assemble your payload (e.g. by using the `SerializeObjectToJSON` action which will create a JSON string out of a Mendix object structure).
- Assemble your headers (if none is given `Content-Type: application/json` will be the default) as a list of `System.HttpHeader` objects.

### Perform HTTP calls
Use the action of your exposed HTTP method of choice to perform REST calls. A timeout is an optional parameter. 
An error is thrown if the call was unsuccesful (like a timeout or connection refused). A HTTP 500 is a valid result.

### Interpret result
The action will return a `System.HttpResponse` object.
If required:
- Evaluate the `StatusCode` attribute.
- Evaluate the `Content` attribute. One can leverage the `ParseJSONToObject` to create a Mendix object structure from JSON data.
