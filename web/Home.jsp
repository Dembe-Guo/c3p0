<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="bean.User" %>
<%--
  Created by IntelliJ IDEA.
  User: Dembe
  Date: 2019/5/30
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>首页</title>
    <script>
        window.onload = function () {
            var div = document.getElementsByClassName('div1');
            var form= document.getElementById('form');
            var div2 = form.getElementsByTagName('div');
            for (var i = 0; i < div.length; i++) {
                f1(div[i],div2[i]);
            }
        };
        function f1(Div,div2) {
            var input = Div.getElementsByTagName('input');
            var ainput = div2.getElementsByTagName('input');


            var addBtn = Div.getElementsByClassName('addBtn')[0];
            var lessBtn = Div.getElementsByClassName('lessBtn')[0];
            var price = Number(input[1].value);
            var num = Number(input[2].value);
            var j = 0;
            addBtn.onclick = function () {
                num++;
                input[2].value = num;
                input[3].value = price * num;
                for(var i=0;i<ainput.length;i++){
                    ainput[i].value = input[j].value;
                    j++;
                    if(j==1){
                        j++;
                    }
                }
                j=0;

            }
            lessBtn.onclick = function () {
                if (num > 0) {
                    num--;
                } else {
                    num == 0;
                }
                input[2].value = num;
                input[3].value = price * num;
                for(var i=0;i<ainput.length;i++){
                    ainput[i].value = input[j].value;
                    j++;
                    if(j==1){
                        j++;
                    }
                }
                j=0;

            };
        }

    </script>
</head>
<body>
<form action="/*" method="post">
    <a href="food">首页</a>
    用户: ${sessionScope.username}
    <a href="user_data">订单</a>
    <a href="user">个人中心</a>
        <c:forEach items="${food}" var="food1">
                <div class="div1">
                    <input type="text" name="food1name" value="${food1.name}">

                    <input type="text" name="food1name" value="${food1.price}">

                    <input type="text" name="num" size="5" value="0">

                    <input type="text" name="price" size="5" value="0">

                    <button type="button" class="addBtn"  name="add"　>+</button>

                    <button type="button" class="lessBtn" name="less">-</button>
                </div>
        </c:forEach>

</form>
<div>
    <form action="sub_food" method="post" id="form">
        <%--<input type="text" >
        <input type="text" >
        <input type="text" ><br>--%>
       <c:forEach items="${food}" var="obj">
           <div>
               <input type="text" name="name">
               <input type="text" name="num">
               <input type="text" name="price" ><br>
           </div>
       </c:forEach>
            <button type="submit" >提交订单</button>
    </form>
</div>

</body>
</html>
