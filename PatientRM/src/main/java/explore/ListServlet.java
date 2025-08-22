package explore;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    public List<Patient> getPatients() {
        return (List<Patient>) getServletContext().getAttribute("patients");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Patient> myPatients = getPatients();
        RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
        request.setAttribute("people", myPatients);
        rd.forward(request,response);
    }
}
