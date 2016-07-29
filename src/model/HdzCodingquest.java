package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the HDZ_CODINGQUEST database table.
 * 
 */
@Entity
@Table(name="HDZ_CODINGQUEST")
@NamedQuery(name="HdzCodingquest.findAll", query="SELECT h FROM HdzCodingquest h")
public class HdzCodingquest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HDZ_CODINGQUEST_CODINGQUESTID_GENERATOR", sequenceName="HDZ_CODINGQUEST_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HDZ_CODINGQUEST_CODINGQUESTID_GENERATOR")
	private long codingquestid;

	private String answer;

	private String question;

	public HdzCodingquest() {
	}

	public long getCodingquestid() {
		return this.codingquestid;
	}

	public void setCodingquestid(long codingquestid) {
		this.codingquestid = codingquestid;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

}