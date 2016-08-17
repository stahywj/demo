package Bean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by kenneth on 2016/8/1.
 */
public class UserLoginServlet extends HttpServlet {
    @SuppressWarnings("unchecked")
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String authority = req.getParameter("authority");
        User user = new User();
        HttpSession session = req.getSession();

        if ("1".equals(authority)){
            //登录是普通用户
            if ("zhangsan".equals(username) && "123".equals(password)){
                user.setUsername(username);
                user.setPassword(password);
                user.setAuthority(authority);
                //将用户放到session中
                session.setAttribute("user", user);
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            }else {
                /*req.setAttribute("username", username);
                req.setAttribute("password", password);
                req.setAttribute("authority",authority);
                req.getRequestDispatcher("login.jsp").forward(req,resp);*/
                resp.sendRedirect("login.jsp?username="+username+"&authority="+authority);
            }
        }
        else if ("2".equals(authority)){
            //登录是超级用户
            if ("lisi".equals(username) && "456".equals(password)){
                user.setUsername(username);
                user.setPassword(password);
                user.setAuthority(authority);
                //将用户放到session中
                session.setAttribute("user", user);
                resp.sendRedirect("index.jsp");
//                req.getRequestDispatcher("index.jsp").forward(req, resp);
            }else {
               /* req.setAttribute("username", username);
                req.setAttribute("password", password);
                req.setAttribute("authority",authority);
                req.getRequestDispatcher("login.jsp").forward(req,resp);*/
                resp.sendRedirect("login.jsp?username="+username+"&authority="+authority);
            }
        }
        else {
            /*req.setAttribute("username", username);
            req.setAttribute("password", password);
            req.setAttribute("authority",authority);
            req.getRequestDispatcher("login.jsp").forward(req,resp);*/
            resp.sendRedirect("login.jsp?username="+username+"&authority="+authority);
        }
    }
}
