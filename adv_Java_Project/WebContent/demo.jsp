<%@page import="com.cdac.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
       <%
    User u =  (User) request.getAttribute("user2");
      if(u != null && u.getUserName() != null){
      %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
heool ........
</body>
</html>
<% }else{
	
	response.sendRedirect("dem.jsp");	
	}
	%>