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
	@SequenceGenerator(name="HDZ_SKILLS_SKILLSID_GENERATOR", sequenceName="HDZ_SKILLS_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HDZ_SKILLS_SKILLSID_GENERATOR")
	private long skillsid;

	private String skillname;

	//bi-directional many-to-one association to HdzSkillappbridge
	@OneToMany(mappedBy="hdzSkill")
	private List<HdzSkillappbridge> hdzSkillappbridges;

	public HdzSkill() {
	}

	public long getSkillsid() {
		return this.skillsid;
	}

	public void setSkillsid(long skillsid) {
		this.skillsid = skillsid;
	}

	public String getSkillname() {
		return this.skillname;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
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

}