package services;

import java.util.ArrayList;
import java.util.List;

import model.HdzApplicant;
import model.HdzJobskillbridge;
import model.HdzSkill;
import model.HdzSkillappbridge;

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
}
