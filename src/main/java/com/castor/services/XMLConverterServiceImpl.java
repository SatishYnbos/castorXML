/**
 * 
 */
package com.castor.services;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;

import com.castor.model.Company;

/**
 * @author satish
 *
 */
public class XMLConverterService {
	
	/**
	 * This method will get the file from resources source folder by providing
	 * the file name
	 * 
	 * @param fileName
	 * @return
	 */
	private String getResource(String fileName) {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());
		return file.toString();

	}

	public void convertFromObjectToXML(Object obj, String filePath) {
		/*
		 * Creating mapping Object
		 */
		Mapping mapping = new Mapping();
		/*
		 * loading the mapping file explicitly to the mapping Object
		 */
		try {
			mapping.loadMapping(getResource("company_mapping.xml"));

			/*
			 * creating the writer Object with file name where we want to write
			 * the parsed xml content
			 */
			Writer writer = new FileWriter(filePath);
			/*
			 * creating the Marhaller Object to to marshall the given writer
			 */
			Marshaller marshaller = new Marshaller(writer);
			/*
			 * setting the mapping object to marshaller Object
			 */
			marshaller.setMapping(mapping);
			marshaller.marshal(obj);
			writer.close();
		} catch (IOException | MappingException | MarshalException | ValidationException e) {
			e.printStackTrace();
		}
	}

	public Object convertFromXMLToObject(String xmlFile) {

		Company company = null;
		/*
		 * creating the reader Object to read the content from given file
		 */
		try {
			Reader reader = new FileReader(xmlFile);

			/*
			 * creating the UnMarshaller Object with the class name to
			 * UnMarshall
			 */
			Unmarshaller unmarshaller = new Unmarshaller(Company.class);
			/*
			 * UnMarhalling the given XMl file
			 */
			company = (Company) unmarshaller.unmarshal(reader);
			/*
			 * closing the reader Object
			 */
			reader.close();

		} catch (IOException | MarshalException | ValidationException e) {
			e.printStackTrace();

		}
		return company;
	}
}
