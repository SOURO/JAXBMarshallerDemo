package com.souro.JAXBMarshallerDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.souro.JAXBMarshallerDemo.Researcher.Researcher;

/**
 * Object to XML using Marshaller
 *
 */
public class App_Object_To_XML {
	public static void main(String[] args) {
		try {
			JAXBContext contextObj = JAXBContext.newInstance(Researcher.class);

			Marshaller marshallerObj = contextObj.createMarshaller();
			marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			Researcher researcher = new Researcher();
			researcher.setName("Souro");
			researcher.setResearchDuration((float) 3.5);
			researcher.setResearcherId(5);
			researcher.setReserachField("Machine Learning");

			marshallerObj.marshal(researcher, new FileOutputStream(
					"Researcher.xml"));
		} catch (javax.xml.bind.JAXBException ex) {
			ex.printStackTrace();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
