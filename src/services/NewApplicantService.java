package services;
import dao.ApplicantDao;
import model.HdzApplicant;
import model.HdzSkill;
public class NewApplicantService {
	public NewApplicantService(){
		
	}
	public static void insertApplicant(HdzApplicant applicant){
		ApplicantDao.insert(applicant);
	}
	public static void updateApplicant(HdzApplicant applicant){
		ApplicantDao.update(applicant);
	}
	public static HdzSkill getSkill(String skillname){
		HdzSkill skill = ApplicantDao.getSkillByName(skillname);
		if(skill==null){
			skill = new HdzSkill();
			skill.setSkillname(skillname);
			ApplicantDao.insert(skill);
			skill = ApplicantDao.getSkillByName(skillname);
		}
		
		return skill;
	}
}
