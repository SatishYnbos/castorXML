/**
 * 
 */
package com.castor.test;

import com.castor.model.Company;
import com.castor.services.CompanyService;
import com.castor.services.CompanyServiceImpl;
import com.castor.services.XMLConverterService;

import junit.framework.TestCase;

/**
 * @author satish
 *
 */
public class XMLConverterServiceTest extends TestCase {
	CompanyService service = new CompanyServiceImpl();
	XMLConverterService converterService = new XMLConverterServiceImpl();

	public void testConvertFromObjectToXML() {
		Company comp = service.establish();
		converterService.convertFromObjectToXML(comp, "F:/Satish/softwares/Castor/company.xml");
		assertTrue(true);
	}
}
