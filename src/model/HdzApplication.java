package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the HDZ_APPLICATION database table.
 * 
 */
@Entity
@Table(name="HDZ_APPLICATION")
@NamedQuery(name="HdzApplication.findAll", query="SELECT h FROM HdzApplication h")
public class HdzApplication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HDZ_APPLICATION_APPLICATIONID_GENERATOR", sequenceName="HDZ_APPLICATION_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HDZ_APPLICATION_APPLICATIONID_GENERATOR")
	private long applicationid;

	private BigDecimal appscore;

	private String appstatus;

	private String codingtest;

	private BigDecimal codingtestscore;

	private String comments;

	//bi-directional many-to-one association to HdzApplicant
	@ManyToOne
	@JoinColumn(name="APPLICANTID")
	private HdzApplicant hdzApplicant;

	//bi-directional many-to-one association to HdzJob
	@ManyToOne
	@JoinColumn(name="JOBSID")
	private HdzJob hdzJob;

	//bi-directional many-to-one association to HdzInterview
	@OneToMany(mappedBy="hdzApplication")
	private List<HdzInterview> hdzInterviews;

	//bi-directional many-to-one association to HdzInterviewresp
	@OneToMany(mappedBy="hdzApplication")
	private List<HdzInterviewresp> hdzInterviewresps;

	public HdzApplication() {
	}

	public long getApplicationid() {
		return this.applicationid;
	}

	public void setApplicationid(long applicationid) {
		this.applicationid = applicationid;
	}

	public BigDecimal getAppscore() {
		return this.appscore;
	}

	public void setAppscore(BigDecimal appscore) {
		this.appscore = appscore;
	}

	public String getAppstatus() {
		return this.appstatus;
	}

	public void setAppstatus(String appstatus) {
		this.appstatus = appstatus;
	}

	public String getCodingtest() {
		return this.codingtest;
	}

	public void setCodingtest(String codingtest) {
		this.codingtest = codingtest;
	}

	public BigDecimal getCodingtestscore() {
		return this.codingtestscore;
	}

	public void setCodingtestscore(BigDecimal codingtestscore) {
		this.codingtestscore = codingtestscore;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public HdzApplicant getHdzApplicant() {
		return this.hdzApplicant;
	}

	public void setHdzApplicant(HdzApplicant hdzApplicant) {
		this.hdzApplicant = hdzApplicant;
	}

	public HdzJob getHdzJob() {
		return this.hdzJob;
	}

	public void setHdzJob(HdzJob hdzJob) {
		this.hdzJob = hdzJob;
	}

	public List<HdzInterview> getHdzInterviews() {
		return this.hdzInterviews;
	}

	public void setHdzInterviews(List<HdzInterview> hdzInterviews) {
		this.hdzInterviews = hdzInterviews;
	}

	public HdzInterview addHdzInterview(HdzInterview hdzInterview) {
		getHdzInterviews().add(hdzInterview);
		hdzInterview.setHdzApplication(this);

		return hdzInterview;
	}

	public HdzInterview removeHdzInterview(HdzInterview hdzInterview) {
		getHdzInterviews().remove(hdzInterview);
		hdzInterview.setHdzApplication(null);

		return hdzInterview;
	}

	public List<HdzInterviewresp> getHdzInterviewresps() {
		return this.hdzInterviewresps;
	}

	public void setHdzInterviewresps(List<HdzInterviewresp> hdzInterviewresps) {
		this.hdzInterviewresps = hdzInterviewresps;
	}

	public HdzInterviewresp addHdzInterviewresp(HdzInterviewresp hdzInterviewresp) {
		getHdzInterviewresps().add(hdzInterviewresp);
		hdzInterviewresp.setHdzApplication(this);

		return hdzInterviewresp;
	}

	public HdzInterviewresp removeHdzInterviewresp(HdzInterviewresp hdzInterviewresp) {
		getHdzInterviewresps().remove(hdzInterviewresp);
		hdzInterviewresp.setHdzApplication(null);

		return hdzInterviewresp;
	}

}