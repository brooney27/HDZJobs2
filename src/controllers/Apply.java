package controllers;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ApplicantDao;
import model.HdzApplicant;
import model.HdzApplication;
import model.HdzJob;
import util.Email;

/**
 * Servlet implementation class Apply
 */
@WebServlet("/Apply")
public class Apply extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Apply() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String jobid = request.getParameter("jobid");
		
		HdzApplicant applicant = (HdzApplicant)session.getAttribute("user");
		HdzJob job = ApplicantDao.getJobById(jobid);
		HdzApplication application = new HdzApplication();
		List<HdzApplication> myapps = applicant.getHdzApplications();
		
		application.setAppstatus("New");
		try {
			Email.sendEmail("study.javaclass@gmail.com ", "study.javaclass@gmail.com ", "Congratulations!! You have successfully applied this job!", "Hi "+applicant.getFirstname()+",<br/><br/> You have successfully applied "+job.getPosition()+". We will reach you soon!!<br/><br/> Thank you for choosing HDZ Jobs!! <br/><br/> Best,<br/> <br/>HDZ Jobs <br/>", true);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(applicant.getHdzEmployee()!=null)application.setAppstatus("WorkRefsChecked");
		
		try {
			Email.sendEmail("study.javaclass@gmail.com ", "study.javaclass@gmail.com ", "Congratulations!! You have successfully applied this job!", "Hi "+applicant.getFirstname()+",<br/><br/> You have successfully applied "+job.getPosition()+". Your application has been set as WorkRefsChecked! We will reach you soon!!<br/> Thank you for choosing HDZ Jobs!! <br/><br/> Best,<br/><br/> HDZ Jobs <br/>", true);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		application.setCodingtest("N");
		application.setHdzJob(job);
		application.setHdzApplicant(applicant);
		myapps.add(application);
		applicant.setHdzApplications(myapps);
		ApplicantDao.insert(application);
		ApplicantDao.update(applicant);
		session.setAttribute("user", applicant);
		
		request.getRequestDispatcher("/yourapplications.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
