//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.03 at 08:32:50 AM CST 
//


package com.metrics.xml.message.tdcc.def;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;choice>
 *         &lt;element ref="{}LC_NOTIFP"/>
 *         &lt;element ref="{}CSH_ADVICE"/>
 *         &lt;element ref="{}CSH_PRIORITY"/>
 *         &lt;element ref="{}CANCEL_CONF"/>
 *         &lt;element ref="{}RES_REQ"/>
 *         &lt;element ref="{}REP_REQ"/>
 *         &lt;element ref="{}REP"/>
 *         &lt;element ref="{}LC_NOTIFS"/>
 *         &lt;element ref="{}RTEP"/>
 *         &lt;element ref="{}IM"/>
 *         &lt;element ref="{}DEP"/>
 *         &lt;element ref="{}UNDW"/>
 *         &lt;element ref="{}CSH_TRANSFER"/>
 *         &lt;element ref="{}CONSIGNT_INST"/>
 *         &lt;element ref="{}CONSIGNT_NOTE"/>
 *         &lt;element ref="{}PRESENTATION_NOTE"/>
 *         &lt;element ref="{}RDMP_NOTE"/>
 *         &lt;element ref="{}REI_INST"/>
 *         &lt;element ref="{}REI_NOTE"/>
 *         &lt;element ref="{}ER_INST"/>
 *         &lt;element ref="{}REM_INST"/>
 *         &lt;element ref="{}NPRDM_INST"/>
 *         &lt;element ref="{}NPWD_INST"/>
 *         &lt;element ref="{}INVACCTINFO_INST"/>
 *         &lt;element ref="{}MORTGAGE_REGEX"/>
 *         &lt;element ref="{}MORTGAGE_RELEX"/>
 *         &lt;element ref="{}MORTGAGE_SELREG"/>
 *         &lt;element ref="{}MORTGAGE_BUYSEL"/>
 *         &lt;element ref="{}OPEN_REPO"/>
 *         &lt;element ref="{}CLOSE_REPO"/>
 *         &lt;element ref="{}MOD_REPO"/>
 *         &lt;element ref="{}BRK_REPO"/>
 *         &lt;element ref="{}SEC_STLM"/>
 *         &lt;element ref="{}OAT"/>
 *         &lt;element ref="{}SEC_BLK"/>
 *         &lt;element ref="{}CSH_NOTICE"/>
 *         &lt;element ref="{}LC_NOTIFA"/>
 *         &lt;element ref="{}LC_NOTIFK"/>
 *         &lt;element ref="{}CSH_ADVICE1"/>
 *         &lt;element ref="{}FL_TRANS"/>
 *         &lt;element ref="{}ST_QUERY"/>
 *         &lt;element ref="{}BAS_INFO"/>
 *         &lt;element ref="{}REG_INFO"/>
 *         &lt;element ref="{}PAY_INFO"/>
 *         &lt;element ref="{}DVP_UNDW"/>
 *         &lt;element ref="{}DVP_CSH_TRS"/>
 *         &lt;element ref="{}SEC_TRANS"/>
 *         &lt;element ref="{}TRANS_STNOT"/>
 *         &lt;element ref="{}INHT"/>
 *         &lt;element ref="{}COURT"/>
 *         &lt;element ref="{}PYM_LIST"/>
 *         &lt;element ref="{}PYM_SN"/>
 *         &lt;element ref="{}PYM_NOT"/>
 *         &lt;element ref="{}RM_EXCHANGE"/>
 *         &lt;element ref="{}RM_RELEX"/>
 *         &lt;element ref="{}RM_REGEX"/>
 *         &lt;element ref="{}ACCT_MOV"/>
 *         &lt;element ref="{}LC_NOTIFRM"/>
 *         &lt;element ref="{}R_INFO"/>
 *         &lt;element ref="{}VMUN"/>
 *         &lt;element ref="{}HLI"/>
 *         &lt;element ref="{}BRO_STLM"/>
 *         &lt;element ref="{}CONS_REI_INST"/>
 *         &lt;element ref="{}CONS_REI_NOTE"/>
 *         &lt;element ref="{}DEP_FNB"/>
 *         &lt;element ref="{}DEP_FNB_NOTE"/>
 *         &lt;element ref="{}ISSUERATEINFO_INST"/>
 *       &lt;/choice>
 *       &lt;attribute name="ORIGIN" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TS" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BCSS_BUS_DT" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MSG_TYPE" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="001"/>
 *             &lt;enumeration value="002"/>
 *             &lt;enumeration value="003"/>
 *             &lt;enumeration value="004"/>
 *             &lt;enumeration value="005"/>
 *             &lt;enumeration value="006"/>
 *             &lt;enumeration value="010"/>
 *             &lt;enumeration value="012"/>
 *             &lt;enumeration value="020"/>
 *             &lt;enumeration value="040"/>
 *             &lt;enumeration value="101"/>
 *             &lt;enumeration value="102"/>
 *             &lt;enumeration value="110"/>
 *             &lt;enumeration value="111"/>
 *             &lt;enumeration value="112"/>
 *             &lt;enumeration value="113"/>
 *             &lt;enumeration value="120"/>
 *             &lt;enumeration value="121"/>
 *             &lt;enumeration value="123"/>
 *             &lt;enumeration value="124"/>
 *             &lt;enumeration value="125"/>
 *             &lt;enumeration value="130"/>
 *             &lt;enumeration value="201"/>
 *             &lt;enumeration value="202"/>
 *             &lt;enumeration value="203"/>
 *             &lt;enumeration value="204"/>
 *             &lt;enumeration value="301"/>
 *             &lt;enumeration value="302"/>
 *             &lt;enumeration value="303"/>
 *             &lt;enumeration value="304"/>
 *             &lt;enumeration value="401"/>
 *             &lt;enumeration value="402"/>
 *             &lt;enumeration value="403"/>
 *             &lt;enumeration value="720"/>
 *             &lt;enumeration value="750"/>
 *             &lt;enumeration value="760"/>
 *             &lt;enumeration value="761"/>
 *             &lt;enumeration value="770"/>
 *             &lt;enumeration value="998"/>
 *             &lt;enumeration value="999"/>
 *             &lt;enumeration value="996"/>
 *             &lt;enumeration value="030"/>
 *             &lt;enumeration value="022"/>
 *             &lt;enumeration value="013"/>
 *             &lt;enumeration value="501"/>
 *             &lt;enumeration value="502"/>
 *             &lt;enumeration value="503"/>
 *             &lt;enumeration value="504"/>
 *             &lt;enumeration value="511"/>
 *             &lt;enumeration value="512"/>
 *             &lt;enumeration value="513"/>
 *             &lt;enumeration value="514"/>
 *             &lt;enumeration value="515"/>
 *             &lt;enumeration value="516"/>
 *             &lt;enumeration value="531"/>
 *             &lt;enumeration value="520"/>
 *             &lt;enumeration value="521"/>
 *             &lt;enumeration value="522"/>
 *             &lt;enumeration value="523"/>
 *             &lt;enumeration value="530"/>
 *             &lt;enumeration value="532"/>
 *             &lt;enumeration value="992"/>
 *             &lt;enumeration value="993"/>
 *             &lt;enumeration value="994"/>
 *             &lt;enumeration value="995"/>
 *             &lt;enumeration value="990"/>
 *             &lt;enumeration value="991"/>
 *             &lt;enumeration value="771"/>
 *             &lt;enumeration value="205"/>
 *             &lt;enumeration value="206"/>
 *             &lt;enumeration value="207"/>
 *             &lt;enumeration value="032"/>
 *             &lt;enumeration value="524"/>
 *             &lt;enumeration value="730"/>
 *             &lt;enumeration value="050"/>
 *             &lt;enumeration value="055"/>
 *             &lt;enumeration value="404"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NARR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SNDR_REF" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ACTION" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="RESEND">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Y"/>
 *             &lt;enumeration value="N"/>
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
@XmlType(name = "", propOrder = {
    "cshadvice",
    "cshpriority",
    "cancelconf",
    "resreq",
    "repreq",
    "rep",
    "lcnotifs",
    "rtep",
    "im",
    "dep",
    "undw",
    "cshtransfer",
    "consigntinst",
    "consigntnote",
    "presentationnote",
    "rdmpnote",
    "reiinst",
    "reinote",
    "erinst",
    "reminst",
    "nprdminst",
    "npwdinst",
    "invacctinfoinst",
    "mortgageregex",
    "mortgagerelex",
    "mortgageselreg",
    "mortgagebuysel",
    "openrepo",
    "closerepo",
    "modrepo",
    "brkrepo",
    "secstlm",
    "oat",
    "secblk",
    "cshnotice",
    "lcnotifa",
    "lcnotifk",
    "cshadvice1",
    "fltrans",
    "stquery",
    "basinfo",
    "reginfo",
    "payinfo",
    "dvpundw",
    "dvpcshtrs",
    "sectrans",
    "transstnot",
    "inht",
    "court",
    "pymlist",
    "pymsn",
    "pymnot",
    "rmexchange",
    "rmrelex",
    "rmregex",
    "acctmov",
    "lcnotifrm",
    "rinfo",
    "vmun",
    "hli",
    "brostlm",
    "consreiinst",
    "consreinote",
    "depfnb",
    "depfnbnote",
    "issuerateinfoinst"
})
@XmlRootElement(name = "BCSSMESSAGE")
public class BCSSMESSAGE {



