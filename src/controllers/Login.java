package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ValidateUserDao;
import model.HdzApplicant;
import model.HdzEmployee;
import util.Gravatar;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		HdzApplicant applicant = null;
		HdzEmployee employee = null;
		String nextURL = "/error.jsp";
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String loginrole = request.getParameter("loginrole");		

		if (loginrole.equals("applicant")) {
		// validate an applicant
			applicant = ValidateUserDao.getValidApplicant(email, password);
			if (applicant != null) {
				session.setAttribute("user", applicant);
				session.setAttribute("role",  "applicant");
				session.setAttribute("userrole",  1);
				session.setAttribute("gravatar", Gravatar.getGravatarUrl(email));
				
				nextURL = "/yourapplications.jsp";
			} else {
				request.setAttribute("message",  "Applicant not found. Please login again or create a new account.");
				nextURL = "/login.jsp";
			}
			
			
		} else {
			// validate an employee user
			employee = ValidateUserDao.getValidEmployee(email, password);		
			if (employee != null) {
				session.setAttribute("user", employee);
				session.setAttribute("role",  employee.getPosition().replaceAll(" ", ""));
				session.setAttribute("userrole",  2);
				nextURL = "/PendingAction";
			} else {
				request.setAttribute("message",  "Employee not found. Please enter a valid email and password.");
				nextURL = "/login.jsp";
			}
		}
		request.getRequestDispatcher(nextURL).forward(request,response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
