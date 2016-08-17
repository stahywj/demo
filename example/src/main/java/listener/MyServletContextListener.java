package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by kenneth on 2016/8/4.
 */
public class MyServletContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("init" + servletContextEvent.getServletContext());
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("destory" + servletContextEvent.getServletContext());
    }
}
