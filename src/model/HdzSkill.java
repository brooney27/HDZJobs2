package model;

import java.io.Serializable;
import javax.persistence.*;


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
	@SequenceGenerator(name="HDZ_SKILLS_SKILLSID_GENERATOR", sequenceName="HDZ_SKILLS_ID_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HDZ_SKILLS_SKILLSID_GENERATOR")
	private long skillsid;

	private String skillname;

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

}