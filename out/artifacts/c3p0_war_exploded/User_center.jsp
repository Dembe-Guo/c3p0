<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dembe
  Date: 2019/6/12
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人中心</title>
</head>
<body>
<c:forEach items="${all}" var="user">
    ${user.username}
    ${user.password}
    ${user.birthday}
    ${user.email}
    <input type="button" onclick="window.location.href='Modify' " value="修改信息">
</c:forEach>
</body>
</html>
