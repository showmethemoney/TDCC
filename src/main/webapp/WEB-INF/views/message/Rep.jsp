<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title><spring:message code="rep" /></title>
<style>
.required {
	color: red;
}
</style>
</head>
<body>
<body>
	<form:form method="POST" action="Rep" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th><spring:message code="rep" /></th>
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
					<td><form:label path="body.sndrref"><span class="required">＊</span><spring:message code="rep.sndrref" /></form:label></td>
					<td><form:input path="body.sndrref" /></td>
				</tr>						
				<tr>
					<td><form:label path="body.prtyid"><span class="required">＊</span><spring:message code="rep.prtyid" /></form:label></td>
					<td><form:input path="body.prtyid" /></td>
				</tr>							
				<tr>
					<td><form:label path="body.repnm"><spring:message code="rep.repnm" /></form:label></td>
					<td><form:input path="body.repnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.repid"><span class="required">＊</span><spring:message code="rep.repid" /></form:label></td>
					<td><form:input path="body.repid" /></td>
				</tr>							
				<tr>
					<td><form:label path="body.page"><span class="required">＊</span><spring:message code="rep.page" /></form:label></td>
					<td><form:input path="body.page" /></td>
				</tr>						
				<tr>
					<td><form:label path="body.ttlpage"><span class="required">＊</span><spring:message code="rep.ttlpage" /></form:label></td>
					<td><form:input path="body.ttlpage" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmdt"><span class="required">＊</span><spring:message code="rep.stlmdt" /></form:label></td>
					<td><form:input path="body.stlmdt" /></td>
				</tr>						
				<!-- recursive RepSec -->
				<tr>
					<td><form:label path="body.repsec.secnm"><span class="required">＊</span><spring:message code="rep.repsec.secnm" /></form:label></td>
					<td><form:input path="body.repsec.secnm" /></td>
				</tr>						
				<tr>
					<td><form:label path="body.repsec.repSecVal.itemnm"><span class="required">＊</span><spring:message code="rep.repsec.repSecVal.itemnm" /></form:label></td>
					<td><form:input path="body.repsec.repSecVal.itemnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.repsec.repSecVal.itemval"><span class="required">＊</span><spring:message code="rep.repsec.repSecVal.itemval" /></form:label></td>
					<td><form:input path="body.repsec.repSecVal.itemval" /></td>
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