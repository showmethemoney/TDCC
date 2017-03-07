<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title><spring:message code="dep" /></title>
<style>
.required {
	color: red;
}
</style>

</head>
<body>
<body>
	<form:form method="POST" action="Dep" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th><spring:message code="dep" /></th>
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
					<td><form:label path="body.ref"><spring:message code="dep.ref" /></form:label></td>
					<td><form:input path="body.ref" /></td>
				</tr>
				<tr>
					<td><form:label path="body.isin"><span class="required">＊</span><spring:message code="dep.isin" /></form:label></td>
					<td><form:input path="body.isin" /></td>
				</tr>				
				<tr>
					<td><form:label path="body.issrttype"><span class="required">＊</span><spring:message code="dep.issrttype" /></form:label></td>
					<td><form:select path="body.issrttype">
							<form:option value="1"  label="1"/>
							<form:option value="2"  label="2"/> 
						</form:select>
					</td>
				</tr>				
				<tr>
					<td><form:label path="body.issrnm"><span class="required">＊</span><spring:message code="dep.issrnm" /></form:label></td>
					<td><form:input path="body.issrnm" /></td>
				</tr>				
				<tr>
					<td><form:label path="body.issrid"><span class="required">＊</span><spring:message code="dep.issrid" /></form:label></td>
					<td><form:input path="body.issrid" /></td>
				</tr>				
				<tr>
					<td><form:label path="body.issrbuscode"><span class="required">＊</span><spring:message code="dep.issrbuscode" /></form:label></td>
					<td><form:input path="body.issrbuscode" /></td>
				</tr>				
				<tr>
					<td><form:label path="body.issrgrpid"><span class="required">＊</span><spring:message code="dep.issrgrpid" /></form:label></td>
					<td><form:select path="body.issrgrpid">
							<form:option value="1"  label="1"/>
							<form:option value="2"  label="2"/> 
						</form:select>
					</td>
				</tr>
				<tr>
					<td><form:label path="body.endorsee.endid"><span class="required">＊</span><spring:message code="dep.endorsee.endid" /></form:label></td>
					<td><form:input path="body.endorsee.endid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.endorsee.endaddr"><span class="required">＊</span><spring:message code="dep.endorsee.endaddr" /></form:label></td>
					<td><form:input path="body.endorsee.endaddr" /></td>
				</tr>				
				<tr>
					<td><form:label path="body.taxrt"><spring:message code="dep.taxrt" /></form:label></td>
					<td><form:input path="body.taxrt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cshsys"><spring:message code="dep.cshsys" /></form:label></td>
					<td><form:input path="body.cshsys" /></td>
				</tr>				
				<tr>
					<td><form:label path="body.countryid"><spring:message code="dep.countryid" /></form:label></td>
					<td><form:input path="body.countryid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.deprid"><spring:message code="dep.deprid" /></form:label></td>
					<td><form:input path="body.deprid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prtyid"><span class="required">＊</span><spring:message code="dep.prtyid" /></form:label></td>
					<td><form:input path="body.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.agreer.agrid"><span class="required">＊</span><spring:message code="dep.agreer.agrid" /></form:label></td>
					<td><form:input path="body.agreer.agrid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.agreer.agrmref"><span class="required">＊</span><spring:message code="dep.agreer.agrmref" /></form:label></td>
					<td><form:input path="body.agreer.agrmref" /></td>
				</tr>
				<tr>
					<td><form:label path="body.psdbid"><span class="required">＊</span><spring:message code="dep.psdbid" /></form:label></td>
					<td><form:input path="body.psdbid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.brnchid"><span class="required">＊</span><spring:message code="dep.brnchid" /></form:label></td>
					<td><form:input path="body.brnchid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.fval"><span class="required">＊</span><spring:message code="dep.fval" /></form:label></td>
					<td><form:input path="body.fval" /></td>
				</tr>								
				<tr>
					<td><form:label path="body.intind"><spring:message code="dep.intind" /></form:label></td>
					<td><form:select path="body.intind">
							<form:option value="1"  label="1"/>
							<form:option value="2"  label="2"/> 
							<form:option value="3"  label="3"/> 
						</form:select>
					</td>
				</tr>				
				<tr>
					<td><form:label path="body.ncdpaybank"><spring:message code="dep.ncdpaybank" /></form:label></td>
					<td><form:input path="body.ncdpaybank" /></td>
				</tr>				
				<tr>
					<td><form:label path="body.secccy"><spring:message code="dep.secccy" /></form:label></td>
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
					<td><form:label path="body.amttype"><spring:message code="dep.amttype" /></form:label></td>
					<td><form:select path="body.amttype">
							<form:option value="1"  label="1"/>
							<form:option value="2"  label="2"/> 
						</form:select>
					</td>
				</tr>				
				<tr>
					<td><form:label path="body.issdays"><span class="required">＊</span><spring:message code="dep.issdays" /></form:label></td>
					<td><form:input path="body.issdays" /></td>
				</tr>
				<tr>
					<td><form:label path="body.issdt"><span class="required">＊</span><spring:message code="dep.issdt" /></form:label></td>
					<td><form:input path="body.issdt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.depdt"><span class="required">＊</span><spring:message code="dep.depdt" /></form:label></td>
					<td><form:input path="body.depdt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.selldt"><span class="required">＊</span><spring:message code="dep.selldt" /></form:label></td>
					<td><form:input path="body.selldt" /></td>
				</tr>				
				<tr>
					<td><form:label path="body.matdt"><span class="required">＊</span><spring:message code="dep.matdt" /></form:label></td>
					<td><form:input path="body.matdt" /></td>
				</tr>				
				<tr>
					<td><form:label path="body.thmatdt"><span class="required">＊</span><spring:message code="dep.thmatdt" /></form:label></td>
					<td><form:input path="body.thmatdt" /></td>
				</tr>		
				<tr>
					<td><form:label path="body.issrt"><spring:message code="dep.issrt" /></form:label></td>
					<td><form:input path="body.issrt" /></td>
				</tr>	
				<tr>
					<td><form:label path="body.denomination.id"><span class="required">＊</span><spring:message code="dep.denomination.id" /></form:label></td>
					<td><form:input path="body.denomination.id" /></td>
				</tr>
				<tr>
					<td><form:label path="body.denomination.fval"><span class="required">＊</span><spring:message code="dep.denomination.fval" /></form:label></td>
					<td><form:input path="body.denomination.fval" /></td>
				</tr>
				<tr>
					<td><form:label path="body.denomination.uval"><span class="required">＊</span><spring:message code="dep.denomination.uval" /></form:label></td>
					<td><form:input path="body.denomination.uval" /></td>
				</tr>
				<tr>
					<td><form:label path="body.denomination.units"><span class="required">＊</span><spring:message code="dep.denomination.units" /></form:label></td>
					<td><form:input path="body.denomination.units" /></td>
				</tr>
				<tr>
					<td><form:label path="body.denomination.histtax"><spring:message code="dep.denomination.histtax" /></form:label></td>
					<td><form:input path="body.denomination.histtax" /></td>
				</tr>	

