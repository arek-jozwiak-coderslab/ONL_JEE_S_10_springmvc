<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: arek
  Date: 20.10.2022
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<ul>
<c:forEach var="cartItem" items="${cartItems}">
    <li>
        ${cartItem.product.name} - ${cartItem.quantity}
    </li>
</c:forEach>
</ul>
</body>
</html>
