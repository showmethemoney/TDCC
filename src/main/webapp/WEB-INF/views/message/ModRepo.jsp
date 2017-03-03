<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title><spring:message code="modRepo" /></title>
</head>
<body>
<body>
	<form:form method="POST" action="ModRepo" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th><spring:message code="modRepo" /></th>
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
					<td><form:label path="body.cshLeg.cshccy"><spring:message code="modRepo.cshLeg.cshccy" /></form:label></td>
					<td>
						<form:select path="body.cshLeg.cshccy">
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
					<td><form:label path="body.cshLeg.cshamt"><spring:message code="modRepo.cshLeg.cshamt" /></form:label></td>
					<td><form:input path="body.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshLeg.afttaxamt"><spring:message code="modRepo.cshLeg.afttaxamt" /></form:label></td>
					<td><form:input path="body.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshLeg.remitfee"><spring:message code="modRepo.cshLeg.remitfee" /></form:label></td>
					<td><form:input path="body.cshLeg.remitfee" /></td>
				</tr>

				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secUnitsLeg.units"><spring:message code="modRepo.secLeg.secGenLeg.secUnitsLeg.units" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secUnitsLeg.units" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secUnitsLeg.uval"><spring:message code="modRepo.secLeg.secGenLeg.secUnitsLeg.uval" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secUnitsLeg.uval" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshccy"><spring:message code="modRepo.secLeg.secGenLeg.frstLeg.cshLeg.cshccy" /></form:label></td>
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
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshamt"><spring:message code="modRepo.secLeg.secGenLeg.frstLeg.cshLeg.cshamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.afttaxamt"><spring:message code="modRepo.secLeg.secGenLeg.frstLeg.cshLeg.afttaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.remitfee"><spring:message code="modRepo.secLeg.secGenLeg.frstLeg.cshLeg.remitfee" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.remitfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.taxamt"><spring:message code="modRepo.secLeg.secGenLeg.frstLeg.taxImp.taxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.taxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.rdmptaxamt"><spring:message code="modRepo.secLeg.secGenLeg.frstLeg.taxImp.rdmptaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.rdmptaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.clsdtaxamt"><spring:message code="modRepo.secLeg.secGenLeg.frstLeg.taxImp.clsdtaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.clsdtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.futtaxamt"><spring:message code="modRepo.secLeg.secGenLeg.frstLeg.taxImp.futtaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.futtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshccy"><spring:message code="modRepo.secLeg.secGenLeg.scndLeg.cshLeg.cshccy" /></form:label></td>
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
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshamt"><spring:message code="modRepo.secLeg.secGenLeg.scndLeg.cshLeg.cshamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.afttaxamt"><spring:message code="modRepo.secLeg.secGenLeg.scndLeg.cshLeg.afttaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.remitfee"><spring:message code="modRepo.secLeg.secGenLeg.scndLeg.cshLeg.remitfee" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.remitfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.taxamt"><spring:message code="modRepo.secLeg.secGenLeg.scndLeg.taxImp.taxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.taxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.rdmptaxamt"><spring:message code="modRepo.secLeg.secGenLeg.scndLeg.taxImp.rdmptaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.rdmptaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.clsdtaxamt"><spring:message code="modRepo.secLeg.secGenLeg.scndLeg.taxImp.clsdtaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.clsdtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.futtaxamt"><spring:message code="modRepo.secLeg.secGenLeg.scndLeg.taxImp.futtaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.futtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.price"><spring:message code="modRepo.secLeg.secGenLeg.bdLeg.price" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.price" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.idays"><spring:message code="modRepo.secLeg.secGenLeg.bdLeg.idays" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.idays" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.accint"><spring:message code="modRepo.secLeg.secGenLeg.bdLeg.accint" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.accint" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.accinttax"><spring:message code="modRepo.secLeg.secGenLeg.bdLeg.accinttax" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.accinttax" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.genid"><spring:message code="modRepo.secLeg.secGenLeg.genid" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.genid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secamt"><spring:message code="modRepo.secLeg.secGenLeg.secamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.isin"><spring:message code="modRepo.secLeg.isin" /></form:label></td>
					<td><form:input path="body.secLeg.isin" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.mgcntrid"><spring:message code="modRepo.secLeg.mgcntrid" /></form:label></td>
					<td><form:input path="body.secLeg.mgcntrid" /></td>
				</tr>

				<tr>
					<td><form:label path="body.ref"><spring:message code="modRepo.ref" /></form:label></td>
					<td><form:input path="body.ref" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prtyid"><spring:message code="modRepo.prtyid" /></form:label></td>
					<td><form:input path="body.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprtyid"><spring:message code="modRepo.cprtyid" /></form:label></td>
					<td><form:input path="body.cprtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cntrid"><spring:message code="modRepo.cntrid" /></form:label></td>
					<td><form:input path="body.cntrid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.trdrt"><spring:message code="modRepo.trdrt" /></form:label></td>
					<td><form:input path="body.trdrt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.rpchstlmdt"><spring:message code="modRepo.rpchstlmdt" /></form:label></td>
					<td><form:input path="body.rpchstlmdt" /></td>
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