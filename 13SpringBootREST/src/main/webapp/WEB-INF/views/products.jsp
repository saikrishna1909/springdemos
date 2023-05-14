<%@page language="java" contentType="text/html" isELIgnored="false" %>
<html>
<head>
<title>Products</title>
</head>
<body>
<h1>Products Addition</h1>
<form action="products" method="post">
	Name:<input type="text" name="name"/>
	Description:<input type="text" name="description"/>
	price:<input type="number" name="price">
	<input type="submit" value="Submit"/>
</form>
<ul>
<c:forEach items="${products}" var="product">
<li>${product.id} | ${product.name} | ${product.description} |${product.price} </li>
</c:forEach></ul>

</body>
</html>