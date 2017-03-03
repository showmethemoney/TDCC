<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title><spring:message code="mortgageRegex" /></title>
</head>
<body>
<body>
	<form:form method="POST" action="MortgageRegex" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th><spring:message code="mortgageRegex" /></th>
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
					<td><form:label path="body.prty.stlmprty.prtyid"><spring:message code="mortgageRegex.prty.stlmprty.prtyid" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.acctid"><spring:message code="mortgageRegex.prty.stlmprty.acctid" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.acctnm"><spring:message code="mortgageRegex.prty.stlmprty.acctnm" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.acctnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.invscshacct"><spring:message code="mortgageRegex.prty.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.invscshacct" /></td>
				</tr>

				<tr>
					<td><form:label path="body.cprty.stlmprty.prtyid"><spring:message code="mortgageRegex.cprty.stlmprty.prtyid" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.acctid"><spring:message code="mortgageRegex.cprty.stlmprty.acctid" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.acctnm"><spring:message code="mortgageRegex.cprty.stlmprty.acctnm" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.acctnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.invscshacct"><spring:message code="mortgageRegex.cprty.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.invscshacct" /></td>
				</tr>


				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secUnitsLeg.units"><spring:message code="mortgageRegex.secLeg.secGenLeg.secUnitsLeg.units" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secUnitsLeg.units" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secUnitsLeg.uval"><spring:message code="mortgageRegex.secLeg.secGenLeg.secUnitsLeg.uval" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secUnitsLeg.uval" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshccy"><spring:message code="mortgageRegex.secLeg.secGenLeg.frstLeg.cshLeg.cshccy" /></form:label></td>
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
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshamt"><spring:message code="mortgageRegex.secLeg.secGenLeg.frstLeg.cshLeg.cshamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.afttaxamt"><spring:message code="mortgageRegex.secLeg.secGenLeg.frstLeg.cshLeg.afttaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.remitfee"><spring:message code="mortgageRegex.secLeg.secGenLeg.frstLeg.cshLeg.remitfee" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.remitfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.taxamt"><spring:message code="mortgageRegex.secLeg.secGenLeg.frstLeg.taxImp.taxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.taxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.rdmptaxamt"><spring:message code="mortgageRegex.secLeg.secGenLeg.frstLeg.taxImp.rdmptaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.rdmptaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.clsdtaxamt"><spring:message code="mortgageRegex.secLeg.secGenLeg.frstLeg.taxImp.clsdtaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.clsdtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.futtaxamt"><spring:message code="mortgageRegex.secLeg.secGenLeg.frstLeg.taxImp.futtaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.futtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshccy"><spring:message code="mortgageRegex.secLeg.secGenLeg.scndLeg.cshLeg.cshccy" /></form:label></td>
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
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshamt"><spring:message code="mortgageRegex.secLeg.secGenLeg.scndLeg.cshLeg.cshamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.afttaxamt"><spring:message code="mortgageRegex.secLeg.secGenLeg.scndLeg.cshLeg.afttaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.remitfee"><spring:message code="mortgageRegex.secLeg.secGenLeg.scndLeg.cshLeg.remitfee" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.remitfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.taxamt"><spring:message code="mortgageRegex.secLeg.secGenLeg.scndLeg.taxImp.taxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.taxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.rdmptaxamt"><spring:message code="mortgageRegex.secLeg.secGenLeg.scndLeg.taxImp.rdmptaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.rdmptaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.clsdtaxamt"><spring:message code="mortgageRegex.secLeg.secGenLeg.scndLeg.taxImp.clsdtaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.clsdtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.futtaxamt"><spring:message code="mortgageRegex.secLeg.secGenLeg.scndLeg.taxImp.futtaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.futtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.price"><spring:message code="mortgageRegex.secLeg.secGenLeg.bdLeg.price" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.price" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.idays"><spring:message code="mortgageRegex.secLeg.secGenLeg.bdLeg.idays" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.idays" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.accint"><spring:message code="mortgageRegex.secLeg.secGenLeg.bdLeg.accint" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.accint" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.accinttax"><spring:message code="mortgageRegex.secLeg.secGenLeg.bdLeg.accinttax" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.accinttax" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.genid"><spring:message code="mortgageRegex.secLeg.secGenLeg.genid" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.genid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secamt"><spring:message code="mortgageRegex.secLeg.secGenLeg.secamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.isin"><spring:message code="mortgageRegex.secLeg.isin" /></form:label></td>
					<td><form:input path="body.secLeg.isin" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.mgcntrid"><spring:message code="mortgageRegex.secLeg.mgcntrid" /></form:label></td>
					<td><form:input path="body.secLeg.mgcntrid" /></td>
				</tr>

				<tr>
					<td><form:label path="body.ref"><spring:message code="mortgageRegex.ref" /></form:label></td>
					<td><form:input path="body.ref" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmdt"><spring:message code="mortgageRegex.stlmdt" /></form:label></td>
					<td><form:input path="body.stlmdt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cntrid"><spring:message code="mortgageRegex.cntrid" /></form:label></td>
					<td><form:input path="body.cntrid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.dealside"><spring:message code="mortgageRegex.dealside" /></form:label></td>
					<td><form:select path="body.dealside">
							<form:option value="D"  label="D"/>
							<form:option value="R"  label="R"/> 
						</form:select>
					</td>
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