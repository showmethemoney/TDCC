<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Close Repo</title>
</head>
<body>
<body>
	<h3>Welcome, Enter The Employee Details</h3>
	<form:form method="POST" action="Erinst" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th>CloseRepo</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><form:label path="msgtype">Ref</form:label></td>
					<td><form:select path="msgtype">
							<form:options items="${msgTypes}" />
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="action">Ref</form:label></td>
					<td><form:select path="action">
							<form:options items="${actions}" />
						</form:select>
					</td>
				</tr>	
			
				<tr>
					<td><form:label path="body.stlmprty.prtyid">Ref</form:label></td>
					<td><form:input path="body.stlmprty.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmprty.acctid">Ref</form:label></td>
					<td><form:input path="body.stlmprty.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmprty.acctnm">Ref</form:label></td>
					<td><form:input path="body.stlmprty.acctnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmprty.invscshacct">Ref</form:label></td>
					<td><form:input path="body.stlmprty.invscshacct" /></td>
				</tr>

				<tr>
					<td><form:label path="body.isin">Ref</form:label></td>
					<td><form:input path="body.isin" /></td>
				</tr>
				<tr>
					<td><form:label path="body.fval">Ref</form:label></td>
					<td><form:input path="body.fval" /></td>
				</tr>
				<tr>
					<td><form:label path="body.issdays">Ref</form:label></td>
					<td><form:input path="body.issdays" /></td>
				</tr>
				<tr>
					<td><form:label path="body.matdt">Ref</form:label></td>
					<td><form:input path="body.matdt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.issrt">Ref</form:label></td>
					<td><form:input path="body.issrt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.bsprc">Ref</form:label></td>
					<td><form:input path="body.bsprc" /></td>
				</tr>
				<tr>
					<td><form:label path="body.taxamt">Ref</form:label></td>
					<td><form:input path="body.taxamt" /></td>
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