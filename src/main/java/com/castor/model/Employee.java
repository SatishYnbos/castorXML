/**
 * 
 */
package com.castor.model;

/**
 * @author satish
 *
 */
public class Employee {
	private int id;
	private String name;
	private String designation;

	/**
	 * 
	 */
	public Employee() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param designation
	 */
	private Employee(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	/**
	 * It creates the Employee instance
	 * 
	 * @param id
	 * @param name
	 * @param designation
	 * @return
	 */
	public static Employee get(int id, String name, String designation) {
		Employee employee = new Employee(id, name, designation);
		return employee;
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

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation
	 *            the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}

}
