package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the HDZ_APPLICANT database table.
 * 
 */
@Entity
@Table(name="HDZ_APPLICANT")
@NamedQuery(name="HdzApplicant.findAll", query="SELECT h FROM HdzApplicant h")
public class HdzApplicant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HDZ_APPLICANT_APPLICANTID_GENERATOR", sequenceName="HDZ_APPLICANT_ID_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HDZ_APPLICANT_APPLICANTID_GENERATOR")
	private long applicantid;

	private String alcoholtest;

	private String alcoholtestflag;

	private String appsummary;

	private String bday;

	private String careerobj;

	private String citizen;

	private String citizenflag;

	private String dottest;

	private String dottestflag;

	private String drugtest;

	private String drugtestflag;

	private String email;

	private String firstname;

	private String hashedpwd;

	private String lastname;

	private BigDecimal phonenum;

	private String salt;

	private String stdpanel;

	private String stdpanelflag;

	private String veteran;

	private String veteranflag;

	private String visa;

	private String visaflag;

	//bi-directional many-to-one association to HdzEmployee
	@ManyToOne
	@JoinColumn(name="EMPLOYEEID")
	private HdzEmployee hdzEmployee;

	//bi-directional many-to-one association to HdzApplication
	@OneToMany(mappedBy="hdzApplicant")
	private List<HdzApplication> hdzApplications;

	//bi-directional many-to-one association to HdzEducation
	@OneToMany(mappedBy="hdzApplicant")
	private List<HdzEducation> hdzEducations;

	//bi-directional many-to-one association to HdzJobhistory
	@OneToMany(mappedBy="hdzApplicant")
	private List<HdzJobhistory> hdzJobhistories;

	//bi-directional many-to-one association to HdzReftable
	@OneToMany(mappedBy="hdzApplicant")
	private List<HdzReftable> hdzReftables;

	//bi-directional many-to-one association to HdzSkillappbridge
	@OneToMany(mappedBy="hdzApplicant")
	private List<HdzSkillappbridge> hdzSkillappbridges;

	//bi-directional many-to-one association to HdzSkill
	@OneToMany(mappedBy="hdzApplicant")
	private List<HdzSkill> hdzSkills;

	public HdzApplicant() {
	}

	public long getApplicantid() {
		return this.applicantid;
	}

	public void setApplicantid(long applicantid) {
		this.applicantid = applicantid;
	}

	public String getAlcoholtest() {
		return this.alcoholtest;
	}

	public void setAlcoholtest(String alcoholtest) {
		this.alcoholtest = alcoholtest;
	}

	public String getAlcoholtestflag() {
		return this.alcoholtestflag;
	}

	public void setAlcoholtestflag(String alcoholtestflag) {
		this.alcoholtestflag = alcoholtestflag;
	}

	public String getAppsummary() {
		return this.appsummary;
	}

	public void setAppsummary(String appsummary) {
		this.appsummary = appsummary;
	}

	public String getBday() {
		return this.bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public String getCareerobj() {
		return this.careerobj;
	}

	public void setCareerobj(String careerobj) {
		this.careerobj = careerobj;
	}

	public String getCitizen() {
		return this.citizen;
	}

	public void setCitizen(String citizen) {
		this.citizen = citizen;
	}

	public String getCitizenflag() {
		return this.citizenflag;
	}

	public void setCitizenflag(String citizenflag) {
		this.citizenflag = citizenflag;
	}

	public String getDottest() {
		return this.dottest;
	}

	public void setDottest(String dottest) {
		this.dottest = dottest;
	}

	public String getDottestflag() {
		return this.dottestflag;
	}

	public void setDottestflag(String dottestflag) {
		this.dottestflag = dottestflag;
	}

	public String getDrugtest() {
		return this.drugtest;
	}

	public void setDrugtest(String drugtest) {
		this.drugtest = drugtest;
	}

	public String getDrugtestflag() {
		return this.drugtestflag;
	}

	public void setDrugtestflag(String drugtestflag) {
		this.drugtestflag = drugtestflag;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getHashedpwd() {
		return this.hashedpwd;
	}

	public void setHashedpwd(String hashedpwd) {
		this.hashedpwd = hashedpwd;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public BigDecimal getPhonenum() {
		return this.phonenum;
	}

	public void setPhonenum(BigDecimal phonenum) {
		this.phonenum = phonenum;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getStdpanel() {
		return this.stdpanel;
	}

	public void setStdpanel(String stdpanel) {
		this.stdpanel = stdpanel;
	}

	public String getStdpanelflag() {
		return this.stdpanelflag;
	}

	public void setStdpanelflag(String stdpanelflag) {
		this.stdpanelflag = stdpanelflag;
	}

	public String getVeteran() {
		return this.veteran;
	}

	public void setVeteran(String veteran) {
		this.veteran = veteran;
	}

	public String getVeteranflag() {
		return this.veteranflag;
	}

	public void setVeteranflag(String veteranflag) {
		this.veteranflag = veteranflag;
	}

	public String getVisa() {
		return this.visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}

	public String getVisaflag() {
		return this.visaflag;
	}

	public void setVisaflag(String visaflag) {
		this.visaflag = visaflag;
	}

	public HdzEmployee getHdzEmployee() {
		return this.hdzEmployee;
	}

	public void setHdzEmployee(HdzEmployee hdzEmployee) {
		this.hdzEmployee = hdzEmployee;
	}

	public List<HdzApplication> getHdzApplications() {
		return this.hdzApplications;
	}

	public void setHdzApplications(List<HdzApplication> hdzApplications) {
		this.hdzApplications = hdzApplications;
	}

	public HdzApplication addHdzApplication(HdzApplication hdzApplication) {
		getHdzApplications().add(hdzApplication);
		hdzApplication.setHdzApplicant(this);

		return hdzApplication;
	}

	public HdzApplication removeHdzApplication(HdzApplication hdzApplication) {
		getHdzApplications().remove(hdzApplication);
		hdzApplication.setHdzApplicant(null);

		return hdzApplication;
	}

	public List<HdzEducation> getHdzEducations() {
		return this.hdzEducations;
	}

	public void setHdzEducations(List<HdzEducation> hdzEducations) {
		this.hdzEducations = hdzEducations;
	}

	public HdzEducation addHdzEducation(HdzEducation hdzEducation) {
		getHdzEducations().add(hdzEducation);
		hdzEducation.setHdzApplicant(this);

		return hdzEducation;
	}

	public HdzEducation removeHdzEducation(HdzEducation hdzEducation) {
		getHdzEducations().remove(hdzEducation);
		hdzEducation.setHdzApplicant(null);

		return hdzEducation;
	}

	public List<HdzJobhistory> getHdzJobhistories() {
		return this.hdzJobhistories;
	}

	public void setHdzJobhistories(List<HdzJobhistory> hdzJobhistories) {
		this.hdzJobhistories = hdzJobhistories;
	}

	public HdzJobhistory addHdzJobhistory(HdzJobhistory hdzJobhistory) {
		getHdzJobhistories().add(hdzJobhistory);
		hdzJobhistory.setHdzApplicant(this);

		return hdzJobhistory;
	}

	public HdzJobhistory removeHdzJobhistory(HdzJobhistory hdzJobhistory) {
		getHdzJobhistories().remove(hdzJobhistory);
		hdzJobhistory.setHdzApplicant(null);

		return hdzJobhistory;
	}

	public List<HdzReftable> getHdzReftables() {
		return this.hdzReftables;
	}

	public void setHdzReftables(List<HdzReftable> hdzReftables) {
		this.hdzReftables = hdzReftables;
	}

	public HdzReftable addHdzReftable(HdzReftable hdzReftable) {
		getHdzReftables().add(hdzReftable);
		hdzReftable.setHdzApplicant(this);

		return hdzReftable;
	}

	public HdzReftable removeHdzReftable(HdzReftable hdzReftable) {
		getHdzReftables().remove(hdzReftable);
		hdzReftable.setHdzApplicant(null);

		return hdzReftable;
	}

	public List<HdzSkillappbridge> getHdzSkillappbridges() {
		return this.hdzSkillappbridges;
	}

	public void setHdzSkillappbridges(List<HdzSkillappbridge> hdzSkillappbridges) {
		this.hdzSkillappbridges = hdzSkillappbridges;
	}

	public HdzSkillappbridge addHdzSkillappbridge(HdzSkillappbridge hdzSkillappbridge) {
		getHdzSkillappbridges().add(hdzSkillappbridge);
		hdzSkillappbridge.setHdzApplicant(this);

		return hdzSkillappbridge;
	}

	public HdzSkillappbridge removeHdzSkillappbridge(HdzSkillappbridge hdzSkillappbridge) {
		getHdzSkillappbridges().remove(hdzSkillappbridge);
		hdzSkillappbridge.setHdzApplicant(null);

		return hdzSkillappbridge;
	}

	public List<HdzSkill> getHdzSkills() {
		return this.hdzSkills;
	}

	public void setHdzSkills(List<HdzSkill> hdzSkills) {
		this.hdzSkills = hdzSkills;
	}

	public HdzSkill addHdzSkill(HdzSkill hdzSkill) {
		getHdzSkills().add(hdzSkill);
		hdzSkill.setHdzApplicant(this);

		return hdzSkill;
	}

	public HdzSkill removeHdzSkill(HdzSkill hdzSkill) {
		getHdzSkills().remove(hdzSkill);
		hdzSkill.setHdzApplicant(null);

		return hdzSkill;
	}

}