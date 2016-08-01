package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the HDZ_SKILLAPPBRIDGE database table.
 * 
 */
@Entity
@Table(name="HDZ_SKILLAPPBRIDGE")
@NamedQuery(name="HdzSkillappbridge.findAll", query="SELECT h FROM HdzSkillappbridge h")
public class HdzSkillappbridge implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HDZ_SKILLAPPBRIDGE_SKILLAPPBRIDGEID_GENERATOR", sequenceName="HDZ_SKILLAPPBRIDGE_ID_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HDZ_SKILLAPPBRIDGE_SKILLAPPBRIDGEID_GENERATOR")
	private long skillappbridgeid;

	private String experience;

	//bi-directional many-to-one association to HdzApplicant
	@ManyToOne
	@JoinColumn(name="APPLICANTID")
	private HdzApplicant hdzApplicant;

	//bi-directional many-to-one association to HdzSkill
	@ManyToOne
	@JoinColumn(name="SKILLSID")
	private HdzSkill hdzSkill;

	public HdzSkillappbridge() {
	}

	public long getSkillappbridgeid() {
		return this.skillappbridgeid;
	}

	public void setSkillappbridgeid(long skillappbridgeid) {
		this.skillappbridgeid = skillappbridgeid;
	}

	public String getExperience() {
		return this.experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public HdzApplicant getHdzApplicant() {
		return this.hdzApplicant;
	}

	public void setHdzApplicant(HdzApplicant hdzApplicant) {
		this.hdzApplicant = hdzApplicant;
	}

	public HdzSkill getHdzSkill() {
		return this.hdzSkill;
	}

	public void setHdzSkill(HdzSkill hdzSkill) {
		this.hdzSkill = hdzSkill;
	}

}