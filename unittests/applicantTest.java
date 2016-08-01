import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import dao.ApplicantDao;
import dao.InterviewDao;
import dao.PendingActionsDao;
import model.HdzApplication;
import model.HdzJob;
import services.InterviewService;
import services.QualifiedService;

public class applicantTest {

	@Test
	public void searchTest() {
		
		//List<HdzJob> jobs = ApplicantDao.searchJobs("Hardware");
		
		//assertTrue(jobs.get(0).getPosition().contains("Hardware"));
		
		//System.out.println(InterviewDao.gettotalscore(1));
		
		//System.out.println(InterviewDao.getinterviewresp(3, "HM Interview", 3));
		
		HashMap<Long, String> mymap=QualifiedService.gethashmapSkillsbyJob();
		
		System.out.println(mymap);
		
		HdzApplication myapplication=PendingActionsDao.getapplicationbyapplicationid("7");
		
		System.out.println(PendingActionsDao.checkAppStatus(myapplication));
		
		
		
	}
}
