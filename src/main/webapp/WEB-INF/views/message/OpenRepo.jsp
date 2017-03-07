<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title><spring:message code="openRepo" /></title>
<style>
.required {
	color: red;
}
</style>
</head>
<body>
<body>
	<form:form method="POST" action="OpenRepo" modelAttribute="model">
		<table>
			<thead>
				<tr>
					<th><spring:message code="openRepo" /></th>
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
					<td><form:label path="body.ref"><spring:message code="openRepo.ref" /></form:label></td>
					<td><form:input path="body.ref" /></td>
				</tr>							
				<tr>
					<td><form:label path="body.dealside"><span class="required">＊</span><spring:message code="openRepo.dealside" /></form:label></td>
					<td><form:select path="body.dealside">
							<form:option value="D"  label="D"/>
							<form:option value="R"  label="R"/> 
						</form:select>
					</td>
				</tr>					
				<tr>
					<td><form:label path="body.cbid"><spring:message code="openRepo.cbid" /></form:label></td>
					<td><form:input path="body.cbid" /></td>
				</tr>					
				<tr>
					<td><form:label path="body.prty.stlmprty.prtyid"><span class="required">＊</span><spring:message code="openRepo.prty.stlmprty.prtyid" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.acctid"><span class="required">＊</span><spring:message code="openRepo.prty.stlmprty.acctid" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.acctnm"><spring:message code="openRepo.prty.stlmprty.acctnm" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.acctnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.prty.stlmprty.invscshacct"><spring:message code="openRepo.prty.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.prty.stlmprty.invscshacct" /></td>
				</tr>					
				<tr>
					<td><form:label path="body.cshsys"><spring:message code="openRepo.cshsys" /></form:label></td>
					<td><form:input path="body.cshsys" /></td>
				</tr>						
				<tr>
					<td><form:label path="body.cprty.stlmprty.prtyid"><span class="required">＊</span><spring:message code="openRepo.cprty.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.prtyid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.acctid"><span class="required">＊</span><spring:message code="openRepo.cprty.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.acctid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.acctnm"><spring:message code="openRepo.cprty.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.acctnm" /></td>
				</tr>
				<tr>
					<td><form:label path="body.cprty.stlmprty.invscshacct"><spring:message code="openRepo.cprty.stlmprty.invscshacct" /></form:label></td>
					<td><form:input path="body.cprty.stlmprty.invscshacct" /></td>
				</tr>					
				<tr>
					<td><form:label path="body.trddt"><span class="required">＊</span><spring:message code="openRepo.trddt" /></form:label></td>
					<td><form:input path="body.trddt" /></td>
				</tr>	
				<tr>
					<td><form:label path="body.trdrt"><span class="required">＊</span><spring:message code="openRepo.trdrt" /></form:label></td>
					<td><form:input path="body.trdrt" /></td>
				</tr>					
				<tr>
					<td><form:label path="body.pch.cshLeg.cshccy"><spring:message code="openRepo.pch.cshLeg.cshccy" /></form:label></td>
					<td>
						<form:select path="body.pch.cshLeg.cshccy">
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
					<td><form:label path="body.pch.cshLeg.cshamt"><span class="required">＊</span><spring:message code="openRepo.pch.cshLeg.cshamt" /></form:label></td>
					<td><form:input path="body.pch.cshLeg.cshamt" /></td>
				</tr>					
				<tr>
					<td><form:label path="body.pch.stlmdt"><span class="required">＊</span><spring:message code="openRepo.pch.stlmdt" /></form:label></td>
					<td><form:input path="body.pch.stlmdt" /></td>
				</tr>			
				<tr>
					<td><form:label path="body.secLeg.isin"><span class="required">＊</span><spring:message code="openRepo.secLeg.isin" /></form:label></td>
					<td><form:input path="body.secLeg.isin" /></td>
				</tr>			
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.genid"><span class="required">＊</span><spring:message code="openRepo.secLeg.secGenLeg.genid" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.genid" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secamt"><span class="required">＊</span><spring:message code="openRepo.secLeg.secGenLeg.secamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secamt" /></td>
				</tr>	
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secUnitsLeg.units"><span class="required">＊</span><spring:message code="openRepo.secLeg.secGenLeg.secUnitsLeg.units" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secUnitsLeg.units" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.secUnitsLeg.uval"><span class="required">＊</span><spring:message code="openRepo.secLeg.secGenLeg.secUnitsLeg.uval" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.secUnitsLeg.uval" /></td>
				</tr>	
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.taxamt"><spring:message code="openRepo.secLeg.secGenLeg.frstLeg.taxImp.taxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.taxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.rdmptaxamt"><spring:message code="openRepo.secLeg.secGenLeg.frstLeg.taxImp.rdmptaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.rdmptaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.clsdtaxamt"><spring:message code="openRepo.secLeg.secGenLeg.frstLeg.taxImp.clsdtaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.clsdtaxamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.taxImp.futtaxamt"><spring:message code="openRepo.secLeg.secGenLeg.frstLeg.taxImp.futtaxamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.taxImp.futtaxamt" /></td>
				</tr>	
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshamt"><span class="required">＊</span><spring:message code="openRepo.secLeg.secGenLeg.frstLeg.cshLeg.cshamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.cshccy"><spring:message code="openRepo.secLeg.secGenLeg.frstLeg.cshLeg.cshccy" /></form:label></td>
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
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshamt"><span class="required">＊</span><spring:message code="openRepo.secLeg.secGenLeg.scndLeg.cshLeg.cshamt" /></form:label></td>
					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshamt" /></td>
				</tr>
				<tr>
					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.cshccy"><spring:message code="openRepo.secLeg.secGenLeg.scndLeg.cshLeg.cshccy" /></form:label></td>
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
					<td><form:label path="body.rpch.cshLeg.cshccy"><spring:message code="openRepo.rpch.cshLeg.cshccy" /></form:label></td>
					<td> 
						<form:select path="body.rpch.cshLeg.cshccy">
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
					<td><form:label path="body.rpch.cshLeg.cshamt"><span class="required">＊</span><spring:message code="openRepo.rpch.cshLeg.cshamt" /></form:label></td>
					<td><form:input path="body.rpch.cshLeg.cshamt" /></td>
				</tr>			
				<tr>
					<td><form:label path="body.rpch.stlmDt"><span class="required">＊</span><spring:message code="openRepo.rpch.stlmDt" /></form:label></td>
					<td><form:input path="body.rpch.stlmDt" /></td>
				</tr>			
				<tr>
					<td><form:label path="body.prevrepoid"><spring:message code="openRepo.prevrepoid" /></form:label></td>
					<td><form:input path="body.prevrepoid" /></td>
				</tr>				
				<tr>
					<td><form:label path="body.rerepoauth"><spring:message code="openRepo.rerepoauth" /></form:label></td>
					<td><form:select path="body.rerepoauth">
							<form:option value="Y"  label="Y"/>
							<form:option value="N"  label="N"/> 
						</form:select>
					</td>
				</tr>				
				<tr>
					<td><form:label path="body.bndlref"><spring:message code="openRepo.bndlref" /></form:label></td>
					<td><form:input path="body.bndlref" /></td>
				</tr>				
				<tr>
					<td><form:label path="body.bndlttl"><spring:message code="openRepo.bndlttl" /></form:label></td>
					<td><form:input path="body.bndlttl" /></td>
				</tr>				

