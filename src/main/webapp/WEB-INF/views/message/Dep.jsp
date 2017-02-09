<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Close Repo</title>
</head>
<body>
<body>
	<h3>Welcome, Enter The Employee Details</h3>
	<form:form method="POST" action="/tdcc/message/CloseRepo"
		modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th>CloseRepo</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><form:label path="body.prty.stlmprty.prtyid">Ref</form:label></td>
					<td><form:input path="body.prty.stlmprty.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.acctid">Ref</form:label></td>
					<td><form:input path="body.prty.stlmprty.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.acctnm">Ref</form:label></td>
					<td><form:input path="body.prty.stlmprty.acctnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.invscshacct">Ref</form:label></td>
					<td><form:input path="body.prty.stlmprty.invscshacct" /></td>
				</tr>

				<tr>
					<td><form:label path="body.cprty.stlmprty.prtyid">Ref</form:label></td>
					<td><form:input path="body.cprty.stlmprty.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.acctid">Ref</form:label></td>
					<td><form:input path="body.cprty.stlmprty.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.acctnm">Ref</form:label></td>
					<td><form:input path="body.cprty.stlmprty.acctnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.invscshacct">Ref</form:label></td>
					<td><form:input path="body.cprty.stlmprty.invscshacct" /></td>
				</tr>

				<tr>
					<td><form:label path="body.ref">Ref</form:label></td>
					<td><form:input path="body.ref" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cntrid">Ref</form:label></td>
					<td><form:input path="body.cntrid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshamt">Ref</form:label></td>
					<td><form:input path="body.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.xtrint">Ref</form:label></td>
					<td><form:input path="body.xtrint" /></td>
				</tr>
				<tr>
					<td><form:label path="body.bndlref">Ref</form:label></td>
					<td><form:input path="body.bndlref" /></td>
				</tr>
				<tr>
					<td><form:label path="body.bndlttl">Ref</form:label></td>
					<td><form:input path="body.bndlttl" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshsys">Ref</form:label></td>
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