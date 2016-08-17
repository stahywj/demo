package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Created by kenneth on 2016/8/4.
 */
public class MyServletContextAttributeListener implements ServletContextAttributeListener {
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("attribute added");
        System.out.println(servletContextAttributeEvent.getName()+" : "+servletContextAttributeEvent.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("attribute removed");
        System.out.println(servletContextAttributeEvent.getName()+" : "+servletContextAttributeEvent.getValue());
    }

    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("attribute replaced");
        System.out.println(servletContextAttributeEvent.getName()+" : "+servletContextAttributeEvent.getValue());
    }
}
