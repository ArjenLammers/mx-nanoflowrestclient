// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package tests.proxies;

public class OrderLine
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject orderLineMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Tests.OrderLine";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ArticleNr("ArticleNr"),
		Price("Price"),
		OrderLine_Order("Tests.OrderLine_Order");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public OrderLine(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Tests.OrderLine"));
	}

	protected OrderLine(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject orderLineMendixObject)
	{
		if (orderLineMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Tests.OrderLine", orderLineMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Tests.OrderLine");

		this.orderLineMendixObject = orderLineMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'OrderLine.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static tests.proxies.OrderLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return tests.proxies.OrderLine.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static tests.proxies.OrderLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new tests.proxies.OrderLine(context, mendixObject);
	}

	public static tests.proxies.OrderLine load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return tests.proxies.OrderLine.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of ArticleNr
	 */
	public final java.lang.Integer getArticleNr()
	{
		return getArticleNr(getContext());
	}

	/**
	 * @param context
	 * @return value of ArticleNr
	 */
	public final java.lang.Integer getArticleNr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ArticleNr.toString());
	}

	/**
	 * Set value of ArticleNr
	 * @param articlenr
	 */
	public final void setArticleNr(java.lang.Integer articlenr)
	{
		setArticleNr(getContext(), articlenr);
	}

	/**
	 * Set value of ArticleNr
	 * @param context
	 * @param articlenr
	 */
	public final void setArticleNr(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer articlenr)
	{
		getMendixObject().setValue(context, MemberNames.ArticleNr.toString(), articlenr);
	}

	/**
	 * @return value of Price
	 */
	public final java.math.BigDecimal getPrice()
	{
		return getPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of Price
	 */
	public final java.math.BigDecimal getPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Price.toString());
	}

	/**
	 * Set value of Price
	 * @param price
	 */
	public final void setPrice(java.math.BigDecimal price)
	{
		setPrice(getContext(), price);
	}

	/**
	 * Set value of Price
	 * @param context
	 * @param price
	 */
	public final void setPrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal price)
	{
		getMendixObject().setValue(context, MemberNames.Price.toString(), price);
	}

	/**
	 * @return value of OrderLine_Order
	 */
	public final tests.proxies.Order getOrderLine_Order() throws com.mendix.core.CoreException
	{
		return getOrderLine_Order(getContext());
	}

	/**
	 * @param context
	 * @return value of OrderLine_Order
	 */
	public final tests.proxies.Order getOrderLine_Order(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		tests.proxies.Order result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.OrderLine_Order.toString());
		if (identifier != null)
			result = tests.proxies.Order.load(context, identifier);
		return result;
	}

	/**
	 * Set value of OrderLine_Order
	 * @param orderline_order
	 */
	public final void setOrderLine_Order(tests.proxies.Order orderline_order)
	{
		setOrderLine_Order(getContext(), orderline_order);
	}

	/**
	 * Set value of OrderLine_Order
	 * @param context
	 * @param orderline_order
	 */
	public final void setOrderLine_Order(com.mendix.systemwideinterfaces.core.IContext context, tests.proxies.Order orderline_order)
	{
		if (orderline_order == null)
			getMendixObject().setValue(context, MemberNames.OrderLine_Order.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.OrderLine_Order.toString(), orderline_order.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return orderLineMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final tests.proxies.OrderLine that = (tests.proxies.OrderLine) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Tests.OrderLine";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
