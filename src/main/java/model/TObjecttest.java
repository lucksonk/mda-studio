package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_objecttests database table.
 * 
 */
@Entity
@Table(name="t_objecttests")
@NamedQuery(name="TObjecttest.findAll", query="SELECT t FROM TObjecttest t")
public class TObjecttest implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TObjecttestPK id;

	@Lob
	private String acceptanceCriteria;

	private String checkBy;

	@Temporal(TemporalType.DATE)
	private Date dateRun;

	@Lob
	private String inputData;

	@Lob
	private String notes;

	@Lob
	private String results;

	private String runBy;

	private String status;

	private String testType;

	public TObjecttest() {
	}

	public TObjecttestPK getId() {
		return this.id;
	}

	public void setId(TObjecttestPK id) {
		this.id = id;
	}

	public String getAcceptanceCriteria() {
		return this.acceptanceCriteria;
	}

	public void setAcceptanceCriteria(String acceptanceCriteria) {
		this.acceptanceCriteria = acceptanceCriteria;
	}

	public String getCheckBy() {
		return this.checkBy;
	}

	public void setCheckBy(String checkBy) {
		this.checkBy = checkBy;
	}

	public Date getDateRun() {
		return this.dateRun;
	}

	public void setDateRun(Date dateRun) {
		this.dateRun = dateRun;
	}

	public String getInputData() {
		return this.inputData;
	}

	public void setInputData(String inputData) {
		this.inputData = inputData;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getResults() {
		return this.results;
	}

	public void setResults(String results) {
		this.results = results;
	}

	public String getRunBy() {
		return this.runBy;
	}

	public void setRunBy(String runBy) {
		this.runBy = runBy;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTestType() {
		return this.testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

}