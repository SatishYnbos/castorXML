/**
 * 
 */
package com.castor.services;

import java.util.ArrayList;
import java.util.List;

import com.castor.model.Company;
import com.castor.model.Employee;
import com.castor.model.Product;

/**
 * @author satish
 *
 */
public class CompanyServiceImpl implements CompanyService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.castor.services.CompanyService#establish()
	 */
	public Company establish() {
		Product application = Product.get(1, "application");
		Employee vijay = Employee.get(1, "Vijay", "TL");
		Employee pavan = Employee.get(2, "Pavan", "TM");
		Employee venkatesh = Employee.get(3, "Venkatesh", "TM");
		Employee satish = Employee.get(4, "Satish", "TM");
		Employee chandu = Employee.get(5, "Chandu", "TM");
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(vijay);
		employees.add(pavan);
		employees.add(venkatesh);
		employees.add(satish);
		employees.add(chandu);
		Company waveLabs = Company.get(1, application, employees);
		return waveLabs;
	}
}