    @XmlElement(name = "CANCEL_CONF")
    protected CANCELCONF cancelconf;
    @XmlElement(name = "RES_REQ")
    protected RESREQ resreq;



    @XmlElement(name = "RTEP")
    protected RTEP rtep;
    @XmlElement(name = "IM")
    protected IM im;


    @XmlElement(name = "CSH_TRANSFER")
    protected CSHTRANSFER cshtransfer;

    @XmlElement(name = "CONSIGNT_NOTE")
    protected CONSIGNTNOTE consigntnote;
    @XmlElement(name = "PRESENTATION_NOTE")
    protected PRESENTATIONNOTE presentationnote;
    @XmlElement(name = "RDMP_NOTE")
    protected RDMPNOTE rdmpnote;

    @XmlElement(name = "REI_NOTE")
    protected REINOTE reinote;

    @XmlElement(name = "REM_INST")
    protected REMINST reminst;
    @XmlElement(name = "NPRDM_INST")
    protected NPRDMINST nprdminst;
    @XmlElement(name = "NPWD_INST")
    protected NPWDINST npwdinst;
    @XmlElement(name = "INVACCTINFO_INST")
    protected INVACCTINFOINST invacctinfoinst;


    @XmlElement(name = "MORTGAGE_SELREG")
    protected MORTGAGESELREG mortgageselreg;
    @XmlElement(name = "MORTGAGE_BUYSEL")
    protected MORTGAGEBUYSEL mortgagebuysel;



