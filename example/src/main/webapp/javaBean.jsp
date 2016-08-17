<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/7/28
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="Bean.Person" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="person" class="Bean.Person" scope="request"></jsp:useBean>



    <jsp:getProperty name="person" property="address"></jsp:getProperty>
    <jsp:getProperty name="person" property="age"></jsp:getProperty>
    <jsp:getProperty name="person" property="name"></jsp:getProperty>

    <jsp:setProperty name="person" property="name" value="ywj"></jsp:setProperty>
    <jsp:getProperty name="person" property="name"></jsp:getProperty>


    <jsp:setProperty name="person" property="age" param="helloworld"></jsp:setProperty>
    <jsp:getProperty name="person" property="age"></jsp:getProperty>


   <%-- <jsp:forward page="javaBean2.jsp"></jsp:forward>--%>

    <jsp:useBean id="date" class="java.util.Date" scope="application"></jsp:useBean>
    <%= date.toLocaleString()%>
</body>
</html>
