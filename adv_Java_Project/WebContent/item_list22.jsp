<%@page import="com.cdac.dto.Customer"%>
<%@page import="com.cdac.dto.ItemD"%>
<%@page import="java.util.List"%>
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
<title>ITEM lIST</title>
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
			<br>
			<td>
				<a href="buyproductc.htm?itemId=<%=exp.getItemId()%>&c_id=<%=u.getcId()%>">BUY NOW</a>
			</td>
			
		</tr>
		
		<% } %>
		<tr>
			<td>
				<a href="cus_home.jsp">Back</a>
			</td>
			<td>
				
			</td>
		</tr>
	</table>
	<br>
</body>
</html>
<% }else{
	response.sendRedirect("cuslogdata55.htm");	
	}
	%>