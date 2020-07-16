<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% session.setAttribute("signinoperation","signin"); %>
Email:<input type="text" name="email"/><br>
password:<input type="text" name="pwd"/> <br>
<input type="submit">
</body>
</html>