    @XmlElement(name = "BRK_REPO")
    protected BRKREPO brkrepo;

    @XmlElement(name = "OAT")
    protected OAT oat;

    @XmlElement(name = "CSH_NOTICE")
    protected CSHNOTICE cshnotice;
    @XmlElement(name = "LC_NOTIFA")
    protected LCNOTIFA lcnotifa;
    @XmlElement(name = "LC_NOTIFK")
    protected LCNOTIFK lcnotifk;
    @XmlElement(name = "CSH_ADVICE1")
    protected CSHADVICE1 cshadvice1;
    @XmlElement(name = "FL_TRANS")
    protected FLTRANS fltrans;
    @XmlElement(name = "ST_QUERY")
    protected STQUERY stquery;
    @XmlElement(name = "BAS_INFO")
    protected BASINFO basinfo;
    @XmlElement(name = "REG_INFO")
    protected REGINFO reginfo;
    @XmlElement(name = "PAY_INFO")
    protected PAYINFO payinfo;
    @XmlElement(name = "DVP_UNDW")
    protected DVPUNDW dvpundw;
    @XmlElement(name = "DVP_CSH_TRS")
    protected DVPCSHTRS dvpcshtrs;
    @XmlElement(name = "SEC_TRANS")
    protected SECTRANS sectrans;
    @XmlElement(name = "TRANS_STNOT")
    protected TRANSSTNOT transstnot;
    @XmlElement(name = "INHT")
    protected INHT inht;
    @XmlElement(name = "COURT")
    protected COURT court;
    @XmlElement(name = "PYM_LIST")
    protected PYMLIST pymlist;
    @XmlElement(name = "PYM_SN")
    protected PYMSN pymsn;
    @XmlElement(name = "PYM_NOT")
    protected PYMNOT pymnot;
    @XmlElement(name = "RM_EXCHANGE")
    protected RMEXCHANGE rmexchange;
    @XmlElement(name = "RM_RELEX")
    protected RMRELEX rmrelex;
    @XmlElement(name = "RM_REGEX")
    protected RMREGEX rmregex;
    @XmlElement(name = "ACCT_MOV")
    protected ACCTMOV acctmov;
    @XmlElement(name = "LC_NOTIFRM")
    protected LCNOTIFRM lcnotifrm;
    @XmlElement(name = "R_INFO")
    protected RINFO rinfo;
    @XmlElement(name = "VMUN")
    protected VMUN vmun;
    @XmlElement(name = "HLI")
    protected HLI hli;
    @XmlElement(name = "BRO_STLM")
    protected BROSTLM brostlm;
    @XmlElement(name = "CONS_REI_INST")
    protected CONSREIINST consreiinst;
    @XmlElement(name = "CONS_REI_NOTE")
    protected CONSREINOTE consreinote;
    @XmlElement(name = "DEP_FNB")
    protected DEPFNB depfnb;
    @XmlElement(name = "DEP_FNB_NOTE")
    protected DEPFNBNOTE depfnbnote;
    @XmlElement(name = "ISSUERATEINFO_INST")
    protected ISSUERATEINFOINST issuerateinfoinst;
    
 

