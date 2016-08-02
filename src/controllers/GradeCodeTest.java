package controllers;

import java.io.IOException;
import java.math.BigDecimal;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.HdzApplication;
import services.InterviewService;
import util.Email;

/**
 * Servlet implementation class GradeCodeTest
 * @author Brian
 */
@WebServlet("/GradeCodeTest")
public class GradeCodeTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GradeCodeTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int questions=0;
		int numCorrect=0;
		int questionid = 1;
		
		String appid = request.getParameter("appid");
		
		HdzApplication application = InterviewService.getHdzApplication(appid);
		
		while(questions<10){
			String useranswer = request.getParameter("response"+questionid);
			String answer = request.getParameter("answer"+questionid);
			System.out.println("Response: "+useranswer+" Correct answer: "+answer);
			if(useranswer!=null){
				questions++;
				if(useranswer.equals(answer))numCorrect++;
			}
			questionid++;
		}
		
		application.setCodingtestscore(new BigDecimal(numCorrect));
		if(numCorrect>6){
			application.setCodingtest("Y");
		}
		else{
			application.setCodingtest("N");
			application.setAppstatus("Fail");
			
			try {
				Email.sendEmail("study.javaclass@gmail.com ", "study.javaclass@gmail.com ", "Sorry!! You have failed this job!", "Hi "+application.getHdzApplicant().getFirstname()+",<br/><br/> You have failed  "+application.getHdzJob().getPosition()+". Your application has been set as Fail! <br/><br/> Thank you for choosing HDZ Jobs!! <br/> <br/> Best,<br/> <br/> HDZ Jobs <br/>", true);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		InterviewService.updateApplication(application);
		
		request.getRequestDispatcher("/PendingAction").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
