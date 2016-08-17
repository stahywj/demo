package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenneth on 2016/7/28.
 */
public class userServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("username");
        String pwd = req.getParameter("password");
        String sex = req.getParameterValues("sex")[0];
        String[] ball = req.getParameterValues("ball");
        String instruction = req.getParameterValues("textarea1")[0];

        List<String> list = new ArrayList<String>();

        if (null == name || "".equals(name)){
            list.add("用户名不能为空！！！");
        }else if (name.length() < 4 ){
            list.add("用户名过短！！！");
        }else if (name.length() > 10){
            list.add("用户名过长！！！");
        }

        if (null == pwd || "".equals(pwd)){
            list.add("密码不能为空！！！");
        }else if (pwd.length() < 4 ){
            list.add("密码过短！！！");
        }else if (pwd.length() > 10){
            list.add("密码过长！！！");
        }

        if (null == instruction){
            list.add("说明不能为空");
        }

        if (null == sex){
            list.add("性别不能为空！！！");
        }

        if (null == ball){
            list.add("兴趣至少选择一个！！！");
        }else if (ball.length > 3){
            list.add("兴趣最多选择三个！！！");
        }

        if (list.isEmpty()){
            req.setAttribute("username", name);
            req.getRequestDispatcher("userSuccess.jsp").forward(req, resp);
        }else {
            req.setAttribute("error", list);
            req.getRequestDispatcher("userError.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
