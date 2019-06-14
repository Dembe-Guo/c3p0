<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dembe
  Date: 2019/6/14
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单页面</title>
</head>
<body>
<from>
    <c:forEach items="${query}" var="query">
        ${query.username}
        ${query.name}
        ${query.num}
        ${query.price}
    </c:forEach>
</from>
</body>
</html>
