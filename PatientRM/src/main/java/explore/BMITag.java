package explore;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class BMITag extends SimpleTagSupport {
    private double weight;
    private double height;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void doTag() throws JspException, IOException {
//        super.doTag();
        height /= 100;
        double bmi = weight / (height * height);
        JspWriter out = getJspContext().getOut();
        out.print(bmi);
    }
}
