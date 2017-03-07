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

import com.metrics.bean.OpenRepo;
import com.metrics.utils.EmptyObjectUtil;


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
 *         &lt;element ref="{}PCH"/>
 *         &lt;element ref="{}RPCH"/>
 *         &lt;element ref="{}SEC_LEG"/>
 *       &lt;/choice>
 *       &lt;attribute name="REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CB_ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BNDL_REF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BNDL_TTL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DEAL_SIDE" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="D"/>
 *             &lt;enumeration value="R"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TRD_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PREV_REPO_ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RE_REPO_AUTH">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Y"/>
 *             &lt;enumeration value="N"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TRD_RT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "OPEN_REPO")
public class OPENREPO
{

	public OPENREPO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@XmlElements({ @XmlElement(name = "PRTY", type = PRTY.class), @XmlElement(name = "CPRTY", type = CPRTY.class), @XmlElement(name = "PCH", type = PCH.class),
	        @XmlElement(name = "RPCH", type = RPCH.class), @XmlElement(name = "SEC_LEG", type = SECLEG.class) })
	protected List<Object> items;
	@XmlAttribute(name = "REF")
	@XmlSchemaType(name = "anySimpleType")
	protected String ref;
	@XmlAttribute(name = "CB_ID")
	@XmlSchemaType(name = "anySimpleType")
	protected String cbid;
	@XmlAttribute(name = "BNDL_REF")
	@XmlSchemaType(name = "anySimpleType")
	protected String bndlref;
	@XmlAttribute(name = "BNDL_TTL")
	@XmlSchemaType(name = "anySimpleType")
	protected String bndlttl;
	@XmlAttribute(name = "DEAL_SIDE", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String dealside;
	@XmlAttribute(name = "TRD_DT", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String trddt;
	@XmlAttribute(name = "PREV_REPO_ID")
	@XmlSchemaType(name = "anySimpleType")
	protected String prevrepoid;
	@XmlAttribute(name = "RE_REPO_AUTH")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String rerepoauth;
	@XmlAttribute(name = "TRD_RT", required = true)
	@XmlSchemaType(name = "anySimpleType")
	protected String trdrt;
	@XmlAttribute(name = "CSH_SYS")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String cshsys;

	public OPENREPO(OpenRepo openRepo) {
		// @XmlElement(name = "PRTY", type = PRTY.class),
		// @XmlElement(name = "CPRTY", type = CPRTY.class),
		// @XmlElement(name = "PCH", type = PCH.class),
		// @XmlElement(name = "RPCH", type = RPCH.class),
		// @XmlElement(name = "SEC_LEG", type = SECLEG.class)
		STLMPRTY stlmPrty = new STLMPRTY( openRepo.getPrty().getStlmprty() );
		if (null != EmptyObjectUtil.isEmptyObject( stlmPrty )) {
			PRTY prty = new PRTY();
			prty.getSTLMPRTY().add( stlmPrty );
			getItems().add( prty );
		}

		STLMPRTY stlmCPrty = new STLMPRTY( openRepo.getCprty().getStlmprty() );
		if (null != EmptyObjectUtil.isEmptyObject( stlmCPrty )) {
			CPRTY cprty = new CPRTY();
			cprty.getSTLMPRTY().add( stlmCPrty );
			getItems().add( cprty );
		}

		// @XmlElement(name = "STLM_DT", type = String.class),
		// @XmlElement(name = "CSH_LEG", type = CSHLEG.class)
		PCH pch = new PCH();
		pch.getItems().add( openRepo.getPch().getStlmdt() );
		pch.getItems().add( EmptyObjectUtil.isEmptyObject( new CSHLEG( openRepo.getPch().getCshLeg() ) ) );
		getItems().add( pch );

		SECLEG secLeg = new SECLEG( null, openRepo.getSecLeg().getIsin(), openRepo.getSecLeg().getMgcntrid() );

		// @XmlElement(name = "SEC_UNITS_LEG", type = SECUNITSLEG.class),
		// @XmlElement(name = "FRST_LEG", type = FRSTLEG.class),
		// @XmlElement(name = "SCND_LEG", type = SCNDLEG.class),
		// @XmlElement(name = "BD_LEG", type = BDLEG.class)
		SECGENLEG secGenLeg = new SECGENLEG( null, openRepo.getSecLeg().getSecGenLeg().getGenid(), openRepo.getSecLeg().getSecGenLeg().getSecamt() );

		// @XmlElement(name = "CSH_LEG", type = CSHLEG.class),
		// @XmlElement(name = "TAX_IMP", type = TAXIMP.class)
		FRSTLEG frstLeg = new FRSTLEG();
		frstLeg.getItems().add( EmptyObjectUtil.isEmptyObject( new CSHLEG( openRepo.getSecLeg().getSecGenLeg().getFrstLeg().getCshLeg() ) ) );
		frstLeg.getItems().add( EmptyObjectUtil.isEmptyObject( new TAXIMP( openRepo.getSecLeg().getSecGenLeg().getFrstLeg().getTaxImp() ) ) );

		// @XmlElement(name = "CSH_LEG", type = CSHLEG.class),
		// @XmlElement(name = "TAX_IMP", type = TAXIMP.class)
		SCNDLEG scenLeg = new SCNDLEG();
		scenLeg.getItems().add( EmptyObjectUtil.isEmptyObject( new CSHLEG( openRepo.getSecLeg().getSecGenLeg().getScndLeg().getCshLeg() ) ) );
		scenLeg.getItems().add( EmptyObjectUtil.isEmptyObject( new TAXIMP( openRepo.getSecLeg().getSecGenLeg().getScndLeg().getTaxImp() ) ) );

		secGenLeg.getItems().add( EmptyObjectUtil.isEmptyObject( new SECUNITSLEG( openRepo.getSecLeg().getSecGenLeg().getSecUnitsLeg() ) ) );
		secGenLeg.getItems().add( frstLeg );
		secGenLeg.getItems().add( scenLeg );
		secGenLeg.getItems().add( EmptyObjectUtil.isEmptyObject( new BDLEG( openRepo.getSecLeg().getSecGenLeg().getBdLeg() ) ) );

		secLeg.getItems().add( secGenLeg );

		getItems().add( secLeg );

		setBNDLREF( openRepo.getBndlref() );
		setBNDLTTL( openRepo.getBndlttl() );
		setCBID( openRepo.getCbid() );
		setCSHSYS( openRepo.getCshsys() );
		setDEALSIDE( openRepo.getDealside() );
		setPREVREPOID( openRepo.getPrevrepoid() );
		setREF( openRepo.getRef() );
		setREREPOAUTH( openRepo.getRerepoauth() );
		setTRDDT( openRepo.getTrddt() );
		setTRDRT( openRepo.getTrdrt() );
	}

	/**
	 * Gets the value of the prtyOrCPRTYOrPCH property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the prtyOrCPRTYOrPCH property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getPRTYOrCPRTYOrPCH().add( newItem );
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PRTY } {@link CPRTY } {@link PCH } {@link RPCH } {@link SECLEG }
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
	 * Gets the value of the cbid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCBID() {
		return cbid;
	}

	/**
	 * Sets the value of the cbid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCBID(String value) {
		this.cbid = value;
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
	 * Gets the value of the dealside property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDEALSIDE() {
		return dealside;
	}

	/**
	 * Sets the value of the dealside property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDEALSIDE(String value) {
		this.dealside = value;
	}

	/**
	 * Gets the value of the trddt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTRDDT() {
		return trddt;
	}

	/**
	 * Sets the value of the trddt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTRDDT(String value) {
		this.trddt = value;
	}

	/**
	 * Gets the value of the prevrepoid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPREVREPOID() {
		return prevrepoid;
	}

	/**
	 * Sets the value of the prevrepoid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPREVREPOID(String value) {
		this.prevrepoid = value;
	}

	/**
	 * Gets the value of the rerepoauth property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getREREPOAUTH() {
		return rerepoauth;
	}

	/**
	 * Sets the value of the rerepoauth property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setREREPOAUTH(String value) {
		this.rerepoauth = value;
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

}
