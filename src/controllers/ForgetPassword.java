package controllers;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ValidateUserDao;
import model.HdzApplicant;
import model.HdzEmployee;
import util.Email;
import util.PasswordUtil;

/**
 * Servlet implementation class ForgetUserName
 */
@WebServlet("/ForgetPassword")
public class ForgetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgetPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		
		String method = request.getParameter("method");
		
		if(method!=null)
		{
			if(method.equals("Validate"))
			{
				if(ValidateUserDao.getValidApplicant(email)==null&&ValidateUserDao.getValidEmployee(email)==null)
				{
					request.setAttribute("message", "There is no user matched!!");
					
					request.getRequestDispatcher("/forgetpassword.jsp").forward(request,response);	
				}
				else
				{
					if(ValidateUserDao.getValidApplicant(email)!=null)
					{
						HdzApplicant user=ValidateUserDao.getValidApplicant(email);
						
						request.setAttribute("message", "Your password has been reset and sent to your email!!");
						
						
						try {
							Email.sendEmail("study.javaclass@gmail.com ", "study.javaclass@gmail.com ", "Password Reset", "Hi "+user.getFirstname()+",<br/><br/> Your password has been reset as "+user.getFirstname()+"1234, Please log in with your new password.  <br/> <br/>Thank you very much!!<br/> <br/> Best,<br/> <br/> HDZ Jobs <br/>", true);
						} catch (MessagingException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						String password=user.getFirstname()+"1234";
						
						String salt = PasswordUtil.getSalt();
						String hashedPwd = "";
						try {
							hashedPwd = PasswordUtil.hashPasswordPlusSalt(password, salt);
						} catch (NoSuchAlgorithmException e) {
							e.printStackTrace();
						}
						user.setSalt(salt);
						user.setHashedpwd(hashedPwd);
						
						dao.PendingActionsDao.update(user);
						
						request.getRequestDispatcher("/forgetpassword.jsp").forward(request,response);	
						
						
					}
					else if(ValidateUserDao.getValidEmployee(email)!=null)
					{
						HdzEmployee user =ValidateUserDao.getValidEmployee(email);
						
						request.setAttribute("message", "Your password has been reset and sent to your email!!");
						
						
						try {
							Email.sendEmail("study.javaclass@gmail.com ", "study.javaclass@gmail.com ", "Password Reset", "Hi "+user.getEmpname()+",<br/><br/> Your password has been reset as "+user.getEmpname()+"1234, Please log in with your new password.  <br/> <br/>Thank you very much!!<br/> <br/> Best,<br/> <br/> HDZ Jobs <br/>", true);
						} catch (MessagingException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						String password=user.getEmpname()+"1234";
						
						String salt = PasswordUtil.getSalt();
						String hashedPwd = "";
						try {
							hashedPwd = PasswordUtil.hashPasswordPlusSalt(password, salt);
						} catch (NoSuchAlgorithmException e) {
							e.printStackTrace();
						}
						user.setSalt(salt);
						user.setHashedpwd(hashedPwd);
						
						dao.PendingActionsDao.update(user);;
						
						request.getRequestDispatcher("/forgetpassword.jsp").forward(request,response);	
						
						
					}
				}
				
			}
			else if(method.equals("Cancel"))
			{
				request.getRequestDispatcher("/login.jsp").forward(request,response);
			}
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
