/**
 * 
 */
package com.castor.model;

/**
 * @author satish
 *
 */
public class Product {
	private int id;
	private String name;

	/**
	 * 
	 */
	public Product() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 */
	private Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/**
	 * It creates the Product instance
	 * 
	 * @param id
	 * @param name
	 * @return
	 */
	public static Product get(int id, String name) {
		Product product = new Product(id, name);
		return product;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

}