    /**
     * Gets the value of the cancelconf property.
     * 
     * @return
     *     possible object is
     *     {@link CANCELCONF }
     *     
     */
    public CANCELCONF getCANCELCONF() {
        return cancelconf;
    }

    /**
     * Sets the value of the cancelconf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CANCELCONF }
     *     
     */
    public void setCANCELCONF(CANCELCONF value) {
        this.cancelconf = value;
    }

    /**
     * Gets the value of the resreq property.
     * 
     * @return
     *     possible object is
     *     {@link RESREQ }
     *     
     */
    public RESREQ getRESREQ() {
        return resreq;
    }

    /**
     * Sets the value of the resreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RESREQ }
     *     
     */
    public void setRESREQ(RESREQ value) {
        this.resreq = value;
    }
 
    /**
     * Gets the value of the rtep property.
     * 
     * @return
     *     possible object is
     *     {@link RTEP }
     *     
     */
    public RTEP getRTEP() {
        return rtep;
    }

    /**
     * Sets the value of the rtep property.
     * 
     * @param value
     *     allowed object is
     *     {@link RTEP }
     *     
     */
    public void setRTEP(RTEP value) {
        this.rtep = value;
    }

    /**
     * Gets the value of the im property.
     * 
     * @return
     *     possible object is
     *     {@link IM }
     *     
     */
    public IM getIM() {
        return im;
    }

    /**
     * Sets the value of the im property.
     * 
     * @param value
     *     allowed object is
     *     {@link IM }
     *     
     */
    public void setIM(IM value) {
        this.im = value;
    }

    /**
     * Gets the value of the cshtransfer property.
     * 
     * @return
     *     possible object is
     *     {@link CSHTRANSFER }
     *     
     */
    public CSHTRANSFER getCSHTRANSFER() {
        return cshtransfer;
    }

    /**
     * Sets the value of the cshtransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSHTRANSFER }
     *     
     */
    public void setCSHTRANSFER(CSHTRANSFER value) {
        this.cshtransfer = value;
    }

    /**
     * Gets the value of the consigntnote property.
     * 
     * @return
     *     possible object is
     *     {@link CONSIGNTNOTE }
     *     
     */
    public CONSIGNTNOTE getCONSIGNTNOTE() {
        return consigntnote;
    }

    /**
     * Sets the value of the consigntnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSIGNTNOTE }
     *     
     */
    public void setCONSIGNTNOTE(CONSIGNTNOTE value) {
        this.consigntnote = value;
    }

    /**
     * Gets the value of the presentationnote property.
     * 
     * @return
     *     possible object is
     *     {@link PRESENTATIONNOTE }
     *     
     */
    public PRESENTATIONNOTE getPRESENTATIONNOTE() {
        return presentationnote;
    }

    /**
     * Sets the value of the presentationnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRESENTATIONNOTE }
     *     
     */
    public void setPRESENTATIONNOTE(PRESENTATIONNOTE value) {
        this.presentationnote = value;
    }

    /**
     * Gets the value of the rdmpnote property.
     * 
     * @return
     *     possible object is
     *     {@link RDMPNOTE }
     *     
     */
    public RDMPNOTE getRDMPNOTE() {
        return rdmpnote;
    }

    /**
     * Sets the value of the rdmpnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link RDMPNOTE }
     *     
     */
    public void setRDMPNOTE(RDMPNOTE value) {
        this.rdmpnote = value;
    }

