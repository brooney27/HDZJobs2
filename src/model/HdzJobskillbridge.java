package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the HDZ_JOBSKILLBRIDGE database table.
 * 
 */
@Entity
@Table(name="HDZ_JOBSKILLBRIDGE")
@NamedQuery(name="HdzJobskillbridge.findAll", query="SELECT h FROM HdzJobskillbridge h")
public class HdzJobskillbridge implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HDZ_JOBSKILLBRIDGE_JOBSKILLBRIDGEID_GENERATOR", sequenceName="HDZ_JOBSKILLBRIDGE_ID_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HDZ_JOBSKILLBRIDGE_JOBSKILLBRIDGEID_GENERATOR")
	private long jobskillbridgeid;

	private String experience;

	//bi-directional many-to-one association to HdzJob
	@ManyToOne
	@JoinColumn(name="JOBSID")
	private HdzJob hdzJob;

	//bi-directional many-to-one association to HdzSkill
	@ManyToOne
	@JoinColumn(name="SKILLSID")
	private HdzSkill hdzSkill;

	public HdzJobskillbridge() {
	}

	public long getJobskillbridgeid() {
		return this.jobskillbridgeid;
	}

	public void setJobskillbridgeid(long jobskillbridgeid) {
		this.jobskillbridgeid = jobskillbridgeid;
	}

	public String getExperience() {
		return this.experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public HdzJob getHdzJob() {
		return this.hdzJob;
	}

	public void setHdzJob(HdzJob hdzJob) {
		this.hdzJob = hdzJob;
	}

	public HdzSkill getHdzSkill() {
		return this.hdzSkill;
	}

	public void setHdzSkill(HdzSkill hdzSkill) {
		this.hdzSkill = hdzSkill;
	}

}