<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/7/28
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  method="post" action="userServlet">
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
    说  明： <input type="textarea" name="textarea1" ><br>
    <input type="submit" value="点击确定">&nbsp;&nbsp;&nbsp;
    <input type="reset" value="重置">

</form>
</body>
</html>
