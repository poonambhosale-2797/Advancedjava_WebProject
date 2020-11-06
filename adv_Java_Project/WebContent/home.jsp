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
<title>Shop Home</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" 
crossorigin="anonymous">
</head>
<body>
<div class="container">
<div class="row" style="display: flex;flex-direction: row;align-items: flex-end;">
<a href="logout.htm">Logout</a>
</div>

</div>
		<div class="container" style="justify-content: center;align-items: center;margin: 25px;">
  <div class="row" style="justify-content: center;align-items: center;margin-top: 60px">
    <div class="col-3" style="border: 2px solid black;margin: 10px;height: 40px;justify-content: center;align-items: center;
    text-align: center;display: flex;">
     <a href="manageItem.htm">manage item</a>
    </div>
    <div class="col-3" style="border: 2px solid black;margin: 10px;height: 40px;justify-content: center;align-items: center;
    text-align: center;display: flex;">
       <a href="additem.htm">add item</a>
    </div>
    
  </div>
   <div class="row" style="justify-content: center;align-items: center;margin-top: 10px">
    <div class="col-3" style="border: 2px solid black;margin: 10px;height: 40px;justify-content: center;align-items: center;
    text-align: center;display: flex;">
     <a href="showtoaddSale.htm">add Sold item</a>
    </div>
   <div class="col-3" style="border: 2px solid black;margin: 10px;height: 40px;justify-content: center;align-items: center;
    text-align: center;display: flex;">
     <a href="totalsale.htm?itemId=<%=u.getUserId()%>">Total Sale</a>
    </div>
    <div class="col-3" style="border: 2px solid black;margin: 10px;height: 40px;justify-content: center;align-items: center;
    text-align: center;display: flex;">
     <a href="tracksalebycity.htm?userId=<%=u.getUserId()%>">Track Sale By City</a>
    </div>
    
  </div>
</div>
</body>
</html>
<% }else{
	response.sendRedirect("prep_reg_form.htm");	
	}
	%>