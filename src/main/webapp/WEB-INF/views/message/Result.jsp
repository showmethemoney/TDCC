<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="result" /></title>
</head>
<body>
	<form:form method="POST" action="Result" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th><spring:message code="result" /></th>
				</tr>
				<tr>
					<th><spring:message code="result.reqOrigin" /></th>
					<th><spring:message code="result.reqTs" /></th>
					<th><spring:message code="result.reqBcssBusDt" /></th>
					<th><spring:message code="result.reqMsgType" /></th>
					<th><spring:message code="result.reqNarr" /></th>
					<th><spring:message code="result.reqSndrRef" /></th>
					<th><spring:message code="result.reqAction" /></th>
					<th><spring:message code="result.reqResend" /></th>
					<th><spring:message code="result.resOrigin" /></th>
					<th><spring:message code="result.resTs" /></th>
					<th><spring:message code="result.resBcssBusDt" /></th>
					<th><spring:message code="result.resMsgType" /></th>
					<th><spring:message code="result.resNarr" /></th>
					<th><spring:message code="result.resSndrRef" /></th>
					<th><spring:message code="result.resAction" /></th>
					<th><spring:message code="result.resResend" /></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="result" items="${model}">
					<tr>
						<td>${result.reqOrigin}</td>
						<td>${result.reqTs}</td>
						<td>${result.reqBcssBusDt}</td>
						<td>${result.reqMsgType}</td>
						<td>${result.reqNarr}</td>
						<td>${result.reqSndrRef}</td>
						<td>${result.reqAction}</td>
						<td>${result.reqResend}</td>
						<td>${result.respOrigin}</td>
						<td>${result.respTs}</td>
						<td>${result.respBcssBusDt}</td>
						<td>${result.respMsgType}</td>
						<td>${result.respNarr}</td>
						<td>${result.respSndrRef}</td>
						<td>${result.respAction}</td>
						<td>${result.respResend}</td>
					</tr>
				</c:forEach>
				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</html>