import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import dao.ApplicantDao;
import dao.InterviewDao;
import model.HdzApplication;
import model.HdzJob;
import services.InterviewService;

public class applicantTest {

	@Test
	public void searchTest() {
		
		//List<HdzJob> jobs = ApplicantDao.searchJobs("Hardware");
		
		//assertTrue(jobs.get(0).getPosition().contains("Hardware"));
		
		//System.out.println(InterviewDao.gettotalscore(1));
		
		//System.out.println(InterviewDao.getinterviewresp(3, "HM Interview", 3));
		
		BigDecimal totalscore=(InterviewDao.gettotalscore(3));
		
		System.out.println(totalscore);
		
		System.out.println("totalscore"+totalscore);
		HdzApplication application=InterviewService.getHdzApplication("2");
		
		application.setAppscore(totalscore);
		
		InterviewService.updateApplication(application);
		
		System.out.println(application.getAppscore());
	}
}
