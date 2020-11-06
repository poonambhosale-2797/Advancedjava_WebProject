<%@page import="com.cdac.dto.User"%>
<%@page import="com.cdac.dto.Total"%>
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
	<% 
		List elist = (List<ItemD>)request.getAttribute("itmList");
		{
		%>
	Electronic =	<%=elist.get(0) %> <br>
	Electronic =	<%=elist.get(1) %> <br>
	Fashion =	<%=elist.get(2) %>     <br>
	Home Application =	<%=elist.get(3) %> <br>
	
	Toys =	<%=elist.get(4) %> <br>
	Sports =	<%=elist.get(5) %> <br>
	Other =	<%=elist.get(6) %> <br>
	<a href="home.jsp" >Back</a>
	
		<% } %>

</body>
</html>
<% }else{
	response.sendRedirect("prep_reg_form.htm");	
	}
	%>