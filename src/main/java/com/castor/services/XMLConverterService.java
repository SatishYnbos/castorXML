/**
 * 
 */
package com.castor.services;

/**
 * @author satish
 *
 */
public interface XMLConverterService {

	/**
	 * This method will parse the given Object to XML file by using mapping
	 * configuration file
	 * 
	 * @param obj
	 * @param filePath
	 */
	public void convertFromObjectToXML(Object obj, String outputFilePath);

	/**
	 * This method will parse given XML file to the java Object
	 * 
	 * @param xmlFile
	 * @return
	 */
	public Object convertFromXMLToObject(String xmlFile);
}