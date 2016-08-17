package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import static java.lang.System.out;

/**
 * Created by kenneth on 2016/7/25.
 */
public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        out.println("doGet invoked");
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        out.println("doPost invoked");
        process(req,resp);
    }


    private void process(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String re_password = req.getParameter("re_password");
        int age = Integer.parseInt(req.getParameter("age"));
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String result = "";
        if (!password.equals(re_password)) {
            result += "password != re_password";
        }
        if (age <= 18){
            result += "age <= 18";
        }
        if (password.equals(re_password) && age > 18){
            result += "congratulation success";
        }
        out.println("<html><head><title>Login Result</title></head>");
        out.println("<body>"+ result +"</body></html>");
        out.flush();
    }

}