<!-- 				<tr> -->
<%-- 					<td><form:label path="body.floatingRateInfo.rtind"><spring:message code="dep.floatingRateInfo.rtind" /></form:label></td> --%>
<%-- 					<td><form:select path="body.floatingRateInfo.rtind"> --%>
<%-- 							<form:option value="1"  label="1"/> --%>
<%-- 							<form:option value="2"  label="2"/> --%>
<%-- 							<form:option value="3"  label="3"/> --%>
<%-- 							<form:option value="4"  label="4"/> --%>
<%-- 							<form:option value="5"  label="5"/> --%>
<%-- 							<form:option value="6"  label="6"/> --%>
<%-- 							<form:option value="7"  label="7"/> --%>
<%-- 							<form:option value="Z"  label="Z"/>  --%>
<%-- 						</form:select> --%>
<!-- 					</td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.floatingRateInfo.rtindmdit"><spring:message code="dep.floatingRateInfo.rtindmdit" /></form:label></td> --%>
<%-- 					<td><form:input path="body.floatingRateInfo.rtindmdit" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.floatingRateInfo.fixprccy"><spring:message code="dep.floatingRateInfo.fixprccy" /></form:label></td> --%>
<%-- 					<td><form:select path="body.floatingRateInfo.fixprccy">  --%>
<%-- 							<form:option value="1"  label="1"/> --%>
<%-- 							<form:option value="2"  label="2"/> --%>
<%-- 							<form:option value="3"  label="3"/> --%>
<%-- 							<form:option value="9"  label="9"/>  --%>
<%-- 						</form:select> --%>
<!-- 					</td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.floatingRateInfo.fixprcrule"><spring:message code="dep.floatingRateInfo.fixprcrule" /></form:label></td> --%>
<%-- 					<td><form:input path="body.floatingRateInfo.fixprcrule" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.isstype"><spring:message code="dep.isstype" /></form:label></td> --%>
<%-- 					<td><form:select path="body.isstype">  --%>
<%-- 							<form:option value="1"  label="1"/> --%>
<%-- 							<form:option value="2"  label="2"/> --%>
<%-- 							<form:option value="3"  label="3"/> --%>
<%-- 							<form:option value="4"  label="4"/> --%>
<%-- 							<form:option value="5"  label="5"/> --%>
<%-- 							<form:option value="6"  label="6"/> --%>
<%-- 							<form:option value="7"  label="7"/> --%>
<%-- 							<form:option value="8"  label="8"/> --%>
<%-- 							<form:option value="9"  label="9"/> --%>
<%-- 							<form:option value="10" label="10"/> --%>
<%-- 							<form:option value="11" label="11"/> --%>
<%-- 							<form:option value="12" label="12"/> --%>
<%-- 							<form:option value="13" label="13"/> --%>
<%-- 							<form:option value="14" label="14"/> --%>
<%-- 							<form:option value="15" label="15"/> --%>
<%-- 							<form:option value="31" label="31"/> --%>
<%-- 						</form:select> --%>
<!-- 					</td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.cprtyid"><spring:message code="dep.cprtyid" /></form:label></td> --%>
<%-- 					<td><form:input path="body.cprtyid" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.regind"><spring:message code="dep.regind" /></form:label></td> --%>
<%-- 					<td><form:select path="body.regind">  --%>
<%-- 							<form:option value="Y"  label="Y"/> --%>
<%-- 							<form:option value="N"  label="N"/>   --%>
<%-- 						</form:select> --%>
<!-- 					</td> -->
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.ncdno"><spring:message code="dep.ncdno" /></form:label></td> --%>
<%-- 					<td><form:input path="body.ncdno" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.rdmpamt"><spring:message code="dep.rdmpamt" /></form:label></td> --%>
<%-- 					<td><form:input path="body.rdmpamt" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.dayint"><spring:message code="dep.dayint" /></form:label></td> --%>
<%-- 					<td><form:input path="body.dayint" /></td> --%>
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