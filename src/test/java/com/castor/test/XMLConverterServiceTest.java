/**
 * 
 */
package com.castor.test;

import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.castor.model.Company;
import com.castor.services.CompanyService;
import com.castor.services.CompanyServiceImpl;
import com.castor.services.XMLConverterService;
import com.castor.services.XMLConverterServiceImpl;
import com.castor.util.ResourceUtil;

import junit.framework.TestCase;

/**
 * @author satish
 *
 */
public class XMLConverterServiceTest extends TestCase {
	CompanyService service = new CompanyServiceImpl();
	XMLConverterService converterService = new XMLConverterServiceImpl();

	public void testParsing() {
		/**
		 * Getting The Company Object
		 */
		Company companyToConvert = service.establish();
		/**
		 * parsing object to xml
		 */
		File ouputFile = converterService.convertFromObjectToXML(companyToConvert,
				ResourceUtil.getResource("com/castor/resources/test/company.xml"));
		/**
		 * parsing xml to object
		 */
		Company company = (Company) converterService.convertFromXMLToObject(ouputFile);
		/**
		 * converting the given file to xml document
		 */
		Document xmlDoc = ResourceUtil.convertFileToDocument(ouputFile);
		/**
		 * getting elements from the Marshalled xml document and performing the
		 * assertions with UnMarshalled company Object -- STARTED
		 */
		Element cmpElement = xmlDoc.getDocumentElement();
		assertEquals(Integer.parseInt(cmpElement.getAttribute("id")), company.getId());
		NodeList cmpChildNodes = cmpElement.getChildNodes();
		Node productNode = cmpChildNodes.item(0);
		NodeList prdChildList = productNode.getChildNodes();
		Node prdId = prdChildList.item(0);
		assertEquals(Integer.parseInt(prdId.getTextContent()), company.getProduct().getId());
		Node prdname = prdChildList.item(1);
		assertEquals(prdname.getTextContent(), company.getProduct().getName());
		Node empsNode = cmpChildNodes.item(1);
		NodeList empschilds = empsNode.getChildNodes();
		for (int i = 0; i < empschilds.getLength(); i++) {
			Node empNode = empschilds.item(i);
			NodeList empChilds = empNode.getChildNodes();
			Node empId = empChilds.item(0);
			Node empName = empChilds.item(1);
			Node empDesg = empChilds.item(2);
			assertEquals(Integer.parseInt(empId.getTextContent()), company.getEmployees().get(i).getId());
			assertEquals(empName.getTextContent(), company.getEmployees().get(i).getName());
			assertEquals(empDesg.getTextContent(), company.getEmployees().get(i).getDesignation());
		}
	}
}
