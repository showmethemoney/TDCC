<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="closeRepo" /></title>
</head>
<body>
<body>
	<form:form method="POST" action="CloseRepo" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th><spring:message code="closeRepo" /></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><form:label path="msgtype">Ref</form:label></td>
					<td><form:input path="msgtype"items="${msgTypes}" /></td>
				</tr>
				<tr>
					<td><form:label path="action">Ref</form:label></td>
					<td><form:input path="action" items="${actions}" /></td>
				</tr>
							
				<tr>
					<td><form:label path="body.prty.stlmprty.prtyid"><spring:message code="prty.stlmprty.prtyid" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.acctid"><spring:message code="prty.stlmprty.acctid" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.acctnm"><spring:message code="prty.stlmprty.acctnm" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.acctnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.invscshacct"><spring:message code="prty.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.invscshacct" /></td>
				</tr>

				<tr>
					<td><form:label path="body.cprty.stlmprty.prtyid"><spring:message code="cprty.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.acctid"><spring:message code="cprty.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.acctnm"><spring:message code="cprty.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.acctnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.invscshacct"><spring:message code="cprty.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.invscshacct" /></td>
				</tr>

				<tr>
					<td><form:label path="body.ref"><spring:message code="closeRepo.body.ref" /></form:label></td>
					<td><form:input path="body.ref" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cntrid"><spring:message code="closeRepo.body.cntrid" /></form:label></td>
					<td><form:input path="body.cntrid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshamt"><spring:message code="closeRepo.body.cshamt" /></form:label></td>
					<td><form:input path="body.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.xtrint"><spring:message code="closeRepo.body.xtrint" /></form:label></td>
					<td><form:input path="body.xtrint" /></td>
				</tr>
				<tr>
					<td><form:label path="body.bndlref"><spring:message code="closeRepo.body.bndlref" /></form:label></td>
					<td><form:input path="body.bndlref" /></td>
				</tr>
				<tr>
					<td><form:label path="body.bndlttl"><spring:message code="closeRepo.body.bndlttl" /></form:label></td>
					<td><form:input path="body.bndlttl" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshsys"><spring:message code="closeRepo.body.cshsys" /></form:label></td>
					<td><form:input path="body.cshsys" /></td>
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