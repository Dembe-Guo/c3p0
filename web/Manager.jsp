<%--
  Created by IntelliJ IDEA.
  User: Dembe
  Date: 2019/6/4
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理者页面</title>
    <link rel="stylesheet" type="text/css" href="CSS/manager.css">
</head>
<body>
<div id="top">
    <a href="Manager.jsp">首页</a>
    <span >管理者:${sessionScope.username}</span>

    <a href="Login.jsp" > 注销</a>
</div>
<a href="select"><input type="button" id="bt" value="查看已有菜品" ></a>
<a href="Add.jsp"><input type="button" id="bt1" value="添加菜品" ></a>
<a href="data"><input type="button" id="bt2" value="查看数据" ></a>
</body>
</html>
