<%@page import="com.cdac.dto.Customer"%>
<%@page import="com.cdac.dto.HomeOrderData"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %> 
<%
Customer u =  (Customer) session.getAttribute("customer");
      if(u != null && u.getcId() > 0){
      %>   
<% HomeOrderData h = (HomeOrderData) request.getAttribute("hod");
   
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buy Now Page</title>
</head>
<body>
	
	<spr:form action="ouderplaced.htm" method="post" commandName="homedata" >
	<table align="center" >
	
		<tr>
			<td>
				
			</td>
			<td>
				<spr:hidden path="cusId"/>
			</td>
		</tr>
		<tr>
			<td>
				
			</td>
			<td>
				<spr:hidden path="proId"/>
			</td>
		</tr>
		<tr>
			<td>
				Name :
			</td>
			<td>
				<spr:input path="dName"/>
			</td>
		</tr>
		<tr>
			<td>
				mobile number:
			</td>
			<td>
				<spr:input path="dMobileNumber"/>
			</td>
		</tr>
		<tr style="margin: 5px">
		<td>
				item  type:
			</td>
			<td>
				 <spr:select path="dCity">
				 <spr:option value="Mumbai" label="Mumbai"></spr:option>
				 <spr:option value="Thane" label="Thane"></spr:option>
				 <spr:option value="Pune" label="Pune"></spr:option>
				
				 </spr:select>
			</td>
			
		</tr>
		<tr>
			<td>
				Complete Address:
			</td>
			<td>
				<spr:input path="dCompletAddress"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="item_list22" >Back</a>
			</td>
			<td>
				<input type="submit" value="Buy Now" >
			</td>
		</tr>
	</table>
	</spr:form>
	
</body>
</html>
<% }else{
	response.sendRedirect("prep_reg_form.htm");	
	}
	%>