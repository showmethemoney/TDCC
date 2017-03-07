<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title><spring:message code="undw" /></title>
<style>
.required {
	color: red;
}
</style>
</head>
<body>
<body>
	<form:form method="POST" action="Undw" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th><spring:message code="undw" /></th>
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
					<td><form:label path="body.ref"><spring:message code="undw.ref" /></form:label></td>
					<td><form:input path="body.ref" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.prtyid"><span class="required">＊</span><spring:message code="undw.prty.stlmprty.prtyid" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.acctid"><span class="required">＊</span><spring:message code="undw.prty.stlmprty.acctid" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.acctnm"><spring:message code="undw.prty.stlmprty.acctnm" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.acctnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.invscshacct"><spring:message code="undw.prty.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.invscshacct" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshsys"><spring:message code="undw.cshsys" /></form:label></td>
					<td><form:input path="body.cshsys" /></td>
				</tr>
				<tr>
					<td><form:label path="body.undfee"><spring:message code="undw.undfee" /></form:label></td>
					<td><form:input path="body.undfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cnsfee"><spring:message code="undw.cnsfee" /></form:label></td>
					<td><form:input path="body.cnsfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.gutfee"><spring:message code="undw.gutfee" /></form:label></td>
					<td><form:input path="body.gutfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.prtyid"><span class="required">＊</span><spring:message code="undw.cprty.stlmprty.prtyid" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.acctid"><span class="required">＊</span><spring:message code="undw.cprty.stlmprty.acctid" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.acctnm"><spring:message code="undw.cprty.stlmprty.acctnm" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.acctnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.invscshacct"><span class="required">＊</span><spring:message code="undw.cprty.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.invscshacct" /></td>
				</tr>				
				<tr>
					<td><form:label path="body.isin"><span class="required">＊</span><spring:message code="undw.isin" /></form:label></td>
					<td><form:input path="body.isin" /></td>
				</tr>
				<tr>
					<td><form:label path="body.bsprc"><spring:message code="undw.bsprc" /></form:label></td>
					<td><form:input path="body.bsprc" /></td>
				</tr>
				<tr>
					<td><form:label path="body.taxamt"><spring:message code="undw.taxamt" /></form:label></td>
					<td><form:input path="body.taxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.underWritingPart.dnmid"><span class="required">＊</span><spring:message code="undw.underWritingPart.dnmid" /></form:label></td>
					<td><form:input path="body.underWritingPart.dnmid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.underWritingPart.rdmpsecamt"><span class="required">＊</span><spring:message code="undw.underWritingPart.rdmpsecamt" /></form:label></td>
					<td><form:input path="body.underWritingPart.rdmpsecamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.underWritingPart.taxamt"><span class="required">＊</span><spring:message code="undw.underWritingPart.taxamt" /></form:label></td>
					<td><form:input path="body.underWritingPart.taxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshLeg.cshccy"><spring:message code="undw.cshLeg.cshccy" /></form:label></td>
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
					<td><form:label path="body.cshLeg.cshamt"><span class="required">＊</span><spring:message code="undw.cshLeg.cshamt" /></form:label></td>
					<td><form:input path="body.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmdt"><span class="required">＊</span><spring:message code="undw.stlmdt" /></form:label></td>
					<td><form:input path="body.stlmdt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.trdrt"><spring:message code="undw.trdrt" /></form:label></td>
					<td><form:input path="body.trdrt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.bndlref"><spring:message code="undw.bndlref" /></form:label></td>
					<td><form:input path="body.bndlref" /></td>
				</tr>
				<tr>
					<td><form:label path="body.bndlttl"><spring:message code="undw.bndlttl" /></form:label></td>
					<td><form:input path="body.bndlttl" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.id"><spring:message code="undw.receiverBank.id" /></form:label></td>
					<td><form:input path="body.receiverBank.id" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.bnfynm"><span class="required">＊</span><spring:message code="undw.receiverBank.bnfynm" /></form:label></td>
					<td><form:input path="body.receiverBank.bnfynm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.acctid"><span class="required">＊</span><spring:message code="undw.receiverBank.acctid" /></form:label></td>
					<td><form:input path="body.receiverBank.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.swift"><spring:message code="undw.receiverBank.swift" /></form:label></td>
					<td><form:input path="body.receiverBank.swift" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshLeg.afttaxamt"><span class="required">＊</span><spring:message code="undw.cshLeg.afttaxamt" /></form:label></td>
					<td><form:input path="body.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshLeg.remitfee"><spring:message code="undw.cshLeg.remitfee" /></form:label></td>
					<td><form:input path="body.cshLeg.remitfee" /></td>
				</tr>
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.receiverBank.cshLeg.cshccy"><spring:message code="undw.receiverBank.cshLeg.cshccy" /></form:label></td> --%>
<%-- 					<td><form:select path="body.receiverBank.cshLeg.cshccy">  --%>
<%-- 							<form:option value="TWD" label="TWD"/> --%>
<%-- 							<form:option value="USD" label="USD"/> --%>
<%-- 							<form:option value="AUD" label="AUD"/> --%>
<%-- 							<form:option value="EUR" label="EUR"/> --%>
<%-- 							<form:option value="JPY" label="JPY"/> --%>
<%-- 							<form:option value="CNY" label="CNY"/> --%>
<%-- 							<form:option value="ZAR" label="ZAR"/>  --%>
<%-- 						</form:select> --%>
<!-- 					</td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.receiverBank.cshLeg.cshamt"><spring:message code="undw.receiverBank.cshLeg.cshamt" /></form:label></td> --%>
<%-- 					<td><form:input path="body.receiverBank.cshLeg.cshamt" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.receiverBank.cshLeg.afttaxamt"><spring:message code="undw.receiverBank.cshLeg.afttaxamt" /></form:label></td> --%>
<%-- 					<td><form:input path="body.receiverBank.cshLeg.afttaxamt" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.receiverBank.cshLeg.remitfee"><spring:message code="undw.receiverBank.cshLeg.remitfee" /></form:label></td> --%>
<%-- 					<td><form:input path="body.receiverBank.cshLeg.remitfee" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.receiverBank.orgsndrref"><spring:message code="undw.receiverBank.orgsndrref" /></form:label></td> --%>
<%-- 					<td><form:input path="body.receiverBank.orgsndrref" /></td> --%>
<!-- 				</tr> -->


				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</body>

</html>