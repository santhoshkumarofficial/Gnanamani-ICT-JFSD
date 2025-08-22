package explore;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.ArrayList;
import java.util.List;

@WebListener
public class PatientListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("hjfv678","Kathir",178.0,65.5,30,8765678454L));
        patients.add(new Patient("ygh7878","Revanth",156.6,95.5,32,456789456L));
        patients.add(new Patient("kdf98767","Mahesh",187,55.5,31,5678987678L));
        patients.add(new Patient("h67878","Victor",145.0,35.5,39,9876567876L));
        sce.getServletContext().setAttribute("patients", patients);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
