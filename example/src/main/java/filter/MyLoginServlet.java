package filter;

import Bean.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by kenneth on 2016/8/3.
 */
public class MyLoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String authority = req.getParameter("authority");

        User user = new User();
        HttpSession session = req.getSession();

        if ("1".equals(authority)){
            if ("zhangsan".equals(username) && "123".equals(password)){
                user.setUsername(username);
                user.setPassword(password);
                user.setAuthority(authority);
                session.setAttribute("user", user);
                req.getRequestDispatcher("/filter/index.jsp").forward(req, resp);

            }else {
                resp.sendRedirect("/filter/login.jsp?username="+username+"&authority="+authority);
            }
        }
        else if ("2".equals(authority)){
            if ("lisi".equals(username) && "456".equals(password)){
                user.setUsername(username);
                user.setPassword(password);
                user.setAuthority(authority);
                session.setAttribute("user", user);

                resp.sendRedirect("/filter/index.jsp");
            }else {
                resp.sendRedirect("/filter/login.jsp?username="+username+"&authority="+authority);
            }
        }
        else {
            resp.sendRedirect("/filter/login.jsp?username="+username+"&authority="+authority);
        }
    }

}
