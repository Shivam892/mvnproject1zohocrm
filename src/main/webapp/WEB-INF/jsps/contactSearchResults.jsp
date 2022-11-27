<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts</title>
</head>
<body>
   <h2>Contact Book</h2>
   
   <h2>All Contacts</h2>
     <table border="2">
         <tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Company</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Lead Source</th>
		</tr>
		
		<c:forEach items="${contacts}" var="contact">
			<tr>
				<td><a href="getContactInfo?id=${contact.id}">${contact.firstName}</a></td>
				<td>${contact.lastName}</td>
				<td>${contact.company}</td>
				<td>${contact.email}</td>
				<td>${contact.mobile}</td>
				<td>${contact.leadSource}</td>
			</tr>
		</c:forEach>

</body>
</html>