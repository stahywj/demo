package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kenneth on 2016/8/4.
 */
public class messageLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = (String) req.getAttribute("username");
        String message = (String)req.getAttribute("message");

        System.out.println("nihao:"+username);
        System.out.println("nihao:"+message);
        req.getRequestDispatcher("messageOut.jsp").forward(req, resp);
    }
}
