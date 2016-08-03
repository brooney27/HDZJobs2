package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.HdzApplication;
import util.DBUtil;


public class ApplicationsDao {
	public static List<HdzApplication> getapplications(String position) {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		List<HdzApplication> app = null;
		String qString = "select b from HdzApplication b where UPPER(b.hdzJob.position) like :position";
       
		try {
			
			TypedQuery<HdzApplication> query = em.createQuery(qString, HdzApplication.class);
			query.setParameter("position", "%" + position.toUpperCase() + "%");
			app = query.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return app;
	}
	
	public static List<HdzApplication> getallapplications() {
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		List<HdzApplication> app = null;
		String qString = "select b from HdzApplication b";
       
		try {
			
			TypedQuery<HdzApplication> query = em.createQuery(qString, HdzApplication.class);
			
			app = query.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return app;
	}

}
