<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<form action="reguser" method="post">
<pre>
	User name:<input type="text" name="name"/>
	Email:<input type="text" name="email"/>
	Password:<input type="password" name="password"/>
	<input type="submit"/>
	</pre>	
</form>
<%-- <p>${message}</p> --%>
<ul>
<c:forEach items="${users }" var="user">
<li>${user.id}|${user.name }|${user.email}</li>
</c:forEach>
</ul>
</body>
</html>