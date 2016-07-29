package dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.*;
import util.DBUtil;

public class InterviewDao {

	public static String getCosingTest(long id) {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		String coding = null;
		String qString = "select b.codingtest from HdzApplication b where b.applicationid = :id";

		try {
			TypedQuery<String> query = em.createQuery(qString, String.class);
			query.setParameter("id", id);
			coding = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return coding;
	}

	public static HdzApplication getHdzApplication(String appid) {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		HdzApplication hdzApplication = null;
		String qString = "select b from HdzApplication b where b.applicationid = :id";

		try {
			TypedQuery<HdzApplication> query = em.createQuery(qString, HdzApplication.class);
			query.setParameter("id", Long.parseLong(appid));
			hdzApplication = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return hdzApplication;
	}

	public static void updateApplication(HdzApplication hdzApplication) {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.merge(hdzApplication);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
		} finally {
			em.close();
		}

	}

	public static void update(HdzInterviewresp response) {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.merge(response);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
		} finally {
			em.close();
		}

	}

	public static void update(HdzInterview response) {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.merge(response);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
		} finally {
			em.close();
		}

	}

	public static String getComment(HdzApplication hdzApplication) {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		String comment = null;
		String qString = "select b.comments from HdzApplication b where b.applicationid = :id";

		try {
			TypedQuery<String> query = em.createQuery(qString, String.class);
			query.setParameter("id", hdzApplication.getApplicationid());
			comment = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return comment;

	}

	public static List<HdzInterviewquest> getInterviewquestionbyjobid(String interviewtype, long jobid) {

		EntityManager em = DBUtil.getEmfFactory().createEntityManager();

		String qString = "Select p from HdzInterviewquest p where p.interviewtype=:interviewtype and p.hdzJob.jobsid=:jobid";

		Query q = em.createQuery(qString);
		q.setParameter("jobid", jobid);
		q.setParameter("interviewtype", interviewtype);
		List<HdzInterviewquest> post = new ArrayList<HdzInterviewquest>();

		try {
			post = q.getResultList();

		} catch (NoResultException e) {
			System.out.println(e);
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			em.close();
		}
		return post;
	}

	public static HdzInterviewquest getInterviewquestion(String questionid) {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		HdzInterviewquest question = null;
		String qString = "select b from HdzInterviewquest b where b.interviewquestid = :id";

		try {
			TypedQuery<HdzInterviewquest> query = em.createQuery(qString, HdzInterviewquest.class);
			query.setParameter("id", Long.parseLong(questionid));
			question = query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return question;
	}

	public static void insert(HdzInterviewresp response) {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.persist(response);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
		} finally {
			em.close();
		}
	}

	public static long getscore(long applicationid, String interviewtype) {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		String qString = "select count(b.interviewrespid) from HdzInterviewresp b" + " where b.questionflag =:pass "
				+ "and b.hdzApplication.applicationid=:applicationid " + "and b.interviewtype=:interviewtype";
		long score = 0;
		try {
			Query query = em.createQuery(qString);
			query.setParameter("pass", "P");
			query.setParameter("applicationid", applicationid);
			query.setParameter("interviewtype", interviewtype);
			score = (long) (query.getSingleResult());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return score;
	}

	public static BigDecimal gettotalscore(long applicationid) {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		String qString = "select sum(b.score) from HdzInterview b" + " where "
				+ " b.hdzApplication.applicationid=:applicationid ";
		BigDecimal score = new BigDecimal(0);
		try {
			Query query = em.createQuery(qString);
			query.setParameter("applicationid", applicationid);
			if (query.getSingleResult() == null) {
				score = new BigDecimal(0);
			} else {
				score = (BigDecimal) (query.getSingleResult());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return score;
	}

	public static void insert(HdzInterview response) {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.persist(response);
			trans.commit();
		} catch (Exception e) {
			trans.rollback();
		} finally {
			em.close();
		}
	}

	public static HdzInterviewresp getinterviewresp(long applicationid, String interviewtype, long questionid) {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		String qString = "select b from HdzInterviewresp b"
				+ " where b.hdzInterviewquest.interviewquestid =:questionid "
				+ "and b.hdzApplication.applicationid=:applicationid " + "and b.interviewtype=:interviewtype";
		HdzInterviewresp interviewresp = null;
		try {
			TypedQuery<HdzInterviewresp> query = em.createQuery(qString, HdzInterviewresp.class);
			query.setParameter("questionid", questionid);
			query.setParameter("applicationid", applicationid);
			query.setParameter("interviewtype", interviewtype);
			if (query.getSingleResult() != null) {
				interviewresp = query.getSingleResult();
			}

		} catch (Exception e) {

			interviewresp = null;
		} finally {
			em.close();
		}
		return interviewresp;
	}

	public static HdzInterview getinterview(long applicationid, String interviewtype) {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		String qString = "select b from HdzInterview b" + " where " + "b.hdzApplication.applicationid=:applicationid "
				+ "and b.interviewtype=:interviewtype";
		HdzInterview interview = null;
		try {
			TypedQuery<HdzInterview> query = em.createQuery(qString, HdzInterview.class);

			query.setParameter("applicationid", applicationid);
			query.setParameter("interviewtype", interviewtype);
			if (query.getSingleResult() != null) {
				interview = query.getSingleResult();
			}

		} catch (Exception e) {
			interview = null;
		} finally {
			em.close();
		}
		return interview;
	}

}
