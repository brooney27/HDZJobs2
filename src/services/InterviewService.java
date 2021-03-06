package services;

import java.math.BigDecimal;
import java.util.List;

import dao.InterviewDao;
import model.HdzApplication;
import model.HdzInterview;
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
	public static void insert(HdzInterview response) {
		InterviewDao.insert(response);
	}
	
	public static BigDecimal gettotalscore(long applicationid) {
		return InterviewDao.gettotalscore(applicationid);
	}
	
	public static HdzInterviewresp getinterviewresp(long applicationid, String interviewtype, long questionid) {
		return InterviewDao.getinterviewresp(applicationid, interviewtype, questionid);
	}
	
	public static void update(HdzInterviewresp response) {
		InterviewDao.update(response);
	}
	
	public static HdzInterview getinterview(long applicationid, String interviewtype) {
		return InterviewDao.getinterview(applicationid, interviewtype);
	}
	
	public static void update(HdzInterview response) {
	InterviewDao.update(response);
	}
}
