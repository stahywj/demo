<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/8/1
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        String username = "";
        if (!session.isNew()){
            username = (String)session.getAttribute("username");
            if (null == username){
                username = "";
            }
        }
    %>

        session Id: <%= session.getId()%>
    <form action="mailCheck.jsp">
        username: <input type="text" name="username" value="<%= username%>">
        <input type="submit" value="submit">
    </form>
</body>
</html>
