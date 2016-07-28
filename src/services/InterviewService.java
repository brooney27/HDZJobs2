package services;

import java.util.List;

import dao.InterviewDao;
import model.HdzApplication;
import model.HdzInterviewquest;
import model.HdzInterviewresp;

public class InterviewService {

	public static String getCodingTest(long id) {
		return InterviewDao.getCosingTest(id);
	}

	public static HdzApplication getHdzApplication(String appid) {
		return InterviewDao.getHdzApplication(appid);
	}

	public static void updateApplication(HdzApplication hdzApplication) {
		InterviewDao.updateApplication(hdzApplication);
		
	}

	public static String getComment(HdzApplication hdzApplication) {
		return InterviewDao.getComment(hdzApplication);
	}

	public static List<HdzInterviewquest> getInterviewquestionbyjobid(String interviewtype, long jobid) {
		return InterviewDao.getInterviewquestionbyjobid(interviewtype, jobid);
	}
	
	public static HdzInterviewquest getInterviewquestion(String questionid) {

		return InterviewDao.getInterviewquestion(questionid);
	}
	
	public static void insert(HdzInterviewresp response) {
		InterviewDao.insert(response);
	}
	
	public static long getscore(long applicationid, String interviewtype) {
		return InterviewDao.getscore(applicationid, interviewtype);
	
	}
}
