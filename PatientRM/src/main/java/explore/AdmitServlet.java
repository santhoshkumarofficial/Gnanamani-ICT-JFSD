package explore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/enroll")
public class AdmitServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // receive the data from jsp using request parameter
        Patient obj = new Patient();
        obj.setPatientId(req.getParameter("patientId"));
        obj.setPatientName(req.getParameter("patientName"));
        obj.setHeight(Double.parseDouble(req.getParameter("height")));
        obj.setWeight(Double.parseDouble(req.getParameter("weight")));
        obj.setAge(Integer.parseInt(req.getParameter("age")));
        obj.setContactNo(Long.parseLong(req.getParameter("contactNo")));

        HttpSession session = req.getSession();
        List<Patient> myPatients = (List<Patient>) session.getAttribute("people");
        myPatients.add(obj);
        resp.sendRedirect("/PatientRM_war/list");
    }
}
