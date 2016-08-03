package controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import model.*;
import model.HdzEmployee;
import services.InterviewService;

/**
 * Servlet implementation class InterviewForm
 * @author Navreet, Xiaoyu He
 */
@WebServlet("/InterviewForm")
public class InterviewForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InterviewForm() {
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
		hdzApplication.setCodingtest(InterviewService.getCodingTest(hdzApplication.getApplicationid()));
		session.setAttribute("app", hdzApplication);
		if (employee == null) {
			request.setAttribute("message", "Log in!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			String role = (String) session.getAttribute("role");
			if (role.equals("HiringManager")) {
				session.setAttribute("interviewType", "HM Interview");
				session.setAttribute("coding", InterviewService.getCodingTest(hdzApplication.getApplicationid()));
				List<HdzInterviewquest> questions=InterviewService.getInterviewquestionbyjobid("HM Interview", hdzApplication.getHdzJob().getJobsid());
				
				session.setAttribute("interviewquestion", questions);
				
				
				long score=InterviewService.getscore(hdzApplication.getApplicationid(), "HM Interview");
				
				BigDecimal totalscore=InterviewService.gettotalscore(hdzApplication.getApplicationid());
				
				session.setAttribute("totalscore", totalscore);
				
				session.setAttribute("interviewscore", score);
				
			} else if (role.equals("HRManager")) {
				session.setAttribute("interviewType", "HR Interview");	
				List<HdzInterviewquest> questions=InterviewService.getInterviewquestionbyjobid("HR Interview", hdzApplication.getHdzJob().getJobsid());
				
				session.setAttribute("interviewquestion", questions);
				long score=InterviewService.getscore(hdzApplication.getApplicationid(), "HR Interview");
			
				BigDecimal totalscore=InterviewService.gettotalscore(hdzApplication.getApplicationid());
				
				session.setAttribute("totalscore", totalscore);
				
				session.setAttribute("interviewscore", score);
				
				
			} else {
				session.setAttribute("interviewType", "Group Interview");
				session.setAttribute("coding", InterviewService.getCodingTest(hdzApplication.getApplicationid()));
				
				List<HdzInterviewquest> questions=InterviewService.getInterviewquestionbyjobid("Group Interview", hdzApplication.getHdzJob().getJobsid());
				
				session.setAttribute("interviewquestion", questions);
				
				long score=InterviewService.getscore(hdzApplication.getApplicationid(), "Group Interview");
				BigDecimal totalscore=InterviewService.gettotalscore(hdzApplication.getApplicationid());
				
				session.setAttribute("totalscore", totalscore);
				
				session.setAttribute("interviewscore", score);
				
			} 
			request.getRequestDispatcher("interview.jsp").forward(request, response);
		}
	}

}
