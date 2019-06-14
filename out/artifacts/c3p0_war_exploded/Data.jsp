<%@ page import="Dao.DataDao" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dembe
  Date: 2019/6/4
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有数据页面</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/manager.css">
</head>
<body>

    <div id="top">
    <a href="Manager.jsp">首页</a>
    <span>管理者:${sessionScope.username}</span>
    <a href="Login.jsp"> 注销</a>
</div>
    <table border="1" id="Data_table" align="center" width="300px" class="table" >
        <tr>
            <td>用户</td>
            <td>菜名</td>
            <td>数量</td>
            <td>价格</td>
        </tr>
        <c:forEach items="${show}" var="show">
            <tr class="show">
                <td>${show.username}</td>
                <td>${show.name}</td>
                <td>${show.num}份</td>
                <td>${show.price}</td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="4" id="price_all"></td>
        </tr>
    </table>
    <script>
        var table = document.getElementById('Data_table');
        var aTr = table.getElementsByTagName('tr');
        var price = 0.0;
        for(var i=1;i<aTr.length-1;i++){
            fn(aTr[i]);
        }
        // alert(price);
        document.getElementById('price_all').innerHTML ="总计"+price+"元";
        function  fn(tr) {
            price += Number(tr.getElementsByTagName('td')[3].innerText);
        }

    </script>

</body>

</html>
