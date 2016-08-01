package controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ApplicationsDao;
import model.HdzApplicant;
import model.HdzApplication;
import model.HdzJobskillbridge;
import services.QualifiedService;

/**
 * Servlet implementation class ViewApplications
 */
@WebServlet("/ViewApplications")
public class ViewApplications extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewApplications() {
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
		
	
		
		
		try {
			
			//HttpSession session = request.getSession();
			String position = request.getParameter("position");
			List<HdzApplication> apps = ApplicationsDao.getapplications(position);
			
			if(position==null)
			{
				apps=ApplicationsDao.getallapplications();
			}

			HashMap<Long, String> jobskillmap=QualifiedService.gethashmapSkillsbyJob();
			
			request.setAttribute("mapskill", jobskillmap);
			
			//String method= (String) request.getParameter("match");
			
			
			
				String jobid=(String)request.getParameter("jobid");
				
				if(jobid!=null)
				{
				
				List<HdzJobskillbridge> mybridge=QualifiedService.getSkillsbyJob(Long.parseLong(jobid));
				
				List<HdzApplicant> mycandidates=QualifiedService.getQualifiedApplicants(mybridge);
				
				request.setAttribute("candidates", mycandidates);
				request.setAttribute("applicationsSearch", apps);
				
				}
			
			
			
			if (apps== null || apps.size() ==0) {
				request.setAttribute("message", "No Results!!");
				request.setAttribute("applicationsSearch", null);
			} else {
				request.setAttribute("applicationsSearch", apps);
			}
			request.getRequestDispatcher("/PendingAction").forward(request, response);
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	
	}

}
