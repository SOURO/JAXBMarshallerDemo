package com.souro.JAXBMarshallerDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.souro.JAXBMarshallerDemo.Researcher.Researcher;

/**
 * XML to Object using Marshaller
 *
 */
public class App_XML_To_Object {
	public static void main(String[] args) {
		try {
			File file = new File("Researcher.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Researcher.class);
			Unmarshaller unmarshallerObj = jaxbContext.createUnmarshaller(); 
			Researcher researcher = (Researcher)unmarshallerObj.unmarshal(file);
			System.out.println("Researcher Details:: Name: "+researcher.getName()+", Duration: "+researcher.getResearchDuration()+", Reserach Field: "+researcher.getReserachField());
			
		} catch (javax.xml.bind.JAXBException ex) {
			ex.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
