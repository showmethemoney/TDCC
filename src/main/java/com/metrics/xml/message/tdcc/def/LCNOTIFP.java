//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.03 at 08:32:50 AM CST 
//


package com.metrics.xml.message.tdcc.def;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="REF_TYPE" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CREF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FT_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BNDL_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ST" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ST_RSN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SNDR_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SCND_SNDR_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NARR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISIN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SCND_ISIN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RDMP_CFM_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LC_NOTIFP")
public class LCNOTIFP {

    @XmlAttribute(name = "REF_TYPE", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String reftype;
    @XmlAttribute(name = "REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ref;
    @XmlAttribute(name = "CREF")
    @XmlSchemaType(name = "anySimpleType")
    protected String cref;
    @XmlAttribute(name = "FT_REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String ftref;
    @XmlAttribute(name = "BNDL_REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String bndlref;
    @XmlAttribute(name = "ST", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String st;
    @XmlAttribute(name = "ST_RSN")
    @XmlSchemaType(name = "anySimpleType")
    protected String strsn;
    @XmlAttribute(name = "SNDR_REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String sndrref;
    @XmlAttribute(name = "SCND_SNDR_REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String scndsndrref;
    @XmlAttribute(name = "NARR")
    @XmlSchemaType(name = "anySimpleType")
    protected String narr;
    @XmlAttribute(name = "ISIN")
    @XmlSchemaType(name = "anySimpleType")
    protected String isin;
    @XmlAttribute(name = "SCND_ISIN")
    @XmlSchemaType(name = "anySimpleType")
    protected String scndisin;
    @XmlAttribute(name = "RDMP_CFM_REF")
    @XmlSchemaType(name = "anySimpleType")
    protected String rdmpcfmref;
    
	public String getReftype() {
		return reftype;
	}
	public String getRef() {
		return ref;
	}
	public String getCref() {
		return cref;
	}
	public String getFtref() {
		return ftref;
	}
	public String getBndlref() {
		return bndlref;
	}
	public String getSt() {
		return st;
	}
	public String getStrsn() {
		return strsn;
	}
	public String getSndrref() {
		return sndrref;
	}
	public String getScndsndrref() {
		return scndsndrref;
	}
	public String getNarr() {
		return narr;
	}
	public String getIsin() {
		return isin;
	}
	public String getScndisin() {
		return scndisin;
	}
	public String getRdmpcfmref() {
		return rdmpcfmref;
	}
	public void setReftype(String reftype) {
		this.reftype = reftype;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public void setCref(String cref) {
		this.cref = cref;
	}
	public void setFtref(String ftref) {
		this.ftref = ftref;
	}
	public void setBndlref(String bndlref) {
		this.bndlref = bndlref;
	}
	public void setSt(String st) {
		this.st = st;
	}
	public void setStrsn(String strsn) {
		this.strsn = strsn;
	}
	public void setSndrref(String sndrref) {
		this.sndrref = sndrref;
	}
	public void setScndsndrref(String scndsndrref) {
		this.scndsndrref = scndsndrref;
	}
	public void setNarr(String narr) {
		this.narr = narr;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public void setScndisin(String scndisin) {
		this.scndisin = scndisin;
	}
	public void setRdmpcfmref(String rdmpcfmref) {
		this.rdmpcfmref = rdmpcfmref;
	}

}