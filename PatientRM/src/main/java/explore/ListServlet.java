package explore;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    public List<Patient> getPatients() {
        return (List<Patient>) getServletContext().getAttribute("patients");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Patient> myPatients = getPatients();
        HttpSession session = request.getSession(true);
        session.setAttribute("people", myPatients);
        RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
//        request.setAttribute("people", myPatients);
        // sending cookies
        Cookie cookie1 = new Cookie("zoho","https://zoho.com");
        response.addCookie(cookie1);
        rd.forward(request,response);
    }
}