    /**
     * Gets the value of the reinote property.
     * 
     * @return
     *     possible object is
     *     {@link REINOTE }
     *     
     */
    public REINOTE getREINOTE() {
        return reinote;
    }

    /**
     * Sets the value of the reinote property.
     * 
     * @param value
     *     allowed object is
     *     {@link REINOTE }
     *     
     */
    public void setREINOTE(REINOTE value) {
        this.reinote = value;
    }

    /**
     * Gets the value of the reminst property.
     * 
     * @return
     *     possible object is
     *     {@link REMINST }
     *     
     */
    public REMINST getREMINST() {
        return reminst;
    }

    /**
     * Sets the value of the reminst property.
     * 
     * @param value
     *     allowed object is
     *     {@link REMINST }
     *     
     */
    public void setREMINST(REMINST value) {
        this.reminst = value;
    }

    /**
     * Gets the value of the nprdminst property.
     * 
     * @return
     *     possible object is
     *     {@link NPRDMINST }
     *     
     */
    public NPRDMINST getNPRDMINST() {
        return nprdminst;
    }

    /**
     * Sets the value of the nprdminst property.
     * 
     * @param value
     *     allowed object is
     *     {@link NPRDMINST }
     *     
     */
    public void setNPRDMINST(NPRDMINST value) {
        this.nprdminst = value;
    }

    /**
     * Gets the value of the npwdinst property.
     * 
     * @return
     *     possible object is
     *     {@link NPWDINST }
     *     
     */
    public NPWDINST getNPWDINST() {
        return npwdinst;
    }

    /**
     * Sets the value of the npwdinst property.
     * 
     * @param value
     *     allowed object is
     *     {@link NPWDINST }
     *     
     */
    public void setNPWDINST(NPWDINST value) {
        this.npwdinst = value;
    }

    /**
     * Gets the value of the invacctinfoinst property.
     * 
     * @return
     *     possible object is
     *     {@link INVACCTINFOINST }
     *     
     */
    public INVACCTINFOINST getINVACCTINFOINST() {
        return invacctinfoinst;
    }

    /**
     * Sets the value of the invacctinfoinst property.
     * 
     * @param value
     *     allowed object is
     *     {@link INVACCTINFOINST }
     *     
     */
    public void setINVACCTINFOINST(INVACCTINFOINST value) {
        this.invacctinfoinst = value;
    } 

    /**
     * Gets the value of the mortgageselreg property.
     * 
     * @return
     *     possible object is
     *     {@link MORTGAGESELREG }
     *     
     */
    public MORTGAGESELREG getMORTGAGESELREG() {
        return mortgageselreg;
    }

    /**
     * Sets the value of the mortgageselreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MORTGAGESELREG }
     *     
     */
    public void setMORTGAGESELREG(MORTGAGESELREG value) {
        this.mortgageselreg = value;
    }

    /**
     * Gets the value of the mortgagebuysel property.
     * 
     * @return
     *     possible object is
     *     {@link MORTGAGEBUYSEL }
     *     
     */
    public MORTGAGEBUYSEL getMORTGAGEBUYSEL() {
        return mortgagebuysel;
    }

    /**
     * Sets the value of the mortgagebuysel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MORTGAGEBUYSEL }
     *     
     */
    public void setMORTGAGEBUYSEL(MORTGAGEBUYSEL value) {
        this.mortgagebuysel = value;
    }
 
    /**
     * Gets the value of the brkrepo property.
     * 
     * @return
     *     possible object is
     *     {@link BRKREPO }
     *     
     */
    public BRKREPO getBRKREPO() {
        return brkrepo;
    }

    /**
     * Sets the value of the brkrepo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BRKREPO }
     *     
     */
    public void setBRKREPO(BRKREPO value) {
        this.brkrepo = value;
    }

    /**
     * Gets the value of the oat property.
     * 
     * @return
     *     possible object is
     *     {@link OAT }
     *     
     */
    public OAT getOAT() {
        return oat;
    }

    /**
     * Sets the value of the oat property.
     * 
     * @param value
     *     allowed object is
     *     {@link OAT }
     *     
     */
    public void setOAT(OAT value) {
        this.oat = value;
    } 

    /**
     * Gets the value of the cshnotice property.
     * 
     * @return
     *     possible object is
     *     {@link CSHNOTICE }
     *     
     */
    public CSHNOTICE getCSHNOTICE() {
        return cshnotice;
    }

