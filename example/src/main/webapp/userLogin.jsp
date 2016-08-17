<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/7/28
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" >
        function validate() {
            var name = document.getElementById("username1");
            var pwd = document.getElementById("password1");
            var sex = document.getElementsByName("sex");
            var textarea = document.getElementById("textarea1");
            var checkbox = document.getElementsByName("ball");

            if (name.value.length == 0){
                alert("用户名不能为空！！！");
                return false;
            }

            if (name.value.length < 4 || name.value.length > 10){
                alert("用户名的长度应在4------10之间！！！");
                return false;
            }

            if (pwd.value.length == 0){
                alert("密码不能为空！！！");
                return false;
            }

            if (pwd.value.length < 4 || pwd.value.length > 10){
                alert("密码的长度应在4------10之间！！！");
                return false;
            }

            if (!(sex[0].checked) && !(sex[1].checked)){
                alert("性别一定要选！！！");
                return false;
            }

            var count = 0;
            for(var i = 0; i < checkbox.length; i++){
                if (checkbox[i].checked){
                    count ++;
                }
            }
            if (count < 1 || count > checkbox.length-1){
                alert("兴趣不能不选也不能全选！！！");
                return false;
            }

            if (textarea.value.length == 0){
                alert("说明内容不能为空！！！");
                return false;
            }
            return true;
        }
    </script>
</head>

<body>
    <form onsubmit="return validate()" method="get" action="userResult.jsp">
        用户名： <input type="text" name="username" id="username1"><br>
        密  码： <input type="password" name="password" id="password1"><br>
        性  别： <input type="radio" name="sex" value="男">男
                 <input type="radio" name="sex" value="女">女<br>
        兴  趣： 足球<input type="checkbox" name="ball" value="足球">&nbsp;
                 篮球<input type="checkbox" name="ball" value="篮球">&nbsp;
                 排球<input type="checkbox" name="ball" value="排球">&nbsp;
                 羽毛球<input type="checkbox" name="ball" value="羽毛球"><br>
        地  址： <select name="address">
                    <option>北京</option>
                    <option>上海</option>
                    <option>广州</option>
                 </select><br>
        说  明： <input type="textarea" name="textarea" id="textarea1"><br>
        <input type="submit" value="点击确定">&nbsp;&nbsp;&nbsp;
        <input type="reset" value="重置">

    </form>
</body>
</html>
