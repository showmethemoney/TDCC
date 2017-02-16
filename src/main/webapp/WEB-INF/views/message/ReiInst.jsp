<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="reiInst" /></title>
</head>
<body>
<body>
	<h3>Welcome, Enter The Employee Details</h3>
	<form:form method="POST" action="ReiInst" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th><spring:message code="reiInst" /></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><form:label path="msgtype"><spring:message code="bcssmessage.msgtype" /></form:label></td>
					<td><form:select path="msgtype">
							<form:options items="${msgTypes}" />
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="action"><spring:message code="bcssmessage.action" /></form:label></td>
					<td><form:select path="action">
							<form:options items="${actions}" />
						</form:select>
					</td>
				</tr>
							
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secUnitsLeg.units"><spring:message code="reiInst.secLeg.secGenLeg.secUnitsLeg.units" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secUnitsLeg.units" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secUnitsLeg.uval"><spring:message code="reiInst.secLeg.secGenLeg.secUnitsLeg.uval" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secUnitsLeg.uval" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshccy"><spring:message code="reiInst.secLeg.secGenLeg.frstLeg.cshLeg.cshccy" /></form:label></td>
					<td>
						<form:select path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshccy"> 
							<form:option value="TWD" label="TWD"/>
							<form:option value="USD" label="USD"/>
							<form:option value="AUD" label="AUD"/>
							<form:option value="EUR" label="EUR"/>
							<form:option value="JPY" label="JPY"/>
							<form:option value="CNY" label="CNY"/>
							<form:option value="ZAR" label="ZAR"/> 
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshamt"><spring:message code="reiInst.secLeg.secGenLeg.frstLeg.cshLeg.cshamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.afttaxamt"><spring:message code="reiInst.secLeg.secGenLeg.frstLeg.cshLeg.afttaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.remitfee"><spring:message code="reiInst.secLeg.secGenLeg.frstLeg.cshLeg.remitfee" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.remitfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.taxamt"><spring:message code="reiInst.secLeg.secGenLeg.frstLeg.taxImp.taxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.taxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.rdmptaxamt"><spring:message code="reiInst.secLeg.secGenLeg.frstLeg.taxImp.rdmptaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.rdmptaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.clsdtaxamt"><spring:message code="reiInst.secLeg.secGenLeg.frstLeg.taxImp.clsdtaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.clsdtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.futtaxamt"><spring:message code="reiInst.secLeg.secGenLeg.frstLeg.taxImp.futtaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.futtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshccy"><spring:message code="reiInst.secLeg.secGenLeg.scndLeg.cshLeg.cshccy" /></form:label></td>
					<td>
						<form:select path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshccy"> 
							<form:option value="TWD" label="TWD"/>
							<form:option value="USD" label="USD"/>
							<form:option value="AUD" label="AUD"/>
							<form:option value="EUR" label="EUR"/>
							<form:option value="JPY" label="JPY"/>
							<form:option value="CNY" label="CNY"/>
							<form:option value="ZAR" label="ZAR"/> 
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshamt"><spring:message code="reiInst.secLeg.secGenLeg.scndLeg.cshLeg.cshamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.afttaxamt"><spring:message code="reiInst.secLeg.secGenLeg.scndLeg.cshLeg.afttaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.remitfee"><spring:message code="reiInst.secLeg.secGenLeg.scndLeg.cshLeg.remitfee" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.remitfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.taxamt"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.taxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.rdmptaxamt"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.rdmptaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.clsdtaxamt"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.clsdtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.futtaxamt"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.futtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.price"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.price" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.idays"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.idays" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.accint"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.accint" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.accinttax"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.accinttax" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.genid"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.genid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secamt"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.isin"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.secLeg.isin" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.mgcntrid"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.secLeg.mgcntrid" /></td>
				</tr>

				<tr>
					<td><form:label path="body.cshLeg.cshccy"><spring:message code="reiInst." /></form:label></td>
					<td><form:select path="body.cshLeg.cshccy"> 
							<form:option value="TWD" label="TWD"/>
							<form:option value="USD" label="USD"/>
							<form:option value="AUD" label="AUD"/>
							<form:option value="EUR" label="EUR"/>
							<form:option value="JPY" label="JPY"/>
							<form:option value="CNY" label="CNY"/>
							<form:option value="ZAR" label="ZAR"/> 
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.cshLeg.cshamt"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshLeg.afttaxamt"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshLeg.remitfee"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.cshLeg.remitfee" /></td>
				</tr>

				<tr>
					<td><form:label path="body.receiverBank.cshLeg.cshccy"><spring:message code="reiInst." /></form:label></td>
					<td><form:select path="body.receiverBank.cshLeg.cshccy"> 
							<form:option value="TWD" label="TWD"/>
							<form:option value="USD" label="USD"/>
							<form:option value="AUD" label="AUD"/>
							<form:option value="EUR" label="EUR"/>
							<form:option value="JPY" label="JPY"/>
							<form:option value="CNY" label="CNY"/>
							<form:option value="ZAR" label="ZAR"/> 
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.cshLeg.cshamt"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.receiverBank.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.cshLeg.afttaxamt"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.receiverBank.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.cshLeg.remitfee"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.receiverBank.cshLeg.remitfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.id"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.receiverBank.id" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.bnfynm"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.receiverBank.bnfynm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.acctid"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.receiverBank.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.swift"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.receiverBank.swift" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.orgsndrref"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.receiverBank.orgsndrref" /></td>
				</tr>

				<tr>
					<td><form:label path="body.stlmprty.prtyid"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.stlmprty.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmprty.acctid"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.stlmprty.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmprty.acctnm"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.stlmprty.acctnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmprty.invscshacct"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.stlmprty.invscshacct" /></td>
				</tr>

				<tr>
					<td><form:label path="body.reiisin"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.reiisin" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmdt"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.stlmdt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.bsprc"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.bsprc" /></td>
				</tr>
				<tr>
					<td><form:label path="body.rdmptaxamt"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.rdmptaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.trdrt"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.trdrt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshsys"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.cshsys" /></td>
				</tr>
				<tr>
					<td><form:label path="body.undfee"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.undfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cnsfee"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.cnsfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.gutfee"><spring:message code="reiInst." /></form:label></td>
					<td><form:input path="body.gutfee" /></td>
				</tr>

				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</body>

</html>