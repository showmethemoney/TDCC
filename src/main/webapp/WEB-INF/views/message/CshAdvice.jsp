<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<form:form method="POST" action="/tdcc/message/CshAdvice" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th>ConsigntInst</th>
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
					<td><form:label path="body.secLeg.secGenLeg.secUnitsLeg.units">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secUnitsLeg.units" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secUnitsLeg.uval">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secUnitsLeg.uval" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshccy">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshccy" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshamt">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.afttaxamt">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.remitfee">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.remitfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.taxamt">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.taxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.rdmptaxamt">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.rdmptaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.clsdtaxamt">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.clsdtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.futtaxamt">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.futtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshccy">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshccy" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshamt">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.afttaxamt">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.remitfee">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.remitfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.taxamt">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.taxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.rdmptaxamt">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.rdmptaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.clsdtaxamt">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.clsdtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.futtaxamt">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.futtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.price">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.price" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.idays">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.idays" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.accint">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.accint" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.bdLeg.accinttax">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.bdLeg.accinttax" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.genidx">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.genid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secamt">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.isin">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.isin" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.mgcntrid">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.mgcntrid" /></td>
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