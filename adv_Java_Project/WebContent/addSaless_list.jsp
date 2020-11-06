<%@page import="com.cdac.dto.User"%>
<%@page import="com.cdac.dto.ItemD"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    User u =  (User) session.getAttribute("user");
      if(u != null && u.getUserName() != null){
      %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	
	<table align="center" >
		<% 
		List<ItemD> elist = (List<ItemD>)request.getAttribute("itmList");
		for(ItemD exp : elist){
		%>
		<tr>
			<td>
				<%=exp.getItemName()%>
			</td>
			<td>
				<%=exp.getPrice()%>
			</td>
			<td>
				<%=exp.getType()%>
			</td>
			<td>
				<a href="addsold_item_.htm?itemId=<%=exp.getItemId()%>">One item Sold</a>
			</td>
			
		</tr>
		<% } %>
		<tr>
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				
			</td>
		</tr>
	</table>
	
</body>
</html>
<% }else{
	response.sendRedirect("prep_reg_form.htm");	
	}
	%>