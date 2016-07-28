package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the HDZ_INTERVIEW database table.
 * 
 */
@Entity
@Table(name="HDZ_INTERVIEW")
@NamedQuery(name="HdzInterview.findAll", query="SELECT h FROM HdzInterview h")
public class HdzInterview implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HDZ_INTERVIEW_INTERVIEWID_GENERATOR", sequenceName="HDZ_INTERVIEW_ID_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HDZ_INTERVIEW_INTERVIEWID_GENERATOR")
	private long interviewid;

	private String interviewtype;

	private BigDecimal score;

	//bi-directional many-to-one association to HdzApplication
	@ManyToOne
	@JoinColumn(name="APPLICATIONID")
	private HdzApplication hdzApplication;

	public HdzInterview() {
	}

	public long getInterviewid() {
		return this.interviewid;
	}

	public void setInterviewid(long interviewid) {
		this.interviewid = interviewid;
	}

	public String getInterviewtype() {
		return this.interviewtype;
	}

	public void setInterviewtype(String interviewtype) {
		this.interviewtype = interviewtype;
	}

	public BigDecimal getScore() {
		return this.score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public HdzApplication getHdzApplication() {
		return this.hdzApplication;
	}

	public void setHdzApplication(HdzApplication hdzApplication) {
		this.hdzApplication = hdzApplication;
	}

}