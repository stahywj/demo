package Bean;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kenneth on 2016/7/29.
 */
public class InitServlet extends HttpServlet{
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("hello");
        System.out.println("init invoked!");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doget invoked!");
    }

    @Override
    public void destroy() {
        System.out.println("destory invoked!");
    }
}
