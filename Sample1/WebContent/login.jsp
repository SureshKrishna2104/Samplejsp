<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% session.setAttribute("operation","register"); %>
<form name=log action="UserServlet" method="post">
Name:
 <input type="text" name="fname" id="firstname" required autocomplete="off" /><br>
Email:
 <input type="email" name="email" id="email" required autocomplete="off" /><br>
Password:
  <input type="password" name="pwd" id="pwd" required autocomplete="off" /><br>
<input type="submit"/>
</form>
</body>
</html>