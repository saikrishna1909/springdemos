<%@page language="java" contentType="text/html" isELIgnored="false" %>
<html>
<head>
<title>Hello World</title>
</head>
<body>
<h1>Hello!! Welcome to Spring MVC</h1>
<%
Integer id=(Integer)request.getAttribute("id");
String name=(String)request.getAttribute("name");
Integer age=(Integer)request.getAttribute("age");

%>
<p>Id:${id }</p>
<p>name:${name }</p>
<p>age:${age}</p>

</body>
</html>