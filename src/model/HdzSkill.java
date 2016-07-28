package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the HDZ_SKILLS database table.
 * 
 */
@Entity
@Table(name="HDZ_SKILLS")
@NamedQuery(name="HdzSkill.findAll", query="SELECT h FROM HdzSkill h")
public class HdzSkill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HDZ_SKILLS_SKILLID_GENERATOR", sequenceName="HDZ_SKILLS_ID_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HDZ_SKILLS_SKILLID_GENERATOR")
	private long skillid;

	private String experience;

	private String skillname;

	//bi-directional many-to-one association to HdzJob
	@OneToMany(mappedBy="hdzSkill")
	private List<HdzJob> hdzJobs;

	//bi-directional many-to-one association to HdzSkillappbridge
	@OneToMany(mappedBy="hdzSkill")
	private List<HdzSkillappbridge> hdzSkillappbridges;

	//bi-directional many-to-one association to HdzApplicant
	@ManyToOne
	@JoinColumn(name="APPLICANTID")
	private HdzApplicant hdzApplicant;

	public HdzSkill() {
	}

	public long getSkillid() {
		return this.skillid;
	}

	public void setSkillid(long skillid) {
		this.skillid = skillid;
	}

	public String getExperience() {
		return this.experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getSkillname() {
		return this.skillname;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}

	public List<HdzJob> getHdzJobs() {
		return this.hdzJobs;
	}

	public void setHdzJobs(List<HdzJob> hdzJobs) {
		this.hdzJobs = hdzJobs;
	}

	public HdzJob addHdzJob(HdzJob hdzJob) {
		getHdzJobs().add(hdzJob);
		hdzJob.setHdzSkill(this);

		return hdzJob;
	}

	public HdzJob removeHdzJob(HdzJob hdzJob) {
		getHdzJobs().remove(hdzJob);
		hdzJob.setHdzSkill(null);

		return hdzJob;
	}

	public List<HdzSkillappbridge> getHdzSkillappbridges() {
		return this.hdzSkillappbridges;
	}

	public void setHdzSkillappbridges(List<HdzSkillappbridge> hdzSkillappbridges) {
		this.hdzSkillappbridges = hdzSkillappbridges;
	}

	public HdzSkillappbridge addHdzSkillappbridge(HdzSkillappbridge hdzSkillappbridge) {
		getHdzSkillappbridges().add(hdzSkillappbridge);
		hdzSkillappbridge.setHdzSkill(this);

		return hdzSkillappbridge;
	}

	public HdzSkillappbridge removeHdzSkillappbridge(HdzSkillappbridge hdzSkillappbridge) {
		getHdzSkillappbridges().remove(hdzSkillappbridge);
		hdzSkillappbridge.setHdzSkill(null);

		return hdzSkillappbridge;
	}

	public HdzApplicant getHdzApplicant() {
		return this.hdzApplicant;
	}

	public void setHdzApplicant(HdzApplicant hdzApplicant) {
		this.hdzApplicant = hdzApplicant;
	}

}