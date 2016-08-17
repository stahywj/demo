package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by kenneth on 2016/7/24.
 */
public class HelloWorldServlet extends HttpServlet {
    @Override
    @SuppressWarnings("deprecationed")
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Hello World Sample</title></head>");
        out.println("<body><h1>Hello World:"+ new Date().toGMTString() +"</h1></body></html>");
        System.out.println(new Date().toString());
        out.flush();
    }
}
