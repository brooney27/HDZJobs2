package controllers;

import java.io.IOException;
import java.util.List;

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
				InterviewService.updateApplication(myapplication);
				
				List<HdzApplication> finalreport=RoleActionService.getActionsHiringManagerReport();
				
				session.setAttribute("finalreport", finalreport);
				request.setAttribute("message", "The applicant has been hired!!");
				request.getRequestDispatcher(url).forward(request, response);
				
			}else
			{
				
				request.setAttribute("message", "You need to validate education, nationality and drug screen!!");
				
				request.getRequestDispatcher(url).forward(request, response);
			}
			
			
			
		}
		if(failid!=null)
		{
			HdzApplication myapplication=dao.PendingActionsDao.getapplicationbyapplicationid(failid);
			myapplication.setAppstatus("Fail");
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
