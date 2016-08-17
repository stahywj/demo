package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by kenneth on 2016/8/3.
 */
public class LoginFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init invoked!");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpServletResponse resp = (HttpServletResponse)servletResponse;

        if (req.getRequestURI().endsWith("login.jsp") || req.getRequestURI().endsWith("MyLoginServlet")){
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        HttpSession session = req.getSession();
        if (null == session.getAttribute("user")){
            ((HttpServletResponse)servletResponse).sendRedirect("login.jsp");
            return;
        }else {
            filterChain.doFilter(servletRequest, servletResponse);
        }

    }

    public void destroy() {

    }
}
