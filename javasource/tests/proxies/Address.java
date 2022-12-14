// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package tests.proxies;

public class Address
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject addressMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Tests.Address";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Street("Street"),
		Nr("Nr"),
		Address_Customer("Tests.Address_Customer");

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

	public Address(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Tests.Address"));
	}

	protected Address(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject addressMendixObject)
	{
		if (addressMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Tests.Address", addressMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Tests.Address");

		this.addressMendixObject = addressMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Address.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static tests.proxies.Address initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return tests.proxies.Address.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static tests.proxies.Address initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new tests.proxies.Address(context, mendixObject);
	}

	public static tests.proxies.Address load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return tests.proxies.Address.initialize(context, mendixObject);
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
	 * @return value of Street
	 */
	public final java.lang.String getStreet()
	{
		return getStreet(getContext());
	}

	/**
	 * @param context
	 * @return value of Street
	 */
	public final java.lang.String getStreet(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Street.toString());
	}

	/**
	 * Set value of Street
	 * @param street
	 */
	public final void setStreet(java.lang.String street)
	{
		setStreet(getContext(), street);
	}

	/**
	 * Set value of Street
	 * @param context
	 * @param street
	 */
	public final void setStreet(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String street)
	{
		getMendixObject().setValue(context, MemberNames.Street.toString(), street);
	}

	/**
	 * @return value of Nr
	 */
	public final java.lang.Integer getNr()
	{
		return getNr(getContext());
	}

	/**
	 * @param context
	 * @return value of Nr
	 */
	public final java.lang.Integer getNr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Nr.toString());
	}

	/**
	 * Set value of Nr
	 * @param nr
	 */
	public final void setNr(java.lang.Integer nr)
	{
		setNr(getContext(), nr);
	}

	/**
	 * Set value of Nr
	 * @param context
	 * @param nr
	 */
	public final void setNr(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer nr)
	{
		getMendixObject().setValue(context, MemberNames.Nr.toString(), nr);
	}

	/**
	 * @return value of Address_Customer
	 */
	public final tests.proxies.Customer getAddress_Customer() throws com.mendix.core.CoreException
	{
		return getAddress_Customer(getContext());
	}

	/**
	 * @param context
	 * @return value of Address_Customer
	 */
	public final tests.proxies.Customer getAddress_Customer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		tests.proxies.Customer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Address_Customer.toString());
		if (identifier != null)
			result = tests.proxies.Customer.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Address_Customer
	 * @param address_customer
	 */
	public final void setAddress_Customer(tests.proxies.Customer address_customer)
	{
		setAddress_Customer(getContext(), address_customer);
	}

	/**
	 * Set value of Address_Customer
	 * @param context
	 * @param address_customer
	 */
	public final void setAddress_Customer(com.mendix.systemwideinterfaces.core.IContext context, tests.proxies.Customer address_customer)
	{
		if (address_customer == null)
			getMendixObject().setValue(context, MemberNames.Address_Customer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Address_Customer.toString(), address_customer.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return addressMendixObject;
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
			final tests.proxies.Address that = (tests.proxies.Address) obj;
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
		return "Tests.Address";
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
