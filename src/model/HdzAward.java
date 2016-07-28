package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the HDZ_AWARD database table.
 * 
 */
@Entity
@Table(name="HDZ_AWARD")
@NamedQuery(name="HdzAward.findAll", query="SELECT h FROM HdzAward h")
public class HdzAward implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HDZ_AWARD_AWARDID_GENERATOR", sequenceName="HDZ_AWARD_ID_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HDZ_AWARD_AWARDID_GENERATOR")
	private long awardid;

	private String awardname;

	private String awardyear;

	public HdzAward() {
	}

	public long getAwardid() {
		return this.awardid;
	}

	public void setAwardid(long awardid) {
		this.awardid = awardid;
	}

	public String getAwardname() {
		return this.awardname;
	}

	public void setAwardname(String awardname) {
		this.awardname = awardname;
	}

	public String getAwardyear() {
		return this.awardyear;
	}

	public void setAwardyear(String awardyear) {
		this.awardyear = awardyear;
	}

}