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
	<form:form method="POST" action="Dep" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th>CloseRepo</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><form:label path="body.denomination.id">Ref</form:label></td>
					<td><form:input path="body.denomination.id" /></td>
				</tr>
				<tr>
					<td><form:label path="body.denomination.fval">Ref</form:label></td>
					<td><form:input path="body.denomination.fval" /></td>
				</tr>
				<tr>
					<td><form:label path="body.denomination.uval">Ref</form:label></td>
					<td><form:input path="body.denomination.uval" /></td>
				</tr>
				<tr>
					<td><form:label path="body.denomination.units">Ref</form:label></td>
					<td><form:input path="body.denomination.units" /></td>
				</tr>
				<tr>
					<td><form:label path="body.denomination.histtax">Ref</form:label></td>
					<td><form:input path="body.denomination.histtax" /></td>
				</tr>

				<tr>
					<td><form:label path="body.endorsee.endid">Ref</form:label></td>
					<td><form:input path="body.endorsee.endid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.endorsee.endaddr">Ref</form:label></td>
					<td><form:input path="body.endorsee.endaddr" /></td>
				</tr>

				<tr>
					<td><form:label path="body.agreer.agrid">Ref</form:label></td>
					<td><form:input path="body.agreer.agrid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.agreer.agrmref">Ref</form:label></td>
					<td><form:input path="body.agreer.agrmref" /></td>
				</tr>

				<tr>
					<td><form:label path="body.floatingRateInfo.rtind">Ref</form:label></td>
					<td><form:select path="body.floatingRateInfo.rtind">
							<form:option value="1"  label="1"/>
							<form:option value="2"  label="2"/>
							<form:option value="3"  label="3"/>
							<form:option value="4"  label="4"/>
							<form:option value="5"  label="5"/>
							<form:option value="6"  label="6"/>
							<form:option value="7"  label="7"/>
							<form:option value="Z"  label="Z"/> 
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.floatingRateInfo.rtindmdit">Ref</form:label></td>
					<td><form:input path="body.floatingRateInfo.rtindmdit" /></td>
				</tr>
				<tr>
					<td><form:label path="body.floatingRateInfo.fixprccy">Ref</form:label></td>
					<td><form:select path="body.floatingRateInfo.fixprccy"> 
							<form:option value="1"  label="1"/>
							<form:option value="2"  label="2"/>
							<form:option value="3"  label="3"/>
							<form:option value="9"  label="9"/> 
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.floatingRateInfo.fixprcrule">Ref</form:label></td>
					<td><form:input path="body.floatingRateInfo.fixprcrule" /></td>
				</tr>

				<tr>
					<td><form:label path="body.isin">Ref</form:label></td>
					<td><form:input path="body.isin" /></td>
				</tr>
				<tr>
					<td><form:label path="body.ref">Ref</form:label></td>
					<td><form:input path="body.ref" /></td>
				</tr>
				<tr>
					<td><form:label path="body.isstype">Ref</form:label></td>
					<td><form:select path="body.isstype"> 
							<form:option value="1"  label="1"/>
							<form:option value="2"  label="2"/>
							<form:option value="3"  label="3"/>
							<form:option value="4"  label="4"/>
							<form:option value="5"  label="5"/>
							<form:option value="6"  label="6"/>
							<form:option value="7"  label="7"/>
							<form:option value="8"  label="8"/>
							<form:option value="9"  label="9"/>
							<form:option value="10" label="10"/>
							<form:option value="11" label="11"/>
							<form:option value="12" label="12"/>
							<form:option value="13" label="13"/>
							<form:option value="14" label="14"/>
							<form:option value="15" label="15"/>
							<form:option value="31" label="31"/>
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.issrnm">Ref</form:label></td>
					<td><form:input path="body.issrnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.issrid">Ref</form:label></td>
					<td><form:input path="body.issrid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.issrbuscode">Ref</form:label></td>
					<td><form:input path="body.issrbuscode" /></td>
				</tr>
				<tr>
					<td><form:label path="body.issrgrpid">Ref</form:label></td>
					<td><form:select path="body.issrgrpid">
							<form:option value="1"  label="1"/>
							<form:option value="2"  label="2"/> 
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.prtyid">Ref</form:label></td>
					<td><form:input path="body.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprtyid">Ref</form:label></td>
					<td><form:input path="body.cprtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.psdbid">Ref</form:label></td>
					<td><form:input path="body.psdbid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.brnchid">Ref</form:label></td>
					<td><form:input path="body.brnchid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.fval">Ref</form:label></td>
					<td><form:input path="body.fval" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secccy">Ref</form:label></td>
					<td><form:select path="body.secccy">
							<form:option value="TWD"  label="TWD"/>
							<form:option value="USD"  label="USD"/>
							<form:option value="AUD"  label="AUD"/>
							<form:option value="EUR"  label="EUR"/>
							<form:option value="JPY"  label="JPY"/>
							<form:option value="CNY"  label="CNY"/>
							<form:option value="ZAR"  label="ZAR"/> 
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.amttype">Ref</form:label></td>
					<td><form:select path="body.amttype">
							<form:option value="1"  label="1"/>
							<form:option value="2"  label="2"/> 
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.issdays">Ref</form:label></td>
					<td><form:input path="body.issdays" /></td>
				</tr>
				<tr>
					<td><form:label path="body.issdt">Ref</form:label></td>
					<td><form:input path="body.issdt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.depdt">Ref</form:label></td>
					<td><form:input path="body.depdt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.selldt">Ref</form:label></td>
					<td><form:input path="body.selldt" /></td>
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
					<td><form:label path="body.intind">Ref</form:label></td>
					<td><form:select path="body.intind">
							<form:option value="1"  label="1"/>
							<form:option value="2"  label="2"/> 
							<form:option value="3"  label="3"/> 
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.regind">Ref</form:label></td>
					<td><form:input path="body.regind"/> 
							<form:option value="Y"  label="Y"/>
							<form:option value="N"  label="N"/>  
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.ncdno">Ref</form:label></td>
					<td><form:input path="body.ncdno" /></td>
				</tr>
				<tr>
					<td><form:label path="body.rdmpamt">Ref</form:label></td>
					<td><form:input path="body.rdmpamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.dayint">Ref</form:label></td>
					<td><form:input path="body.dayint" /></td>
				</tr>
				<tr>
					<td><form:label path="body.ncdpaybank">Ref</form:label></td>
					<td><form:input path="body.ncdpaybank" /></td>
				</tr>
				<tr>
					<td><form:label path="body.thmatdt">Ref</form:label></td>
					<td><form:input path="body.thmatdt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.taxrt">Ref</form:label></td>
					<td><form:input path="body.taxrt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshsys">Ref</form:label></td>
					<td><form:input path="body.cshsys" /></td>
				</tr>
				<tr>
					<td><form:label path="body.countryid">Ref</form:label></td>
					<td><form:input path="body.countryid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.deprid">Ref</form:label></td>
					<td><form:input path="body.deprid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.issrttype">Ref</form:label></td>
					<td><form:input path="body.issrttype">
							<form:option value="1"  label="1"/>
							<form:option value="2"  label="2"/> 
						</form:select>
					</td>
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