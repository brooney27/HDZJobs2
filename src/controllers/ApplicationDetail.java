package controllers;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.*;
import services.QualifiedService;
/**
 * Servlet implementation class ApplicationDetail
 */
@WebServlet("/ApplicationDetail")
public class ApplicationDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		HttpSession session = request.getSession();	
		String applicationid=request.getParameter("applicationid");
		
		
		HdzApplication myapplication=dao.PendingActionsDao.getapplicationbyapplicationid(applicationid);
		
		
		HashMap<Long, String> jobskillmap=QualifiedService.gethashmapSkillsbyJob();
		
		HashMap<Long, String> applicantmap=QualifiedService.gethashmapSkillsbyApplicant();
		
		 request.setAttribute("applicantskill", applicantmap);
		
		request.setAttribute("jobskill", jobskillmap);
		
		
		session.setAttribute("myapplicaitondetail", myapplication);
		
		request.getRequestDispatcher("applicationdetail.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
