<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/7/24
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript">
        function validate() {
            var username = document.getElementById("username1");
            var password = document.getElementById("password1");
            var repassword = document.getElementById("repassword1");
            if (username.value.length == 0){
                alert("username can't be null!");
                return false;
            }
            if (password.value.length < 6 || password.value.length > 10){
                alert("length of password is invalid!!!");
                return false;
            }
            if (repassword.value.length < 6 || repassword.value.length > 10){
                alert("length of repassword is invalid!!!");
                return false;
            }
            if (password.value != repassword.value){
                alert("password not the same");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <form action="LoginServlet" method="get" onsubmit="return validate()">
        用户名：<input type="text" name="username" id="username1"><br>
        密  码：<input type="password" name="password" id="password1"><br>
        确认密码：<input type="password" name="re_password" id="repassword1"><br>
        年龄：<input type="text" name="age"><br>
        <input type="submit" value="提交">&nbsp;&nbsp;&nbsp;
        <input type="reset" value="重置">
    </form>
</body>
</html>
