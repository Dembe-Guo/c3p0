<%--
  Created by IntelliJ IDEA.
  User: Dembe
  Date: 2019/5/30
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
    <link rel="stylesheet" type="text/css" href="CSS/login.css"/>
</head>
<body>
<div class="bg"></div>
<div id="login_frame">
    <h1 id="h1">用户登录</h1>
    <form action="login" method="post">

        <p>
            <label class="label_input">用户名</label>
            <input type="text" name="username" class="text_field" required>
        </p>
        <p>
            <label class="label_input">密&nbsp;码</label>
            <input type="password" name="password" class="text_field" required>
        </p>
        <input type="submit" id="btn_login" value="登录"/>
        </br>
        <a id="forget_pwd" href="Register.jsp">
            注册账户
        </a>
    </form>
</div>
</body>
</html>
