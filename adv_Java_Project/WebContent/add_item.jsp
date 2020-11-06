<%@page import="javassist.bytecode.stackmap.BasicBlock.Catch"%>
<%@page import="com.cdac.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %> 
      <%
     
    User u =  (User) session.getAttribute("user");
      if(u != null && u.getUserName() != null){
      %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Item</title>
</head>
<body>
<spr:form action="addnewitem.htm" method="post" commandName="dd" >
	
	<table align="center" style="margin: 20px;border: 2px solid black;" >
		<tr style="margin: 5px">
			<td>
				item  name:
			</td>
			<td>
				<spr:input path="itemName"/>
			</td>
		</tr>
		<tr style="margin: 5px">
		<td>
				item  type:
			</td>
			<td>
				 <spr:select path="type">
				 <spr:option value="Electronic" label="Electronic"></spr:option>
				 <spr:option value="Eletrical" label="Eletrical"></spr:option>
				 <spr:option value="Fashion" label="Fashion"></spr:option>
				 <spr:option value="Home Application" label="Home Application"></spr:option>
				 <spr:option value="Toys" label="Toys"></spr:option>
				 <spr:option value="Sports" label="Sports"></spr:option>
				 <spr:option value="Other" label="Other"></spr:option>
				 </spr:select>
			</td>
			
		</tr>
		<tr style="margin: 5px">
			<td>
				item Price:
			</td>
			<td>
				<spr:input path="price"/>
			</td>
		</tr>
		<tr style="margin: 5px">
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="add item" >
			</td>
		</tr>
	</table>
	</spr:form>
</body>
</html>
<% }
else{
	response.sendRedirect("index.jsp");	
	}
	%>