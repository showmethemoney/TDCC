<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title><spring:message code="repReq" /></title>
</head>
<body>
<body>
	<form:form method="POST" action="RepReq" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th><spring:message code="repReq" /></th>
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
					<td><form:label path="body.crit.critnm"><spring:message code="repReq.crit.critnm" /></form:label></td>
					<td><form:input path="body.crit.critnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.crit.critval"><spring:message code="repReq.crit.critval" /></form:label></td>
					<td><form:input path="body.crit.critval" /></td>
				</tr>

				<tr>
					<td><form:label path="body.prtyid"><spring:message code="repReq.prtyid" /></form:label></td>
					<td><form:input path="body.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.repnm"><spring:message code="repReq.repnm" /></form:label></td>
					<td><form:input path="body.repnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.repid"><spring:message code="repReq.repid" /></form:label></td>
					<td><form:input path="body.repid" /></td>
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