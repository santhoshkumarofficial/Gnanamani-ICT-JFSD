package explore;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/simple")
public class Api extends HttpServlet {
    String content = "";
    @Override
    public void init() throws ServletException {
        super.init();
        content += "Initialized";
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        content += "Processing";
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>"+content+"</h1>");
    }

    @Override
    public void destroy() {
        super.destroy();
        content += "Destroyed";
        System.out.println(content);
    }
}
