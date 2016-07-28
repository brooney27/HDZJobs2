package controllers;

import java.io.IOException;

import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.InterviewDao;
import model.*;
import services.InterviewService;
/**
 * Servlet implementation class PassQuestion
 */
@WebServlet("/PassQuestion")
public class PassQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassQuestion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();	
		
		String passquestionid=request.getParameter("passquestionid");
		
		String passapplicationid=request.getParameter("passapplicationid");
		String passinterviewtype=request.getParameter("passinterviewtype");
		String failquestionid=request.getParameter("failquestionid");
		
		String failapplicationid=request.getParameter("failapplicationid");
		String failinterviewtype=request.getParameter("failinterviewtype");
		
		if(passquestionid!=null&&passapplicationid!=null&&passinterviewtype!=null)
		{
			HdzApplication myapplication=InterviewDao.getHdzApplication(passapplicationid);
			HdzInterviewquest myquestion=InterviewDao.getInterviewquestion(passquestionid);
			HdzInterviewresp interviewresponse=new HdzInterviewresp();
			interviewresponse.setHdzApplication(myapplication);
			interviewresponse.setHdzInterviewquest(myquestion);
			interviewresponse.setInterviewtype(passinterviewtype);
			interviewresponse.setQuestionflag("P");		
			InterviewService.insert(interviewresponse);
			
			long score=InterviewService.getscore(Long.parseLong(passapplicationid), passinterviewtype);
			
			session.setAttribute("interviewscore", score);
			
			
			request.getRequestDispatcher("interview.jsp").forward(request, response);
		}
		if(failquestionid!=null&&failapplicationid!=null&&failinterviewtype!=null)
		{
			HdzApplication myapplication=InterviewDao.getHdzApplication(failapplicationid);
			HdzInterviewquest myquestion=InterviewDao.getInterviewquestion(failquestionid);
			HdzInterviewresp interviewresponse=new HdzInterviewresp();
			interviewresponse.setHdzApplication(myapplication);
			interviewresponse.setHdzInterviewquest(myquestion);
			interviewresponse.setInterviewtype(failinterviewtype);
			interviewresponse.setQuestionflag("F");		
			InterviewService.insert(interviewresponse);
			
			long score=InterviewService.getscore(Long.parseLong(failapplicationid), failinterviewtype);
			
			session.setAttribute("interviewscore", score);
			
			request.getRequestDispatcher("interview.jsp").forward(request, response);
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