<!-- 				<tr> -->
<%-- 					<td><form:label path="body.pch.cshLeg.afttaxamt"><spring:message code="openRepo.pch.cshLeg.afttaxamt" /></form:label></td> --%>
<%-- 					<td><form:input path="body.pch.cshLeg.afttaxamt" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.pch.cshLeg.remitfee"><spring:message code="openRepo.pch.cshLeg.remitfee" /></form:label></td> --%>
<%-- 					<td><form:input path="body.pch.cshLeg.remitfee" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.rpch.cshLeg.afttaxamt"><spring:message code="openRepo.rpch.cshLeg.afttaxamt" /></form:label></td> --%>
<%-- 					<td><form:input path="body.rpch.cshLeg.afttaxamt" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.rpch.cshLeg.remitfee"><spring:message code="openRepo.rpch.cshLeg.remitfee" /></form:label></td> --%>
<%-- 					<td><form:input path="body.rpch.cshLeg.remitfee" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.afttaxamt"><spring:message code="openRepo.secLeg.secGenLeg.frstLeg.cshLeg.afttaxamt" /></form:label></td> --%>
<%-- 					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.afttaxamt" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.secLeg.secGenLeg.frstLeg.cshLeg.remitfee"><spring:message code="openRepo.secLeg.secGenLeg.frstLeg.cshLeg.remitfee" /></form:label></td> --%>
<%-- 					<td><form:input path="body.secLeg.secGenLeg.frstLeg.cshLeg.remitfee" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.afttaxamt"><spring:message code="openRepo.secLeg.secGenLeg.scndLeg.cshLeg.afttaxamt" /></form:label></td> --%>
<%-- 					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.afttaxamt" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.secLeg.secGenLeg.scndLeg.cshLeg.remitfee"><spring:message code="openRepo.secLeg.secGenLeg.scndLeg.cshLeg.remitfee" /></form:label></td> --%>
<%-- 					<td><form:input path="body.secLeg.secGenLeg.scndLeg.cshLeg.remitfee" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.taxamt"><spring:message code="openRepo.secLeg.secGenLeg.scndLeg.taxImp.taxamt" /></form:label></td> --%>
<%-- 					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.taxamt" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.rdmptaxamt"><spring:message code="openRepo.secLeg.secGenLeg.scndLeg.taxImp.rdmptaxamt" /></form:label></td> --%>
<%-- 					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.rdmptaxamt" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.clsdtaxamt"><spring:message code="openRepo.secLeg.secGenLeg.scndLeg.taxImp.clsdtaxamt" /></form:label></td> --%>
<%-- 					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.clsdtaxamt" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.secLeg.secGenLeg.scndLeg.taxImp.futtaxamt"><spring:message code="openRepo.secLeg.secGenLeg.scndLeg.taxImp.futtaxamt" /></form:label></td> --%>
<%-- 					<td><form:input path="body.secLeg.secGenLeg.scndLeg.taxImp.futtaxamt" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.secLeg.secGenLeg.bdLeg.price"><spring:message code="openRepo.secLeg.secGenLeg.bdLeg.price" /></form:label></td> --%>
<%-- 					<td><form:input path="body.secLeg.secGenLeg.bdLeg.price" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.secLeg.secGenLeg.bdLeg.idays"><spring:message code="openRepo.secLeg.secGenLeg.bdLeg.idays" /></form:label></td> --%>
<%-- 					<td><form:input path="body.secLeg.secGenLeg.bdLeg.idays" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.secLeg.secGenLeg.bdLeg.accint"><spring:message code="openRepo.secLeg.secGenLeg.bdLeg.accint" /></form:label></td> --%>
<%-- 					<td><form:input path="body.secLeg.secGenLeg.bdLeg.accint" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.secLeg.secGenLeg.bdLeg.accinttax"><spring:message code="openRepo.secLeg.secGenLeg.bdLeg.accinttax" /></form:label></td> --%>
<%-- 					<td><form:input path="body.secLeg.secGenLeg.bdLeg.accinttax" /></td> --%>
<!-- 				</tr> -->
<!-- 				<tr> -->
<%-- 					<td><form:label path="body.secLeg.mgcntrid"><spring:message code="openRepo.secLeg.mgcntrid" /></form:label></td> --%>
<%-- 					<td><form:input path="body.secLeg.mgcntrid" /></td> --%>
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