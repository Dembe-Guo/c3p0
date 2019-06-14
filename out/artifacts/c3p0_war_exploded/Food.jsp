<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Dao.FoodDao" %>
<%@ page import="bean.Food" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Dembe
  Date: 2019/6/5
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>食品</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/manager.css">
</head>
<body>

<div id="top">
    <a href="Manager.jsp">首页</a>
    <span>管理者:${sessionScope.username}</span>
    <a href="Login.jsp"> 注销</a>
</div>

<form>
    <table border="1" id="Food_table" align="center" width="500px">
        <tr>
            <td>菜名</td>
            <td>价格</td>
            <td colspan="2">操作</td>
        </tr>
   <c:forEach items="${food}" var="food">
        <tr class="num">
            <td>
               ${food.name}
            </td>
            <td>
                ${food.price}
            </td>

            <td>
                <input type="button" value="删除" onclick="window.location.href='delete?${food.id}'">
            </td>
        </tr>
</c:forEach>
        <tr>
            <td colspan="3" id="aNum"></td>
        </tr>
</table>
</form>
<script>
    var num = document.getElementsByClassName('num');
    document.getElementById('aNum').innerHTML ="总计"+num.length+"件菜品";
</script>
</body>
</html>
