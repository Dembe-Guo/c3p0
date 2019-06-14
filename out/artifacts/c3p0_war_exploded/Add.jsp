<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dembe
  Date: 2019/6/4
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加菜品页面</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/manager.css">
</head>
<body>

<div id="top">
    <a href="Manager.jsp">首页</a>
    <span>管理者:${sessionScope.username}</span>
    <a href="Login.jsp"> 注销</a>
</div>
<div id="add_food">
    <h1 id="h1">添加菜品</h1>
    <form method="post" action="add">
        <p class="label_input">
            请输入菜品ID:
        </p>
        <p>
            <input type="text" name="id" class="text_field" required></br>
        </p>
        <p class="label_input">
            请输入菜品名:
        </p>
        <p>
            <input type="text" name="name" class="text_field" required></br>
        </p>
        <p class="label_input">
            请输入价格:
        </p>
        <p>
            <input type="text" name="price" class="text_field" required></br>
        </p>
        <p>
            <input type="submit" id="sb_add">
        </p>
    </form>

</div>
</body>
</html>
