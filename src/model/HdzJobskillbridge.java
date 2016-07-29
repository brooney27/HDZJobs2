package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


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

	private BigDecimal jobsid;

	private BigDecimal skillsid;

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

	public BigDecimal getJobsid() {
		return this.jobsid;
	}

	public void setJobsid(BigDecimal jobsid) {
		this.jobsid = jobsid;
	}

	public BigDecimal getSkillsid() {
		return this.skillsid;
	}

	public void setSkillsid(BigDecimal skillsid) {
		this.skillsid = skillsid;
	}

}