package Tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

/**
 * Created by kenneth on 2016/8/5.
 */
public class MyTag extends TagSupport {
    @Override
    public int doStartTag() throws JspException {
        try {
            //向页面输出文本字符串
            this.pageContext.getOut().println("hello world");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag() throws JspException {
        try {
            this.pageContext.getOut().println("welcome");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return EVAL_PAGE;
    }
}
