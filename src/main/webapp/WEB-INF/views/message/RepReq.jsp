<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<form:form method="POST" action="RepReq" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th>CloseRepo</th>
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
					<td><form:label path="body.crit.critnm">Ref</form:label></td>
					<td><form:input path="body.crit.critnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.crit.critval">Ref</form:label></td>
					<td><form:input path="body.crit.critval" /></td>
				</tr>

				<tr>
					<td><form:label path="body.prtyidt">Ref</form:label></td>
					<td><form:input path="body.prtyidt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.repnmt">Ref</form:label></td>
					<td><form:input path="body.repnmt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.repidt">Ref</form:label></td>
					<td><form:input path="body.repidt" /></td>
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