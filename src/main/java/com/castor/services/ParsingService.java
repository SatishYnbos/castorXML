/**
 * 
 */
package com.castor.services;

import java.io.File;

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
	 * @param outputFile
	 */
	public File convertFromObjectToXML(Object obj, File outputFile);

	/**
	 * This method will parse given XML file to the java Object
	 * 
	 * @param xmlFile
	 * @return
	 */
	public Object convertFromXMLToObject(File xmlFile);
}