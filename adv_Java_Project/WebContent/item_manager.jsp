<%@page import="com.cdac.dto.User"%>
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
<title>Insert title here</title>
</head>
<body>
		
		<div class="container" style="justify-content: center;align-items: center;margin: 25px;">
  <div class="row" style="justify-content: center;align-items: center;margin-top: 60px;flex-direction: column;">
    <div class="col-3" style="border: 2px solid black;margin: 10px;height: 40px;justify-content: center;align-items: center;
    text-align: center;display: flex;">
     <a href="showItem.htm">show item</a>
    </div>
    
     
    </div>
    </div>
    
		
    
		



</body>
</html>

<% }else{
	response.sendRedirect("prep_reg_form.htm");	
	}
	%>