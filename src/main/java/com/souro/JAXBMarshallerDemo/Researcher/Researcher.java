package com.souro.JAXBMarshallerDemo.Researcher;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Researcher Pojo
 *
 */

@XmlRootElement /* specifies the root element for the xml document */
public class Researcher 
{
    String name;
    int researcherId;
    String reserachField;
    float researchDuration;
    
    @XmlElement /* specifies the sub element for the root element */
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlAttribute /* specifies the attribute for the root element */
	public int getResearcherId() {
		return researcherId;
	}
	public void setResearcherId(int researcherId) {
		this.researcherId = researcherId;
	}
	
	@XmlElement /* specifies the sub element for the root element */
	public String getReserachField() {
		return reserachField;
	}
	public void setReserachField(String reserachField) {
		this.reserachField = reserachField;
	}
	
	@XmlElement /* specifies the sub element for the root element */
	public float getResearchDuration() {
		return researchDuration;
	}
	public void setResearchDuration(float researchDuration) {
		this.researchDuration = researchDuration;
	} 
}
