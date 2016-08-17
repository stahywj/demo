<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/7/26
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.Collection" %>
<%@ page import="java.util.Iterator" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        if (application.getAttribute("counts") == null){
            application.setAttribute("counts", "1");
        }else {
            String strnum = application.getAttribute("counts").toString();
            int count = Integer.valueOf(strnum).intValue();
            count++;
            application.setAttribute("counts", Integer.toString(count));
        }
    %>
    您是第<%= application.getAttribute("counts") %>位访问者！
</body>
</html>
