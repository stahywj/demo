package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kenneth on 2016/8/4.
 */
public class MessageFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init invoked!!!!");
        String value1 = filterConfig.getInitParameter("hello");
        System.out.println(value1);
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpServletResponse resp = (HttpServletResponse)servletResponse;

        String username = req.getParameter("username");
        String message = req.getParameter("message");

        username = username.replaceAll("zhang", "lisi");
        message = message.replaceAll("shengsiyuan", "****");
        System.out.println(username);
        System.out.println(message);

        req.setAttribute("username", username);
        req.setAttribute("message", message);

        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
