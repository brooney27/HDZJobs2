package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.HdzCodingquest;
import util.DBUtil;

public class CodeTestDao {
	public static List<HdzCodingquest> getCodeQuestions(){
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();
		List<HdzCodingquest> questions = null;
		String qString = "select q from HdzCodingquest q";

		try{
			TypedQuery<HdzCodingquest> query = em.createQuery(qString,HdzCodingquest.class);
			questions= query.getResultList();
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			em.close();
		}return questions;
	}
}
