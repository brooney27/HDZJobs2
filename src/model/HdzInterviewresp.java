package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the HDZ_INTERVIEWRESP database table.
 * 
 */
@Entity
@Table(name="HDZ_INTERVIEWRESP")
@NamedQuery(name="HdzInterviewresp.findAll", query="SELECT h FROM HdzInterviewresp h")
public class HdzInterviewresp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HDZ_INTERVIEWRESP_INTERVIEWRESPID_GENERATOR", sequenceName="HDZ_INTERVIEWRESP_ID_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HDZ_INTERVIEWRESP_INTERVIEWRESPID_GENERATOR")
	private long interviewrespid;

	private String interviewtype;

	private String questionflag;

	//bi-directional many-to-one association to HdzApplication
	@ManyToOne
	@JoinColumn(name="APPLICATIONID")
	private HdzApplication hdzApplication;

	//bi-directional many-to-one association to HdzInterviewquest
	@ManyToOne
	@JoinColumn(name="INTERVIEWQUESTID")
	private HdzInterviewquest hdzInterviewquest;

	public HdzInterviewresp() {
	}

	public long getInterviewrespid() {
		return this.interviewrespid;
	}

	public void setInterviewrespid(long interviewrespid) {
		this.interviewrespid = interviewrespid;
	}

	public String getInterviewtype() {
		return this.interviewtype;
	}

	public void setInterviewtype(String interviewtype) {
		this.interviewtype = interviewtype;
	}

	public String getQuestionflag() {
		return this.questionflag;
	}

	public void setQuestionflag(String questionflag) {
		this.questionflag = questionflag;
	}

	public HdzApplication getHdzApplication() {
		return this.hdzApplication;
	}

	public void setHdzApplication(HdzApplication hdzApplication) {
		this.hdzApplication = hdzApplication;
	}

	public HdzInterviewquest getHdzInterviewquest() {
		return this.hdzInterviewquest;
	}

	public void setHdzInterviewquest(HdzInterviewquest hdzInterviewquest) {
		this.hdzInterviewquest = hdzInterviewquest;
	}

}