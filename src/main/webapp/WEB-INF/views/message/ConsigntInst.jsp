<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="consigntInst" /></title>
</head>
<body>
<body>
	<h3>Welcome, Enter The Employee Details</h3>
	<form:form method="POST" action="ConsigntInst" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th><spring:message code="consigntInst" /></th>
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
					<td><form:label path="body.stlmprty.prtyid"><spring:message code="consigntInst.stlmprty.prtyid" /></form:label></td>
					<td><form:input path="body.stlmprty.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmprty.acctid"><spring:message code="consigntInst.stlmprty.acctid" /></form:label></td>
					<td><form:input path="body.stlmprty.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmprty.acctnm"><spring:message code="consigntInst.stlmprty.acctnm" /></form:label></td>
					<td><form:input path="body.stlmprty.acctnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmprty.invscshacct"><spring:message code="consigntInst.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.stlmprty.invscshacct" /></td>
				</tr>

				<tr>
					<td><form:label path="body.cshLeg.cshccy"><spring:message code="consigntInst.cshLeg.cshccy" /></form:label></td>
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
					<td><form:label path="body.cshLeg.cshamt"><spring:message code="consigntInst.cshLeg.cshamt" /></form:label></td>
					<td><form:input path="body.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshLeg.afttaxamt"><spring:message code="consigntInst.cshLeg.afttaxamt" /></form:label></td>
					<td><form:input path="body.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshLeg.remitfee"><spring:message code="consigntInst.cshLeg.remitfee" /></form:label></td>
					<td><form:input path="body.cshLeg.remitfee" /></td>
				</tr>

				<tr>
					<td><form:label path="body.receiverBank.cshLeg.cshccy"><spring:message code="consigntInst.receiverBank.cshLeg.cshccy" /></form:label></td>
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
					<td><form:label path="body.receiverBank.cshLeg.cshamt"><spring:message code="consigntInst.receiverBank.cshLeg.cshamt" /></form:label></td>
					<td><form:input path="body.receiverBank.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.cshLeg.afttaxamt"><spring:message code="consigntInst.receiverBank.cshLeg.afttaxamt" /></form:label></td>
					<td><form:input path="body.receiverBank.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.cshLeg.remitfee"><spring:message code="consigntInst.receiverBank.cshLeg.remitfee" /></form:label></td>
					<td><form:input path="body.receiverBank.cshLeg.remitfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.id"><spring:message code="consigntInst.receiverBank.id" /></form:label></td>
					<td><form:input path="body.receiverBank.id" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.bnfynm"><spring:message code="consigntInst.receiverBank.bnfynm" /></form:label></td>
					<td><form:input path="body.receiverBank.bnfynm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.acctid"><spring:message code="consigntInst.receiverBank.acctid" /></form:label></td>
					<td><form:input path="body.receiverBank.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.swift"><spring:message code="consigntInst.receiverBank.swift" /></form:label></td>
					<td><form:input path="body.receiverBank.swift" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.orgsndrref"><spring:message code="consigntInst.receiverBank.orgsndrref" /></form:label></td>
					<td><form:input path="body.receiverBank.orgsndrref" /></td>
				</tr>

				<tr>
					<td><form:label path="body.prtyid"><spring:message code="consigntInst.prtyid" /></form:label></td>
					<td><form:input path="body.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.isin"><spring:message code="consigntInst.isin" /></form:label></td>
					<td><form:input path="body.isin" /></td>
				</tr>
				<tr>
					<td><form:label path="body.dbcshamt"><spring:message code="consigntInst.dbcshamt" /></form:label></td>
					<td><form:input path="body.dbcshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cnsgfee"><spring:message code="consigntInst.cnsgfee" /></form:label></td>
					<td><form:input path="body.cnsgfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmdt"><spring:message code="consigntInst.stlmdt" /></form:label></td>
					<td><form:input path="body.stlmdt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cbid"><spring:message code="consigntInst.cbid" /></form:label></td>
					<td><form:input path="body.cbid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.bsprc"><spring:message code="consigntInst.bsprc" /></form:label></td>
					<td><form:input path="body.bsprc" /></td>
				</tr>
				<tr>
					<td><form:label path="body.taxamt"><spring:message code="consigntInst.taxamt" /></form:label></td>
					<td><form:input path="body.taxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.trdrt"><spring:message code="consigntInst.trdrt" /></form:label></td>
					<td><form:input path="body.trdrt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshsys"><spring:message code="consigntInst.cshsys" /></form:label></td>
					<td><form:input path="body.cshsys" /></td>
				</tr>
				<tr>
					<td><form:label path="body.undfee"><spring:message code="consigntInst.undfee" /></form:label></td>
					<td><form:input path="body.undfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cnsfee"><spring:message code="consigntInst.cnsfee" /></form:label></td>
					<td><form:input path="body.cnsfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.gutfee"><spring:message code="consigntInst.gutfee" /></form:label></td>
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