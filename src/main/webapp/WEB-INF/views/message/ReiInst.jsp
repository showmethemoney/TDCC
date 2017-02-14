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
	<form:form method="POST" action="ReiInst" modelAttribute="model">
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
					<td><form:label path="body.secLeg.secGenLeg.secUnitsLeg.units">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secUnitsLeg.units" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secUnitsLeg.uval">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secUnitsLeg.uval" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshccy">Ref</form:label></td>
					<td>
						<form:select path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshccy"> 
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
					<td>
						<form:select path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshccy"> 
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
					<td><form:label path="body.secLeg.secGenLeg.genid">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.genid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secamt">Ref</form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.isin">Ref</form:label></td>
					<td><form:input path="body.secLeg.isin" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.mgcntrid">Ref</form:label></td>
					<td><form:input path="body.secLeg.mgcntrid" /></td>
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
					<td><form:label path="body.reiisin">Ref</form:label></td>
					<td><form:input path="body.reiisin" /></td>
				</tr>
				<tr>
					<td><form:label path="body.stlmdt">Ref</form:label></td>
					<td><form:input path="body.stlmdt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.bsprc">Ref</form:label></td>
					<td><form:input path="body.bsprc" /></td>
				</tr>
				<tr>
					<td><form:label path="body.rdmptaxamt">Ref</form:label></td>
					<td><form:input path="body.rdmptaxamt" /></td>
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