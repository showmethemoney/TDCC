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
			<tr>
				<td><form:label path="body.ref">Ref</form:label></td>
				<td><form:input path="body.ref" /></td>
			</tr>
			<tr>
				<td><form:label path="body.cntrid">Cntrid</form:label></td>
				<td><form:input path="body.cntrid" /></td>
			</tr>

			<tr>
				<td><form:label path="body.prty.stlmprty.prtyid">PrtyId</form:label></td>
				<td><form:input path="body.prty.stlmprty.prtyid" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</body>

</html>