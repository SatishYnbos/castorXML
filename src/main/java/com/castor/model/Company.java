/**
 * 
 */
package com.castor.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author satish
 *
 */
public class Company {
	private int id;
	private Product product;
	private List<Employee> employees = new ArrayList<Employee>();

	/**
	 * 
	 */
	public Company() {
		super();
	}

	/**
	 * @param id
	 * @param product
	 * @param employees
	 */
	private Company(int id, Product product, List<Employee> employees) {
		super();
		this.id = id;
		this.product = product;
		this.employees = employees;
	}

	/**
	 * It creates company instance.
	 * 
	 * @param id
	 * @param product
	 * @param employees
	 * @return
	 */
	public static Company get(int id, Product product, List<Employee> employees) {
		Company company = new Company(id, product, employees);
		return company;
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
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees
	 *            the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employees == null) ? 0 : employees.hashCode());
		result = prime * result + id;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		if (id != other.id)
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [id=" + id + ", product=" + product + ", employees=" + employees + "]";
	}

}
