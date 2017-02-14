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
	<form:form method="POST" action="Rep" modelAttribute="model">
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
					<td><form:label path="body.repsec.repSecVal.itemnm">Ref</form:label></td>
					<td><form:input path="body.repsec.repSecVal.itemnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.repsec.repSecVal.itemval">Ref</form:label></td>
					<td><form:input path="body.repsec.repSecVal.itemval" /></td>
				</tr>
				<!-- recursive RepSec -->
				<tr>
					<td><form:label path="body.repsec.secnm">Ref</form:label></td>
					<td><form:input path="body.repsec.secnm" /></td>
				</tr>

				<tr>
					<td><form:label path="body.repnm">Ref</form:label></td>
					<td><form:input path="body.repnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.repid">Ref</form:label></td>
					<td><form:input path="body.repid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prtyid">Ref</form:label></td>
					<td><form:input path="body.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.sndrref">Ref</form:label></td>
					<td><form:input path="body.sndrref" /></td>
				</tr>
				<tr>
					<td><form:label path="body.page">Ref</form:label></td>
					<td><form:input path="body.page" /></td>
				</tr>
				<tr>
					<td><form:label path="body.ttlpage">Ref</form:label></td>
					<td><form:input path="body.ttlpage" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmdt">Ref</form:label></td>
					<td><form:input path="body.stlmdt" /></td>
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