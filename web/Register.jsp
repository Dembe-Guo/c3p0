<%--
  Created by IntelliJ IDEA.
  User: Dembe
  Date: 2019/5/30
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <link type="text/css" rel="stylesheet" href="CSS/Registered.css">
</head>
<body>
<div class="bg"></div>
<div id="reg_frame">
    <h1 id="h1">用户注册</h1>
    <form method="post" action="register">

        <p class="label_input">用户名</p>
        <p><input type="text" name="username" required class="text_field"></p>

        <p class="label_input">密码</p>
        <p><input type="password" name="password" required class="text_field"></p>

        <p class="label_input">性别</p>
        <p>
        <div class="sex">
            <input type="radio" name="sex" value="男" required style="margin-left: -99px">男
            <input type="radio" name="sex" value="女" required style="margin-left: 100px">女
        </div>
        </p>

        <p class="label_input">生日</p>
        <p><input type="date" name="birthday" required class="text_field"></p>

        <p class="label_input">邮箱</p>
        <p><input type="email" name="email" required class="text_field"></p>

        <input type="submit" id="btn_tijiao">
        <input type="reset" id="btn_chongzhi">

    </form>
</div>
</body>
</html>
