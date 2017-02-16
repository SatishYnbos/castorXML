/**
 * 
 */
package com.castor.util;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

/**
 * @author satish
 *
 */
public class ResourceUtil {
	/**
	 * This method will get the file from resources source folder by providing
	 * the file name
	 * 
	 * @param fileName
	 * @return
	 */
	public static File getResource(String fileName) {
		ResourceUtil util = new ResourceUtil();
		ClassLoader classLoader = util.getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		return file;
	}

	/**
	 * This method will convert the given file to xml document
	 * 
	 * @param xmlFile
	 * @return
	 */
	public static Document convertFileToDocument(File xmlFile) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse(xmlFile);
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
