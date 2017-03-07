<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title><spring:message code="erinst" /></title>
<style>
.required {
	color: red;
}
</style>
</head>
<body>
<body>
	<form:form method="POST" action="Erinst" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th><spring:message code="erinst" /></th>
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
					<td><form:label path="body.isin"><span class="required">＊</span><spring:message code="erinst.isin" /></form:label></td>
					<td><form:input path="body.isin" /></td>
				</tr>			
				<tr>
					<td><form:label path="body.stlmprty.prtyid"><span class="required">＊</span><spring:message code="erinst.stlmprty.prtyid" /></form:label></td>
					<td><form:input path="body.stlmprty.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmprty.acctid"><span class="required">＊</span><spring:message code="erinst.stlmprty.acctid" /></form:label></td>
					<td><form:input path="body.stlmprty.acctid" /></td>
				</tr>			
				<tr>
					<td><form:label path="body.fval"><span class="required">＊</span><spring:message code="erinst.fval" /></form:label></td>
					<td><form:input path="body.fval" /></td>
				</tr>			
				<tr>
					<td><form:label path="body.matdt"><span class="required">＊</span><spring:message code="erinst.matdt" /></form:label></td>
					<td><form:input path="body.matdt" /></td>
				</tr>		
					<tr>
					<td><form:label path="body.issdays"><span class="required">＊</span><spring:message code="erinst.issdays" /></form:label></td>
					<td><form:input path="body.issdays" /></td>
				</tr>
				<tr>
					<td><form:label path="body.issrt"><span class="required">＊</span><spring:message code="erinst.issrt" /></form:label></td>
					<td><form:input path="body.issrt" /></td>
				</tr>		
				<tr>
					<td><form:label path="body.bsprc"><span class="required">＊</span><spring:message code="erinst.bsprc" /></form:label></td>
					<td><form:input path="body.bsprc" /></td>
				</tr>
				<tr>
					<td><form:label path="body.taxamt"><span class="required">＊</span><spring:message code="erinst.taxamt" /></form:label></td>
					<td><form:input path="body.taxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshsys"><spring:message code="erinst.cshsys" /></form:label></td>
					<td><form:input path="body.cshsys" /></td>
				</tr>			
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.stlmprty.acctnm"><spring:message code="erinst.stlmprty.acctnm" /></form:label></td> --%>
<%-- 					<td><form:input path="body.stlmprty.acctnm" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.stlmprty.invscshacct"><spring:message code="erinst.stlmprty.invscshacct" /></form:label></td> --%>
<%-- 					<td><form:input path="body.stlmprty.invscshacct" /></td> --%>
<!-- 				</tr> -->
				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</body>

</html>