    /**
     * Sets the value of the cshnotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSHNOTICE }
     *     
     */
    public void setCSHNOTICE(CSHNOTICE value) {
        this.cshnotice = value;
    }

    /**
     * Gets the value of the lcnotifa property.
     * 
     * @return
     *     possible object is
     *     {@link LCNOTIFA }
     *     
     */
    public LCNOTIFA getLCNOTIFA() {
        return lcnotifa;
    }

    /**
     * Sets the value of the lcnotifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link LCNOTIFA }
     *     
     */
    public void setLCNOTIFA(LCNOTIFA value) {
        this.lcnotifa = value;
    }

    /**
     * Gets the value of the lcnotifk property.
     * 
     * @return
     *     possible object is
     *     {@link LCNOTIFK }
     *     
     */
    public LCNOTIFK getLCNOTIFK() {
        return lcnotifk;
    }

    /**
     * Sets the value of the lcnotifk property.
     * 
     * @param value
     *     allowed object is
     *     {@link LCNOTIFK }
     *     
     */
    public void setLCNOTIFK(LCNOTIFK value) {
        this.lcnotifk = value;
    }

    /**
     * Gets the value of the cshadvice1 property.
     * 
     * @return
     *     possible object is
     *     {@link CSHADVICE1 }
     *     
     */
    public CSHADVICE1 getCSHADVICE1() {
        return cshadvice1;
    }

    /**
     * Sets the value of the cshadvice1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSHADVICE1 }
     *     
     */
    public void setCSHADVICE1(CSHADVICE1 value) {
        this.cshadvice1 = value;
    }

    /**
     * Gets the value of the fltrans property.
     * 
     * @return
     *     possible object is
     *     {@link FLTRANS }
     *     
     */
    public FLTRANS getFLTRANS() {
        return fltrans;
    }

    /**
     * Sets the value of the fltrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLTRANS }
     *     
     */
    public void setFLTRANS(FLTRANS value) {
        this.fltrans = value;
    }

    /**
     * Gets the value of the stquery property.
     * 
     * @return
     *     possible object is
     *     {@link STQUERY }
     *     
     */
    public STQUERY getSTQUERY() {
        return stquery;
    }

    /**
     * Sets the value of the stquery property.
     * 
     * @param value
     *     allowed object is
     *     {@link STQUERY }
     *     
     */
    public void setSTQUERY(STQUERY value) {
        this.stquery = value;
    }

    /**
     * Gets the value of the basinfo property.
     * 
     * @return
     *     possible object is
     *     {@link BASINFO }
     *     
     */
    public BASINFO getBASINFO() {
        return basinfo;
    }

    /**
     * Sets the value of the basinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BASINFO }
     *     
     */
    public void setBASINFO(BASINFO value) {
        this.basinfo = value;
    }

    /**
     * Gets the value of the reginfo property.
     * 
     * @return
     *     possible object is
     *     {@link REGINFO }
     *     
     */
    public REGINFO getREGINFO() {
        return reginfo;
    }

    /**
     * Sets the value of the reginfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link REGINFO }
     *     
     */
    public void setREGINFO(REGINFO value) {
        this.reginfo = value;
    }

    /**
     * Gets the value of the payinfo property.
     * 
     * @return
     *     possible object is
     *     {@link PAYINFO }
     *     
     */
    public PAYINFO getPAYINFO() {
        return payinfo;
    }

    /**
     * Sets the value of the payinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAYINFO }
     *     
     */
    public void setPAYINFO(PAYINFO value) {
        this.payinfo = value;
    }

    /**
     * Gets the value of the dvpundw property.
     * 
     * @return
     *     possible object is
     *     {@link DVPUNDW }
     *     
     */
    public DVPUNDW getDVPUNDW() {
        return dvpundw;
    }

    /**
     * Sets the value of the dvpundw property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVPUNDW }
     *     
     */
    public void setDVPUNDW(DVPUNDW value) {
        this.dvpundw = value;
    }

    /**
     * Gets the value of the dvpcshtrs property.
     * 
     * @return
     *     possible object is
     *     {@link DVPCSHTRS }
     *     
     */
    public DVPCSHTRS getDVPCSHTRS() {
        return dvpcshtrs;
    }

    /**
     * Sets the value of the dvpcshtrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DVPCSHTRS }
     *     
     */
    public void setDVPCSHTRS(DVPCSHTRS value) {
        this.dvpcshtrs = value;
    }

