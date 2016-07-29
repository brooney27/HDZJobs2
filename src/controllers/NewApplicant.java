package controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ApplicantDao;
import dao.ValidateUserDao;
import model.HdzApplicant;
import model.HdzAward;
import model.HdzEducation;
import model.HdzEmployee;
import model.HdzJobhistory;
import model.HdzReftable;
import model.HdzSkill;
import model.HdzSkillappbridge;
import services.NewApplicantService;
import util.PasswordUtil;

/**
 * Servlet implementation class NewApplicant
 */
@WebServlet("/NewApplicant")
public class NewApplicant extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NewApplicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String bday = request.getParameter("dob");
		String veteran = request.getParameter("veteran");
		String citizen = request.getParameter("citizen");
		String phone = request.getParameter("phone");
		String summary = request.getParameter("summary");
		String objective = request.getParameter("objective");
		
		List<HdzEducation> edhist = new ArrayList<HdzEducation>();
		List<HdzJobhistory> jobhist = new ArrayList<HdzJobhistory>();
		List<HdzReftable> references=new ArrayList<HdzReftable>();
		List<HdzSkillappbridge> skills=new ArrayList<HdzSkillappbridge>();
		List<HdzAward> awards=new ArrayList<HdzAward>();
		for (int i = 1; i <= 3; i++) {
			System.out.println("Looping through parameters... " + i);
			HdzEducation edu = new HdzEducation();
			HdzJobhistory job = new HdzJobhistory();
			HdzReftable reference = new HdzReftable();
			HdzSkill skill = new HdzSkill();
			HdzAward award = new HdzAward();
			HdzSkillappbridge userskill = new HdzSkillappbridge();
			
			String schoolname = request.getParameter("edu" + i);
			String degree = request.getParameter("degree" + i);
			String datecomp = request.getParameter("date" + i);
			
			if (!schoolname.equals("") && !degree.equals("") && !datecomp.equals("")) {
				edu.setDegreecompleted(degree);
				edu.setDatecompleted(datecomp);
				edu.setSchoolname(schoolname);
				edhist.add(edu);
			}
			
			String jobTitle = request.getParameter("job" + i);
			String company = request.getParameter("company" + i);
			String jobdesc = request.getParameter("jobdesc" + i);
			String startdate=request.getParameter("start"+i);
			String enddate=request.getParameter("leave"+i);
			
			if (!jobTitle.equals("") && !company.equals("") && !jobdesc.equals("")) {
				job.setCompanyname(company);
				job.setDescription(jobdesc);
				job.setStartdate(startdate);
				job.setPosition(jobTitle);
				job.setEnddate(enddate);
				jobhist.add(job);
			}
			
			String refname=request.getParameter("refname"+i);
			String refnumber=request.getParameter("refphone"+i);
			String refemail=request.getParameter("refemail"+i);
			String refposition=request.getParameter("refpos"+i);
			
			if(!refname.equals("")&&!refnumber.equals("")&&!refemail.equals("")&&!refposition.equals("")){
				reference.setRefemail(refemail);
				reference.setRefname(refname);
				reference.setRefphone(refnumber);
				reference.setRefposition(refposition);
				references.add(reference);
			}
			
			
			String awardname=request.getParameter("award"+i);
			String awardyear=request.getParameter("awyear"+i);
			
			if(!awardname.equals("")){
				award.setAwardname(awardname);
				award.setAwardyear(awardyear);
				awards.add(award);
			}
			
			String skillname=request.getParameter("skill"+i);
			String skillyear=request.getParameter("skyear"+i);
			
			if(!skillname.equals("")){
				//get skill by name
				System.out.println("trying skill... "+i);
				skill = NewApplicantService.getSkill(skillname);
				//add skill to bridge
				userskill.setHdzSkill(skill);
				//set bridge experience
				userskill.setExperience(skillyear);
				//add bridge to applicant
				skills.add(userskill);
				System.out.println("skill added to list");
			}
		}

		String salt = PasswordUtil.getSalt();
		String hashedPwd = "";
		try {
			hashedPwd = PasswordUtil.hashPasswordPlusSalt(password, salt);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		HdzApplicant applicant = new HdzApplicant();
		applicant.setBday(bday);
		
		HdzEmployee employee = ApplicantDao.getEmployeeByEmail(email);
		
		//if employee update fields
		if(employee!=null){
			applicant.setAlcoholtestflag("N");
			applicant.setCitizenflag("Y");
			applicant.setDottestflag("N");
			applicant.setDrugtestflag("Y");
			applicant.setStdpanelflag("N");
			applicant.setVisaflag("Y");
			applicant.setVeteranflag("Y");
			applicant.setHdzEmployee(employee);
		}
		
		applicant.setPhonenum(new BigDecimal(phone));
		applicant.setEmail(email);
		applicant.setFirstname(firstname);
		applicant.setLastname(lastname);
		applicant.setHashedpwd(hashedPwd);
		applicant.setCitizen(citizen);
		applicant.setVeteran(veteran);
		applicant.setAppsummary(summary);
		applicant.setCareerobj(objective);
		//System.out.println(email+" "+firstname+" "+lastname+" "+hashedPwd+" "+" "+citizen+" "+veteran);
		applicant.setSalt(salt);
		NewApplicantService.insertApplicant(applicant);
		applicant = ValidateUserDao.getValidApplicant(email, password);
		applicant.setHdzEducations(edhist);
		applicant.setHdzJobhistories(jobhist);
		applicant.setHdzReftables(references);
		applicant.setHdzAwards(awards);
		applicant.setHdzSkillappbridges(skills);
		for (HdzEducation e:edhist){
			e.setHdzApplicant(applicant);
		}
		for(HdzJobhistory j:jobhist){
			j.setHdzApplicant(applicant);
			j.setJobhistoryflag("Y");
		}
		for (HdzReftable r:references){
			r.setHdzApplicant(applicant);
			r.setRefflag("Y");
		}
		for (HdzAward a:awards){
			a.setHdzApplicant(applicant);
		}
		for (HdzSkillappbridge s:skills){
			s.setHdzApplicant(applicant);
		}
		NewApplicantService.updateApplicant(applicant);
		
		String nextURL = "/login.jsp";
		request.getRequestDispatcher(nextURL).forward(request, response);
	}
}
