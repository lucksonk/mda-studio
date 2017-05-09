package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_issues database table.
 * 
 */
@Entity
@Table(name="t_issues")
@NamedQuery(name="TIssue.findAll", query="SELECT t FROM TIssue t")
public class TIssue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int issueID;

	private String category;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateResolved;

	private String issue;

	@Temporal(TemporalType.TIMESTAMP)
	private Date issueDate;

	private String issueType;

	@Lob
	private String notes;

	private String owner;

	private String priority;

	@Lob
	private String resolution;

	private String resolver;

	private String severity;

	private String status;

	public TIssue() {
	}

	public int getIssueID() {
		return this.issueID;
	}

	public void setIssueID(int issueID) {
		this.issueID = issueID;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getDateResolved() {
		return this.dateResolved;
	}

	public void setDateResolved(Date dateResolved) {
		this.dateResolved = dateResolved;
	}

	public String getIssue() {
		return this.issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public Date getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getIssueType() {
		return this.issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getResolution() {
		return this.resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getResolver() {
		return this.resolver;
	}

	public void setResolver(String resolver) {
		this.resolver = resolver;
	}

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}