//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.03 at 08:32:50 AM CST 
//

package com.metrics.xml.message.tdcc.def;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.metrics.bean.CloseRepo;


/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}PRTY"/>
 *         &lt;element ref="{}CPRTY"/>
 *       &lt;/choice>
 *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CNTR_ID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CSH_AMT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="XTR_INT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BNDL_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BNDL_TTL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CSH_SYS">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="TWD"/>
 *             &lt;enumeration value="USD"/>
 *             &lt;enumeration value="AUD"/>
 *             &lt;enumeration value="EUR"/>
 *             &lt;enumeration value="JPY"/>
 *             &lt;enumeration value="CNY"/>
 *             &lt;enumeration value="ZAR"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "items" })
@XmlRootElement(name = "CLOSE_REPO")
public class CLOSEREPO
{

	@XmlElements({ @XmlElement(name = "PRTY", type = PRTY.class), @XmlElement(name = "CPRTY", type = CPRTY.class) })
	protected List<Object> items;
	@XmlAttribute(name = "REF")
	@XmlSchemaType(name = "anySimpleType")
	protected String ref;
	@XmlAttribute(name = "CNTR_ID", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String cntrid;
	@XmlAttribute(name = "CSH_AMT")
	@XmlSchemaType(name = "anySimpleType")
	protected String cshamt;
	@XmlAttribute(name = "XTR_INT")
	@XmlSchemaType(name = "anySimpleType")
	protected String xtrint;
	@XmlAttribute(name = "BNDL_REF")
	@XmlSchemaType(name = "anySimpleType")
	protected String bndlref;
	@XmlAttribute(name = "BNDL_TTL")
	@XmlSchemaType(name = "anySimpleType")
	protected String bndlttl;
	@XmlAttribute(name = "CSH_SYS")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String cshsys;

	public CLOSEREPO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CLOSEREPO(CloseRepo closeRepo) {
		PRTY prty = new PRTY();
		prty.getSTLMPRTY().add( new STLMPRTY( closeRepo.getPrty().getStlmprty() ) );
		CPRTY cprty = new CPRTY();
		cprty.getSTLMPRTY().add( new STLMPRTY( closeRepo.getCprty().getStlmprty() ) );

		getItems().add( prty );
		getItems().add( cprty );

		setREF( closeRepo.getRef() );
		setCNTRID( closeRepo.getCntrid() );
		setCSHAMT( closeRepo.getCshamt() );
		setXTRINT( closeRepo.getXtrint() );
		setBNDLREF( closeRepo.getBndlref() );
		setBNDLTTL( closeRepo.getBndlttl() );
		setCSHSYS( closeRepo.getCshsys() );
	}

	/**
	 * Gets the value of the prtyOrCPRTY property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the prtyOrCPRTY property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPRTYOrCPRTY().add( newItem );
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PRTY } {@link CPRTY }
	 * 
	 * 
	 */
	public List<Object> getItems() {
		if (items == null) {
			items = new ArrayList<Object>();
		}
		return this.items;
	}

	/**
	 * Gets the value of the ref property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getREF() {
		return ref;
	}

	/**
	 * Sets the value of the ref property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setREF(String value) {
		this.ref = value;
	}

	/**
	 * Gets the value of the cntrid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCNTRID() {
		return cntrid;
	}

	/**
	 * Sets the value of the cntrid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCNTRID(String value) {
		this.cntrid = value;
	}

	/**
	 * Gets the value of the cshamt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCSHAMT() {
		return cshamt;
	}

	/**
	 * Sets the value of the cshamt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCSHAMT(String value) {
		this.cshamt = value;
	}

	/**
	 * Gets the value of the xtrint property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXTRINT() {
		return xtrint;
	}

	/**
	 * Sets the value of the xtrint property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXTRINT(String value) {
		this.xtrint = value;
	}

	/**
	 * Gets the value of the bndlref property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBNDLREF() {
		return bndlref;
	}

	/**
	 * Sets the value of the bndlref property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBNDLREF(String value) {
		this.bndlref = value;
	}

	/**
	 * Gets the value of the bndlttl property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBNDLTTL() {
		return bndlttl;
	}

	/**
	 * Sets the value of the bndlttl property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBNDLTTL(String value) {
		this.bndlttl = value;
	}

	/**
	 * Gets the value of the cshsys property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCSHSYS() {
		return cshsys;
	}

	/**
	 * Sets the value of the cshsys property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCSHSYS(String value) {
		this.cshsys = value;
	}

}
