<%--
  Created by IntelliJ IDEA.
  User: kenneth
  Date: 2016/7/26
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        int row = 0;
        int col = 0;
        try {
            row = Integer.parseInt(request.getParameter("row"));
            col = Integer.parseInt(request.getParameter("col"));
        }catch (Exception e){
            e.printStackTrace();
            return;
        }
        int value = 0;
    %>
    <table border="1" width="80%">
        <%
            for (int i = 0; i < row; i++)
            {
        %>
        <tr>
            <%
                for (int j = 0; j < col; j++)
                {
            %>
            <td>
                <%=
                    ++value
                %>
            </td>
            <%
                }
            %>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
