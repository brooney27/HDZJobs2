package controllers;

import java.io.IOException;
import java.math.BigDecimal;

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
 * @author Xiaoyu He
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
			HdzInterviewresp interviewresponse=InterviewDao.getinterviewresp(Long.parseLong(passapplicationid), passinterviewtype, Long.parseLong(passquestionid));
			if(interviewresponse==null)
			{
				HdzInterviewresp myresponse=new HdzInterviewresp();
				myresponse.setHdzApplication(myapplication);
				myresponse.setHdzInterviewquest(myquestion);
				myresponse.setInterviewtype(passinterviewtype);
				myresponse.setQuestionflag("P");	
				InterviewService.insert(myresponse);
				
			}
			else
			{
				interviewresponse.setHdzApplication(myapplication);
				interviewresponse.setHdzInterviewquest(myquestion);
				interviewresponse.setInterviewtype(passinterviewtype);
				interviewresponse.setQuestionflag("P");					
				
				InterviewService.update(interviewresponse);
			}
			
			long score=InterviewService.getscore(Long.parseLong(passapplicationid), passinterviewtype);
			HdzInterview interview=InterviewService.getinterview(Long.parseLong(passapplicationid), passinterviewtype);
			
			if(interview==null)
			{
				HdzInterview myinterview=new HdzInterview();
				myinterview.setHdzApplication(myapplication);
				
				myinterview.setInterviewtype(passinterviewtype);
				
				myinterview.setScore(new BigDecimal(score));
				
				InterviewService.insert(myinterview);
				
				BigDecimal totalscore=InterviewService.gettotalscore(Long.parseLong(passapplicationid));
				
				myapplication.setAppscore(totalscore);
				
				InterviewService.updateApplication(myapplication);		
				
				
			}
			else
			{
				interview.setHdzApplication(myapplication);
				
				interview.setInterviewtype(passinterviewtype);
				
				interview.setScore(new BigDecimal(score));
				
				InterviewService.update(interview);
				
				BigDecimal totalscore=InterviewService.gettotalscore(Long.parseLong(passapplicationid));
					
				myapplication.setAppscore(totalscore);
				
				InterviewService.updateApplication(myapplication);		
				
				
			}
					
			
			BigDecimal totalscore=InterviewService.gettotalscore(myapplication.getApplicationid());
			
			session.setAttribute("totalscore", totalscore);
			
			System.out.println("totalscore"+totalscore);
			
			session.setAttribute("interviewscore", score);
			
			request.getRequestDispatcher("interview.jsp").forward(request, response);
		}
		if(failquestionid!=null&&failapplicationid!=null&&failinterviewtype!=null)
		{
			HdzApplication myapplication=InterviewDao.getHdzApplication(failapplicationid);
			HdzInterviewquest myquestion=InterviewDao.getInterviewquestion(failquestionid);
			HdzInterviewresp interviewresponse=InterviewDao.getinterviewresp(Long.parseLong(failapplicationid), failinterviewtype, Long.parseLong(failquestionid));
			
			if(interviewresponse==null)
			{
				HdzInterviewresp myresponse=new HdzInterviewresp();
				myresponse.setHdzApplication(myapplication);
				myresponse.setHdzInterviewquest(myquestion);
				myresponse.setInterviewtype(failinterviewtype);
				myresponse.setQuestionflag("F");		
				InterviewService.insert(myresponse);
			}
			else
			{
			interviewresponse.setHdzApplication(myapplication);
			interviewresponse.setHdzInterviewquest(myquestion);
			interviewresponse.setInterviewtype(failinterviewtype);
			interviewresponse.setQuestionflag("F");		
			InterviewService.update(interviewresponse);
			}
			long score=InterviewService.getscore(Long.parseLong(failapplicationid), failinterviewtype);
			
			BigDecimal totalscore=InterviewService.gettotalscore(Long.parseLong(failapplicationid));
			
			System.out.println("totalscore"+totalscore);
			
			session.setAttribute("totalscore", totalscore);
			
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
