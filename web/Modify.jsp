<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dembe
  Date: 2019/6/12
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改信息</title>
</head>
<body>
<div style="margin-left:50%">


<form action="sub_modify" method="post" >
    <c:forEach var="user" items="${all}">
        <p>用户名</p>
        <p><input type="text" readonly="readonly" name="username" required  value="${user.username}"></p>

        <p >密码</p>
        <p><input type="password" name="password" required  value="${user.password}"></p>

        <p >性别</p>
        <p>
            <input type="text" name = "sex" required value="${user.sex}">
           <%-- <input type="radio" name="sex" value="男" required >男
            <input type="radio" name="sex" value="女" required >女--%>
        </p>

        <p >生日</p>
        <p><input type="date" name="birthday" required value="${user.birthday}" ></p>

        <p >邮箱</p>
        <p><input type="email" name="email" required  value="${user.email}"></p>

        <input type="submit" value="确认修改">
    </c:forEach>
</form>

</div>
</body>
</html>
