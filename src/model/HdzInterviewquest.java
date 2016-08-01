package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the HDZ_INTERVIEWQUEST database table.
 * 
 */
@Entity
@Table(name="HDZ_INTERVIEWQUEST")
@NamedQuery(name="HdzInterviewquest.findAll", query="SELECT h FROM HdzInterviewquest h")
public class HdzInterviewquest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HDZ_INTERVIEWQUEST_INTERVIEWQUESTID_GENERATOR", sequenceName="HDZ_INTERVIEWQUEST_ID_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HDZ_INTERVIEWQUEST_INTERVIEWQUESTID_GENERATOR")
	private long interviewquestid;

	private String interviewtype;

	private String question;

	//bi-directional many-to-one association to HdzJob
	@ManyToOne
	@JoinColumn(name="JOBSID")
	private HdzJob hdzJob;

	//bi-directional many-to-one association to HdzInterviewresp
	@OneToMany(mappedBy="hdzInterviewquest")
	private List<HdzInterviewresp> hdzInterviewresps;

	public HdzInterviewquest() {
	}

	public long getInterviewquestid() {
		return this.interviewquestid;
	}

	public void setInterviewquestid(long interviewquestid) {
		this.interviewquestid = interviewquestid;
	}

	public String getInterviewtype() {
		return this.interviewtype;
	}

	public void setInterviewtype(String interviewtype) {
		this.interviewtype = interviewtype;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public HdzJob getHdzJob() {
		return this.hdzJob;
	}

	public void setHdzJob(HdzJob hdzJob) {
		this.hdzJob = hdzJob;
	}

	public List<HdzInterviewresp> getHdzInterviewresps() {
		return this.hdzInterviewresps;
	}

	public void setHdzInterviewresps(List<HdzInterviewresp> hdzInterviewresps) {
		this.hdzInterviewresps = hdzInterviewresps;
	}

	public HdzInterviewresp addHdzInterviewresp(HdzInterviewresp hdzInterviewresp) {
		getHdzInterviewresps().add(hdzInterviewresp);
		hdzInterviewresp.setHdzInterviewquest(this);

		return hdzInterviewresp;
	}

	public HdzInterviewresp removeHdzInterviewresp(HdzInterviewresp hdzInterviewresp) {
		getHdzInterviewresps().remove(hdzInterviewresp);
		hdzInterviewresp.setHdzInterviewquest(null);

		return hdzInterviewresp;
	}

}