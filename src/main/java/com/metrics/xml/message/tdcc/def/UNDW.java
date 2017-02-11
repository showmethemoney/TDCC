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

import com.metrics.bean.Undw;

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
 *         &lt;element ref="{}CSH_LEG"/>
 *         &lt;element ref="{}RECEIVER_BANK"/>
 *         &lt;element ref="{}UNDERWRITINGPART"/>
 *       &lt;/choice>
 *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISIN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="STLM_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BNDL_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BNDL_TTL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BS_PRC" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TAX_AMT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TRD_RT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
 *       &lt;attribute name="UND_FEE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CNS_FEE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="GUT_FEE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "items" })
@XmlRootElement(name = "UNDW")
public class UNDW
{

	@XmlElements({ @XmlElement(name = "PRTY", type = PRTY.class), @XmlElement(name = "CPRTY", type = CPRTY.class),
	        @XmlElement(name = "CSH_LEG", type = CSHLEG.class), @XmlElement(name = "RECEIVER_BANK", type = RECEIVERBANK.class),
	        @XmlElement(name = "UNDERWRITINGPART", type = UNDERWRITINGPART.class) })
	protected List<Object> items;
	@XmlAttribute(name = "REF")
	@XmlSchemaType(name = "anySimpleType")
	protected String ref;
	@XmlAttribute(name = "ISIN", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String isin;
	@XmlAttribute(name = "STLM_DT", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String stlmdt;
	@XmlAttribute(name = "BNDL_REF")
	@XmlSchemaType(name = "anySimpleType")
	protected String bndlref;
	@XmlAttribute(name = "BNDL_TTL")
	@XmlSchemaType(name = "anySimpleType")
	protected String bndlttl;
	@XmlAttribute(name = "BS_PRC")
	@XmlSchemaType(name = "anySimpleType")
	protected String bsprc;
	@XmlAttribute(name = "TAX_AMT")
	@XmlSchemaType(name = "anySimpleType")
	protected String taxamt;
	@XmlAttribute(name = "TRD_RT")
	@XmlSchemaType(name = "anySimpleType")
	protected String trdrt;
	@XmlAttribute(name = "CSH_SYS")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String cshsys;
	@XmlAttribute(name = "UND_FEE")
	@XmlSchemaType(name = "anySimpleType")
	protected String undfee;
	@XmlAttribute(name = "CNS_FEE")
	@XmlSchemaType(name = "anySimpleType")
	protected String cnsfee;
	@XmlAttribute(name = "GUT_FEE")
	@XmlSchemaType(name = "anySimpleType")
	protected String gutfee;

	public UNDW(Undw undw) {
		// @XmlElement(name = "PRTY", type = PRTY.class),
		// @XmlElement(name = "CPRTY", type = CPRTY.class),
		// @XmlElement(name = "CSH_LEG", type = CSHLEG.class),
		// @XmlElement(name = "RECEIVER_BANK", type = RECEIVERBANK.class),
		// @XmlElement(name = "UNDERWRITINGPART", type = UNDERWRITINGPART.class)		
		getItems().add( new PRTY().getSTLMPRTY().add( new STLMPRTY( undw.getPrty().getStlmprty() ) ) );
		getItems().add( new CPRTY().getSTLMPRTY().add( new STLMPRTY( undw.getCprty().getStlmprty() ) ) );
		getItems().add( new CSHLEG( undw.getCshLeg() ) );
		getItems().add( new RECEIVERBANK( undw.getReceiverBank() ) );
		getItems().add( new UNDERWRITINGPART( undw.getUnderWritingPart() ) );
		
		setBNDLREF( undw.getBndlref() );
		setBNDLREF( undw.getBndlttl() );
		setBSPRC( undw.getBsprc() );
		setCNSFEE( undw.getCnsfee() );
		setCSHSYS( undw.getCshsys() );
		setGUTFEE( undw.getGutfee() );
		setISIN( undw.getIsin() );
		setREF( undw.getRef() );
		setSTLMDT( undw.getStlmdt() );
		setTAXAMT( undw.getTaxamt() );
		setTRDRT( undw.getTrdrt() );
		setUNDFEE( undw.getUndfee() );
	}

	/**
	 * Gets the value of the prtyOrCPRTYOrCSHLEG property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the prtyOrCPRTYOrCSHLEG property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPRTYOrCPRTYOrCSHLEG().add( newItem );
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PRTY } {@link CPRTY } {@link CSHLEG } {@link RECEIVERBANK } {@link UNDERWRITINGPART }
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
	 * Gets the value of the isin property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getISIN() {
		return isin;
	}

	/**
	 * Sets the value of the isin property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setISIN(String value) {
		this.isin = value;
	}

	/**
	 * Gets the value of the stlmdt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSTLMDT() {
		return stlmdt;
	}

	/**
	 * Sets the value of the stlmdt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSTLMDT(String value) {
		this.stlmdt = value;
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
	 * Gets the value of the bsprc property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBSPRC() {
		return bsprc;
	}

	/**
	 * Sets the value of the bsprc property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBSPRC(String value) {
		this.bsprc = value;
	}

	/**
	 * Gets the value of the taxamt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTAXAMT() {
		return taxamt;
	}

	/**
	 * Sets the value of the taxamt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTAXAMT(String value) {
		this.taxamt = value;
	}

	/**
	 * Gets the value of the trdrt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTRDRT() {
		return trdrt;
	}

	/**
	 * Sets the value of the trdrt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTRDRT(String value) {
		this.trdrt = value;
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

	/**
	 * Gets the value of the undfee property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUNDFEE() {
		return undfee;
	}

	/**
	 * Sets the value of the undfee property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUNDFEE(String value) {
		this.undfee = value;
	}

	/**
	 * Gets the value of the cnsfee property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCNSFEE() {
		return cnsfee;
	}

	/**
	 * Sets the value of the cnsfee property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCNSFEE(String value) {
		this.cnsfee = value;
	}

	/**
	 * Gets the value of the gutfee property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGUTFEE() {
		return gutfee;
	}

	/**
	 * Sets the value of the gutfee property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGUTFEE(String value) {
		this.gutfee = value;
	}

}
