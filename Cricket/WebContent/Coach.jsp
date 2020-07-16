<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% session.setAttribute("coach", "Coach");%>
<form action="CoachServlet" method="post">
<h1>Create team</h1>
Team name:<input type="text" name="tname"><br>
Coach name:<input type="text" name="cname"><br>
<input type="submit" value="save">
</form>
</body>
</html>