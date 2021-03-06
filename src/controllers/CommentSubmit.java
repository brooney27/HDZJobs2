package controllers;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.*;
import services.InterviewService;

/**
 * Servlet implementation class CommentSubmit
 */
@WebServlet("/CommentSubmit")
public class CommentSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentSubmit() {
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
		System.out.println("in com sub");
		String comment = request.getParameter("commentInterview"); 
				if (comment != null && !comment.equals("")) {
					comment += "<br/>";
					request.getSession().setAttribute("commentInterview", comment);
				} else {
					request.getSession().setAttribute("commentInterview", null);
				}				
				
		System.out.println("com sub" + comment);
		
		
		
		
		
	}

}
