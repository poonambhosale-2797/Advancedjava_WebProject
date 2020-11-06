<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %> 
     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <spr:form action="cus_reg.htm" method="get" commandName="cusData" >
	
	<table align="center" >
		<tr>
			<td>
				Name:
			</td>
			<td>
				<spr:input path="cName"/>
			</td>
		</tr>
		<tr>
			<td>
				Email Address:
			</td>
			<td>
				<spr:input path="eMail"/>
			</td>
		</tr>
		<tr>
			<td>
				Username:
			</td>
			<td>
				<spr:input path="userName"/>
			</td>
		</tr>
		<tr>
			<td>
				Password:
			</td>
			<td>
				<spr:password path="userPass"/>
			</td>
		</tr>
		<tr>
			<td>
				<a href="index.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Register" >
			</td>
		</tr>
	</table>
	</spr:form>


</body>
</html>