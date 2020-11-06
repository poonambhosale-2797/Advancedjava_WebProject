<%@page import="com.cdac.dto.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%
    Customer u =  (Customer) session.getAttribute("customer");
      if(u != null && u.getUserName() != null){
      %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" 
crossorigin="anonymous">
</head>
<body>
<div class="container">
<div class="row" style="display: flex;flex-direction: row;align-items: flex-end;">
<a href="logout1.htm">Logout</a>
</div>

</div>
   <div class="container">
   <div class="row" style="margin: 100px;padding: 10px;display: flex;justify-content: space-between;" >
   <div class="col-2" style="border: 2px solid black;height: 45px;display: flex;justify-content: center;align-items: center;text-align: center;">
    
    <a href="cusproview.htm?type=Electronic">Electronic</a>
   </div>
   <div class="col-2" style="border: 2px solid black;height: 45px;display: flex;justify-content: center;align-items: center;text-align: center;">
    
   <a href="cusproview.htm?type=Eletrical">Eletrical</a>
   </div>
   <div class="col-2" style="border: 2px solid black;height: 45px;display: flex;justify-content: center;align-items: center;text-align: center;">
    
    <a href="cusproview.htm?type=Fashion">Fashion</a>
   </div>
   </div>
   
   <div class="row" style="margin: 100px;padding: 10px;display: flex;justify-content: space-between;" >
   <div class="col-2" style="border: 2px solid black;height: 45px;display: flex;justify-content: center;align-items: center;text-align: center;">
    
   <a href="cusproview.htm?type=Home Application">Home Application</a>
   </div>
   <div class="col-2" style="border: 2px solid black;height: 45px;display: flex;justify-content: center;align-items: center;text-align: center;">
    
   <a href="cusproview.htm?type=Toys">Toys</a>
   </div>
   <div class="col-2" style="border: 2px solid black;height: 45px;display: flex;justify-content: center;align-items: center;text-align: center;">
    
   <a href="cusproview.htm?type=Sports">Sports</a>
   </div> 
   <div class="col-2" style="border: 2px solid black;height: 45px;display: flex;justify-content: center;align-items: center;text-align: center;">
    
   <a href="cusproview.htm?type=Other">Other</a>
   </div>
   </div>
   
   
   
   </div>
  
  
  
</body>
</html>
<% }else{
	response.sendRedirect("index.jsp");	
	}
	%>