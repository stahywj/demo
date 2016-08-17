package listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by kenneth on 2016/8/4.
 */
public class MySessionListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("session created");
        System.out.println(httpSessionEvent.getSession());
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("session destroyed");
        System.out.println(httpSessionEvent.getSession());
    }
}
