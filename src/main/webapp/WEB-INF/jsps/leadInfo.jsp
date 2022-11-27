<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>

   <h2>Lead Information</h2>
   First Name:${lead.firstName}<br/>
   Last Name:${lead.lastName}<br/>
   Company:${lead.company}<br/>
   Email:${lead.email}<br/>
   Mobile:${lead.mobile}<br/>
   Lead Source:${lead.leadSource}<br/>
   
   <form action="sendEmail" method="post">
      <input type="hidden" name="email" value="${lead.email}"/>
      <input type="submit" value="Send Email"/>
   </form>
   
   <form action="contacts" method="post">
       <input type="hidden" name="id" value="${lead.id}"/>
       <input type="hidden" name="firstName" value="${lead.firstName}"/>
       <input type="hidden" name="lastName" value="${lead.lastName}"/>
       <input type="hidden" name="company" value="${lead.company}"/>
       <input type="hidden" name="email" value="${lead.email}"/>
       <input type="hidden" name="mobile" value="${lead.mobile}"/>
       <input type="hidden" name="leadSource" value="${lead.leadSource}"/>
       <input type="submit" value="convert to sales"/>
   </form>

</body>
</html>