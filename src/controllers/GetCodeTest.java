package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CodeTestDao;
import model.HdzApplication;
import model.HdzCodingquest;
import services.InterviewService;

/**
 * Servlet implementation class CodeTest
 */
@WebServlet("/GetCodeTest")
public class GetCodeTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCodeTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String appid = request.getParameter("appid");
		
		HdzApplication app = InterviewService.getHdzApplication(appid);
		
		request.setAttribute("application", app);
		
		List<HdzCodingquest> questions = CodeTestDao.getCodeQuestions();
		
		request.setAttribute("questions", questions);
		
		request.getRequestDispatcher("/codetest.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
