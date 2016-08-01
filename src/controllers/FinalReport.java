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

import dao.PendingActionsDao;
import model.*;
import services.InterviewService;
import services.RoleActionService;
import util.Email;

/**
 * Servlet implementation class FinalReport
 */
@WebServlet("/FinalReport")
public class FinalReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalReport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();	
		
		String hireid=request.getParameter("hireappid");	
		
		String failid=request.getParameter("failappid");	
		
		String url = "/PendingAction";
		
		if(hireid!=null)
		{
			HdzApplication myapplication=dao.PendingActionsDao.getapplicationbyapplicationid(hireid);
			
			if (PendingActionsDao.checkAppStatus(myapplication))
			{
				
				System.out.println("check status");
				myapplication.setAppstatus("Hired");	
				
				try {
					Email.sendEmail("study.javaclass@gmail.com ", "study.javaclass@gmail.com ", "Congratulations!! You have got this job!", "Hi "+myapplication.getHdzApplicant().getFirstname()+",<br/><br/> You got the job:  "+myapplication.getHdzJob().getPosition()+". Your application has been set as hired! We will reach you soon!<br/> <br/>Thank you for choosing HDZ Jobs!! <br/> <br/>Best,<br/><br/> HDZ Jobs <br/>", true);
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				InterviewService.updateApplication(myapplication);
				
				List<HdzApplication> finalreport=RoleActionService.getActionsHiringManagerReport();
				
				session.setAttribute("finalreport", finalreport);
				request.setAttribute("message", "The applicant has been hired!!");
				request.getRequestDispatcher(url).forward(request, response);
				
			}else
			{
				
				String message="";
				
				System.out.println("in message");
				
				if(myapplication.getHdzApplicant().getDrugtestflag()==null)
				{
					message+="You need to validate drug test! <br/>";
				}
				else if(myapplication.getHdzApplicant().getDrugtestflag().equals("N"))
				{
					message+="Your drug test is faled! <br/>";
				}
				
				if(myapplication.getHdzApplicant().getCitizenflag()==null||myapplication.getHdzApplicant().getVisaflag()==null)
				{
					message+="You need to validate nationality! <br/>";
				}
				else if (myapplication.getHdzApplicant().getCitizenflag().equals("N")||myapplication.getHdzApplicant().getVisaflag().equals("N"))
				{
					message+="Your nationality check is failed! <br/>";
				}		
				
				
				if(PendingActionsDao.checkEducation(myapplication)==false)
				{
					message+="You need to validate education! <br/>";
				}
				
				System.out.println("in message"+ message);
				
				request.setAttribute("message", message);
				
				request.getRequestDispatcher(url).forward(request, response);
			}
			
			
			
		}
		if(failid!=null)
		{
			HdzApplication myapplication=dao.PendingActionsDao.getapplicationbyapplicationid(failid);
			myapplication.setAppstatus("Fail");
			try {
				Email.sendEmail("study.javaclass@gmail.com ", "study.javaclass@gmail.com ", "Sorry!! You have failed this job!", "Hi "+myapplication.getHdzApplicant().getFirstname()+",<br/><br/> You have failed  "+myapplication.getHdzJob().getPosition()+". Your application has been set as Fail! <br/><br/> Thank you for choosing HDZ Jobs!! <br/><br/> Best,<br/><br/> HDZ Jobs <br/>", true);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			InterviewService.updateApplication(myapplication);
			
			List<HdzApplication> finalreport=RoleActionService.getActionsHiringManagerReport();
			
			session.setAttribute("finalreport", finalreport);
			
			request.setAttribute("message", "The applicant is failed!!");
			
			request.getRequestDispatcher(url).forward(request, response);
			
		}
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
