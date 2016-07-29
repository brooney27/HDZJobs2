package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


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

	private BigDecimal skillsid;

	//bi-directional many-to-one association to HdzApplicant
	@ManyToOne
	@JoinColumn(name="APPLICANTID")
	private HdzApplicant hdzApplicant;

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

	public BigDecimal getSkillsid() {
		return this.skillsid;
	}

	public void setSkillsid(BigDecimal skillsid) {
		this.skillsid = skillsid;
	}

	public HdzApplicant getHdzApplicant() {
		return this.hdzApplicant;
	}

	public void setHdzApplicant(HdzApplicant hdzApplicant) {
		this.hdzApplicant = hdzApplicant;
	}

}