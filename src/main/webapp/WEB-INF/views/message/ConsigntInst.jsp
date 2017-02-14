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
	<form:form method="POST" action="ConsigntInst" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th>ConsigntInst</th>
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
					<td><form:label path="body.cshLeg.cshccy">Ref</form:label></td>
					<td><form:select path="body.cshLeg.cshccy"> 
							<form:option value="TWD" label="TWD"/>
							<form:option value="USD" label="USD"/>
							<form:option value="AUD" label="AUD"/>
							<form:option value="EUR" label="EUR"/>
							<form:option value="JPY" label="JPY"/>
							<form:option value="CNY" label="CNY"/>
							<form:option value="ZAR" label="ZAR"/> 
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.cshLeg.cshamt">Ref</form:label></td>
					<td><form:input path="body.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshLeg.afttaxamt">Ref</form:label></td>
					<td><form:input path="body.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshLeg.remitfee">Ref</form:label></td>
					<td><form:input path="body.cshLeg.remitfee" /></td>
				</tr>

				<tr>
					<td><form:label path="body.receiverBank.cshLeg.cshccy">Ref</form:label></td>
					<td><form:select path="body.receiverBank.cshLeg.cshccy">
							<form:option value="TWD" label="TWD"/>
							<form:option value="USD" label="USD"/>
							<form:option value="AUD" label="AUD"/>
							<form:option value="EUR" label="EUR"/>
							<form:option value="JPY" label="JPY"/>
							<form:option value="CNY" label="CNY"/>
							<form:option value="ZAR" label="ZAR"/> 
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.cshLeg.cshamt">Ref</form:label></td>
					<td><form:input path="body.receiverBank.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.cshLeg.afttaxamt">Ref</form:label></td>
					<td><form:input path="body.receiverBank.cshLeg.afttaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.cshLeg.remitfee">Ref</form:label></td>
					<td><form:input path="body.receiverBank.cshLeg.remitfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.id">Ref</form:label></td>
					<td><form:input path="body.receiverBank.id" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.bnfynm">Ref</form:label></td>
					<td><form:input path="body.receiverBank.bnfynm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.acctid">Ref</form:label></td>
					<td><form:input path="body.receiverBank.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.swift">Ref</form:label></td>
					<td><form:input path="body.receiverBank.swift" /></td>
				</tr>
				<tr>
					<td><form:label path="body.receiverBank.orgsndrref">Ref</form:label></td>
					<td><form:input path="body.receiverBank.orgsndrref" /></td>
				</tr>

				<tr>
					<td><form:label path="body.prtyid">Ref</form:label></td>
					<td><form:input path="body.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.isin">Ref</form:label></td>
					<td><form:input path="body.isin" /></td>
				</tr>
				<tr>
					<td><form:label path="body.dbcshamt">Ref</form:label></td>
					<td><form:input path="body.dbcshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cnsgfee">Ref</form:label></td>
					<td><form:input path="body.cnsgfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmdt">Ref</form:label></td>
					<td><form:input path="body.stlmdt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cbid">Ref</form:label></td>
					<td><form:input path="body.cbid" /></td>
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
					<td><form:label path="body.trdrt">Ref</form:label></td>
					<td><form:input path="body.trdrt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshsys">Ref</form:label></td>
					<td><form:input path="body.cshsys" /></td>
				</tr>
				<tr>
					<td><form:label path="body.undfee">Ref</form:label></td>
					<td><form:input path="body.undfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cnsfee">Ref</form:label></td>
					<td><form:input path="body.cnsfee" /></td>
				</tr>
				<tr>
					<td><form:label path="body.gutfee">Ref</form:label></td>
					<td><form:input path="body.gutfee" /></td>
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