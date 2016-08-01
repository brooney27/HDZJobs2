package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import model.HdzApplicant;
import model.HdzJob;
import model.HdzJobhistory;
import model.HdzJobskillbridge;
import model.HdzSkill;
import model.HdzSkillappbridge;
import util.DBUtil;

public class QualifiedService {
	public static List<HdzApplicant> getQualifiedApplicants(List<HdzJobskillbridge> skills){
		List<HdzApplicant> candidates = new ArrayList<HdzApplicant>();
		
		for(HdzJobskillbridge skill:skills){
			HdzSkill s = skill.getHdzSkill();
			List<HdzSkillappbridge> apps = s.getHdzSkillappbridges();
			for(HdzSkillappbridge application:apps){
				if(Integer.parseInt(application.getExperience())<Integer.parseInt(skill.getExperience())){
					apps.remove(application);
				}
			}
			if(apps.size()==0)return null;
			
			if(candidates.size()==0){
				for(HdzSkillappbridge application:apps){
					candidates.add(application.getHdzApplicant());
				}
			}
			else{
				List<HdzApplicant> filter = new ArrayList<HdzApplicant>();
				for(HdzSkillappbridge application:apps){
					for(HdzApplicant cand:candidates){
						if(cand.getApplicantid()==application.getHdzApplicant().getApplicantid()){
							filter.add(cand);
						}
					}
				}
				candidates=filter;
				if(candidates.size()==0)return null;
			}
		}
		return candidates;
	}
	public static List<HdzJobskillbridge> getSkillsbyJob(long jobid){
		
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();

		String qString = "Select p from HdzJobskillbridge p where p.hdzJob.jobsid=:jobid";

		Query q = em.createQuery(qString);
		q.setParameter("jobid", jobid);
		List<HdzJobskillbridge> post = new ArrayList<HdzJobskillbridge>();

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
	
public static List<HdzJob> getAlljobs(){
		
		EntityManager em = DBUtil.getEmfFactory().createEntityManager();

		String qString = "Select p from HdzJob p";

		Query q = em.createQuery(qString);
		List<HdzJob> post = new ArrayList<HdzJob>();

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
	
	
	public static HashMap<Long, String> gethashmapSkillsbyJob()
	{
		HashMap<Long, String> mymap=new HashMap<Long, String>();
		List<HdzJob> myjobs=getAlljobs();
		
		for(HdzJob job: myjobs)
		{
			List<HdzJobskillbridge> mylist=QualifiedService.getSkillsbyJob(job.getJobsid());
			String content="";
			for(HdzJobskillbridge a: mylist)
			{
				content+=a.getHdzSkill().getSkillname().toString()+" ";
			}
			
			mymap.put(job.getJobsid(), content);
		}
		
		return mymap;	
		
	}
	
	
	
	
	
	
	
}