    /**
     * Gets the value of the sectrans property.
     * 
     * @return
     *     possible object is
     *     {@link SECTRANS }
     *     
     */
    public SECTRANS getSECTRANS() {
        return sectrans;
    }

    /**
     * Sets the value of the sectrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECTRANS }
     *     
     */
    public void setSECTRANS(SECTRANS value) {
        this.sectrans = value;
    }

    /**
     * Gets the value of the transstnot property.
     * 
     * @return
     *     possible object is
     *     {@link TRANSSTNOT }
     *     
     */
    public TRANSSTNOT getTRANSSTNOT() {
        return transstnot;
    }

    /**
     * Sets the value of the transstnot property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRANSSTNOT }
     *     
     */
    public void setTRANSSTNOT(TRANSSTNOT value) {
        this.transstnot = value;
    }

    /**
     * Gets the value of the inht property.
     * 
     * @return
     *     possible object is
     *     {@link INHT }
     *     
     */
    public INHT getINHT() {
        return inht;
    }

    /**
     * Sets the value of the inht property.
     * 
     * @param value
     *     allowed object is
     *     {@link INHT }
     *     
     */
    public void setINHT(INHT value) {
        this.inht = value;
    }

    /**
     * Gets the value of the court property.
     * 
     * @return
     *     possible object is
     *     {@link COURT }
     *     
     */
    public COURT getCOURT() {
        return court;
    }

    /**
     * Sets the value of the court property.
     * 
     * @param value
     *     allowed object is
     *     {@link COURT }
     *     
     */
    public void setCOURT(COURT value) {
        this.court = value;
    }

    /**
     * Gets the value of the pymlist property.
     * 
     * @return
     *     possible object is
     *     {@link PYMLIST }
     *     
     */
    public PYMLIST getPYMLIST() {
        return pymlist;
    }

    /**
     * Sets the value of the pymlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link PYMLIST }
     *     
     */
    public void setPYMLIST(PYMLIST value) {
        this.pymlist = value;
    }

    /**
     * Gets the value of the pymsn property.
     * 
     * @return
     *     possible object is
     *     {@link PYMSN }
     *     
     */
    public PYMSN getPYMSN() {
        return pymsn;
    }

    /**
     * Sets the value of the pymsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PYMSN }
     *     
     */
    public void setPYMSN(PYMSN value) {
        this.pymsn = value;
    }

    /**
     * Gets the value of the pymnot property.
     * 
     * @return
     *     possible object is
     *     {@link PYMNOT }
     *     
     */
    public PYMNOT getPYMNOT() {
        return pymnot;
    }

    /**
     * Sets the value of the pymnot property.
     * 
     * @param value
     *     allowed object is
     *     {@link PYMNOT }
     *     
     */
    public void setPYMNOT(PYMNOT value) {
        this.pymnot = value;
    }

    /**
     * Gets the value of the rmexchange property.
     * 
     * @return
     *     possible object is
     *     {@link RMEXCHANGE }
     *     
     */
    public RMEXCHANGE getRMEXCHANGE() {
        return rmexchange;
    }

    /**
     * Sets the value of the rmexchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMEXCHANGE }
     *     
     */
    public void setRMEXCHANGE(RMEXCHANGE value) {
        this.rmexchange = value;
    }

    /**
     * Gets the value of the rmrelex property.
     * 
     * @return
     *     possible object is
     *     {@link RMRELEX }
     *     
     */
    public RMRELEX getRMRELEX() {
        return rmrelex;
    }

    /**
     * Sets the value of the rmrelex property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMRELEX }
     *     
     */
    public void setRMRELEX(RMRELEX value) {
        this.rmrelex = value;
    }

    /**
     * Gets the value of the rmregex property.
     * 
     * @return
     *     possible object is
     *     {@link RMREGEX }
     *     
     */
    public RMREGEX getRMREGEX() {
        return rmregex;
    }

    /**
     * Sets the value of the rmregex property.
     * 
     * @param value
     *     allowed object is
     *     {@link RMREGEX }
     *     
     */
    public void setRMREGEX(RMREGEX value) {
        this.rmregex = value;
    }

    /**
     * Gets the value of the acctmov property.
     * 
     * @return
     *     possible object is
     *     {@link ACCTMOV }
     *     
     */
    public ACCTMOV getACCTMOV() {
        return acctmov;
    }

