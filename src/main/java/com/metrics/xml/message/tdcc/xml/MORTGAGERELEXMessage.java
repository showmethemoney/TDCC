package com.metrics.xml.message.tdcc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.metrics.xml.message.tdcc.def.MORTGAGERELEX;

/**
 * 202/MEI	實行質權指令
 * 202/MR	質權塗銷指令
 * @author ethan
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "body" })
@XmlRootElement(name = "BCSSMESSAGE")
public class MORTGAGERELEXMessage
{
    @XmlElement(name = "MORTGAGE_RELEX")
    protected MORTGAGERELEX body;
}
