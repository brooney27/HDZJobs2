package controllers;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.PendingActionsDao;
import model.HdzApplication;
import model.HdzEmployee;
import model.HdzInterview;
import services.InterviewService;

/**
 * Servlet implementation class InterviewReportSubmission
 */
@WebServlet("/InterviewReportSubmission")
public class InterviewReportSubmission extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InterviewReportSubmission() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		HdzEmployee employee = (HdzEmployee)session.getAttribute("user");
		HdzApplication hdzApplication = (HdzApplication) session.getAttribute("app");
		String url = "/PendingAction";
		String comment = (String)session.getAttribute("commentInterview"); 
		System.out.println("Interview comment: " + comment);
		
		String score = request.getParameter("score"); 
		String appid=request.getParameter("appid");
		String type=request.getParameter("type");
		
		System.out.println(score);
		
		if (employee == null) {
			request.setAttribute("message", "Log in!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			if (comment != null && !comment.equals("")) {
				String x = InterviewService.getComment(hdzApplication);
				if (x != null) {
					comment +=   "<br/>" + x;
				}
				
				hdzApplication.setComments(employee.getEmpname() + " ("+ 
						employee.getPosition()+"): " + comment);
			}
			
			
			if(score!=null &&appid!=null &&type!=null)
			{
			HdzInterview interview=InterviewService.getinterview(Long.parseLong(appid), type);
			HdzApplication application=InterviewService.getHdzApplication(appid);
			
					
			if(interview==null)
			{
				HdzInterview myinterview=new HdzInterview();
				myinterview.setHdzApplication(application);
				
				myinterview.setInterviewtype(type);
				
				myinterview.setScore(new BigDecimal(score));
				
				InterviewService.insert(myinterview);
				
				BigDecimal totalscore=InterviewService.gettotalscore(Long.parseLong(appid));
				
				hdzApplication.setAppscore(totalscore);
				
				InterviewService.updateApplication(hdzApplication);
				
				
				session.setAttribute("app", hdzApplication);
				
				
			}
			else
			{
				interview.setHdzApplication(application);
				
				interview.setInterviewtype(type);
				
				interview.setScore(new BigDecimal(score));
				
				InterviewService.update(interview);
				
				BigDecimal totalscore=InterviewService.gettotalscore(Long.parseLong(appid));
					
				hdzApplication.setAppscore(totalscore);
				
				InterviewService.updateApplication(hdzApplication);
				
				
				session.setAttribute("app", hdzApplication);
			}
			
			
			

			
			}
			
			String groupInterview = request.getParameter("groupInterview");
			
			String hmInterview = request.getParameter("hmInterview");
			String hrInterview = request.getParameter("hrInterview");
			if (hrInterview != null) {
				if (hrInterview.equals("Pass")) {
					hdzApplication.setAppstatus("HRInterviewDone");					
					InterviewService.updateApplication(hdzApplication);
				} else {
					hdzApplication.setAppstatus("Fail");					
					InterviewService.updateApplication(hdzApplication);
					request.setAttribute("message", "Letter sent to Applicant");
				}
				
				
			}
			
			
			if (hmInterview != null) {
				if (hmInterview.equals("Pass")) {
					hdzApplication.setAppstatus("HMInterviewDone");					
					InterviewService.updateApplication(hdzApplication);
				} else {
					hdzApplication.setAppstatus("Fail");					
					InterviewService.updateApplication(hdzApplication);
					request.setAttribute("message", "Letter sent to Applicant");
				}
				
			}
			
			
			if (groupInterview != null) {
				if (groupInterview.equals("Pass")) {
					if (InterviewService.getCodingTest(hdzApplication.getApplicationid()).equals("N")) {
						request.setAttribute("message", "Coding Test has to be completed");
						url = "/InterviewForm";
					} else {
						hdzApplication.setAppstatus("GroupInterviewDone");					
						InterviewService.updateApplication(hdzApplication);
						
					}
					
				} else {
					hdzApplication.setAppstatus("Fail");	
					request.setAttribute("message", "Letter sent to Applicant");
					InterviewService.updateApplication(hdzApplication);
					
				}
				
			}
			request.getRequestDispatcher(url).forward(request, response);
			
		}
	}

}