    /**
     * Sets the value of the acctmov property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACCTMOV }
     *     
     */
    public void setACCTMOV(ACCTMOV value) {
        this.acctmov = value;
    }

    /**
     * Gets the value of the lcnotifrm property.
     * 
     * @return
     *     possible object is
     *     {@link LCNOTIFRM }
     *     
     */
    public LCNOTIFRM getLCNOTIFRM() {
        return lcnotifrm;
    }

    /**
     * Sets the value of the lcnotifrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LCNOTIFRM }
     *     
     */
    public void setLCNOTIFRM(LCNOTIFRM value) {
        this.lcnotifrm = value;
    }

    /**
     * Gets the value of the rinfo property.
     * 
     * @return
     *     possible object is
     *     {@link RINFO }
     *     
     */
    public RINFO getRINFO() {
        return rinfo;
    }

    /**
     * Sets the value of the rinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RINFO }
     *     
     */
    public void setRINFO(RINFO value) {
        this.rinfo = value;
    }

    /**
     * Gets the value of the vmun property.
     * 
     * @return
     *     possible object is
     *     {@link VMUN }
     *     
     */
    public VMUN getVMUN() {
        return vmun;
    }

    /**
     * Sets the value of the vmun property.
     * 
     * @param value
     *     allowed object is
     *     {@link VMUN }
     *     
     */
    public void setVMUN(VMUN value) {
        this.vmun = value;
    }

    /**
     * Gets the value of the hli property.
     * 
     * @return
     *     possible object is
     *     {@link HLI }
     *     
     */
    public HLI getHLI() {
        return hli;
    }

    /**
     * Sets the value of the hli property.
     * 
     * @param value
     *     allowed object is
     *     {@link HLI }
     *     
     */
    public void setHLI(HLI value) {
        this.hli = value;
    }

    /**
     * Gets the value of the brostlm property.
     * 
     * @return
     *     possible object is
     *     {@link BROSTLM }
     *     
     */
    public BROSTLM getBROSTLM() {
        return brostlm;
    }

    /**
     * Sets the value of the brostlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BROSTLM }
     *     
     */
    public void setBROSTLM(BROSTLM value) {
        this.brostlm = value;
    }

    /**
     * Gets the value of the consreiinst property.
     * 
     * @return
     *     possible object is
     *     {@link CONSREIINST }
     *     
     */
    public CONSREIINST getCONSREIINST() {
        return consreiinst;
    }

    /**
     * Sets the value of the consreiinst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSREIINST }
     *     
     */
    public void setCONSREIINST(CONSREIINST value) {
        this.consreiinst = value;
    }

    /**
     * Gets the value of the consreinote property.
     * 
     * @return
     *     possible object is
     *     {@link CONSREINOTE }
     *     
     */
    public CONSREINOTE getCONSREINOTE() {
        return consreinote;
    }

    /**
     * Sets the value of the consreinote property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONSREINOTE }
     *     
     */
    public void setCONSREINOTE(CONSREINOTE value) {
        this.consreinote = value;
    }

    /**
     * Gets the value of the depfnb property.
     * 
     * @return
     *     possible object is
     *     {@link DEPFNB }
     *     
     */
    public DEPFNB getDEPFNB() {
        return depfnb;
    }

    /**
     * Sets the value of the depfnb property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEPFNB }
     *     
     */
    public void setDEPFNB(DEPFNB value) {
        this.depfnb = value;
    }

    /**
     * Gets the value of the depfnbnote property.
     * 
     * @return
     *     possible object is
     *     {@link DEPFNBNOTE }
     *     
     */
    public DEPFNBNOTE getDEPFNBNOTE() {
        return depfnbnote;
    }

    /**
     * Sets the value of the depfnbnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEPFNBNOTE }
     *     
     */
    public void setDEPFNBNOTE(DEPFNBNOTE value) {
        this.depfnbnote = value;
    }

    /**
     * Gets the value of the issuerateinfoinst property.
     * 
     * @return
     *     possible object is
     *     {@link ISSUERATEINFOINST }
     *     
     */
    public ISSUERATEINFOINST getISSUERATEINFOINST() {
        return issuerateinfoinst;
    }

    /**
     * Sets the value of the issuerateinfoinst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISSUERATEINFOINST }
     *     
     */
    public void setISSUERATEINFOINST(ISSUERATEINFOINST value) {
        this.issuerateinfoinst = value;
    }

}