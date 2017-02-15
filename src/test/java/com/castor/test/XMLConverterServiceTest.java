/**
 * 
 */
package com.castor.test;

import com.castor.model.Company;
import com.castor.services.CompanyService;
import com.castor.services.CompanyServiceImpl;
import com.castor.services.XMLConverterService;
import com.castor.services.XMLConverterServiceImpl;

import junit.framework.TestCase;

/**
 * @author satish
 *
 */
public class XMLConverterServiceTest extends TestCase {
	CompanyService service = new CompanyServiceImpl();
	XMLConverterService converterService = new XMLConverterServiceImpl();

	public void testConvertFromObjectToXML() {
		Company company1 = service.establish();
		converterService.convertFromObjectToXML(company1, "F:/Satish/softwares/Castor/company.xml");
		Company company2 = (Company) converterService.convertFromXMLToObject("F:/Satish/softwares/Castor/input.xml");
		assertEquals(company1, company2);
	}

	public void tstConvertFromXMLToObject() {
		Company company = (Company) converterService.convertFromXMLToObject("F:/Satish/softwares/Castor/input.xml");
		System.out.println(company);
		assertTrue(true);
	}
}
