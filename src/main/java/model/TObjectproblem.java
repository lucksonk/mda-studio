package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_objectproblems database table.
 * 
 */
@Entity
@Table(name="t_objectproblems")
@NamedQuery(name="TObjectproblem.findAll", query="SELECT t FROM TObjectproblem t")
public class TObjectproblem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TObjectproblemPK id;

	@Temporal(TemporalType.DATE)
	private Date dateReported;

	@Temporal(TemporalType.DATE)
	private Date dateResolved;

	private String priority;

	@Lob
	private String problemNotes;

	private String reportedBy;

	private String resolvedBy;

	@Lob
	private String resolverNotes;

	private String severity;

	private String status;

	private String version;

	public TObjectproblem() {
	}

	public TObjectproblemPK getId() {
		return this.id;
	}

	public void setId(TObjectproblemPK id) {
		this.id = id;
	}

	public Date getDateReported() {
		return this.dateReported;
	}

	public void setDateReported(Date dateReported) {
		this.dateReported = dateReported;
	}

	public Date getDateResolved() {
		return this.dateResolved;
	}

	public void setDateResolved(Date dateResolved) {
		this.dateResolved = dateResolved;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getProblemNotes() {
		return this.problemNotes;
	}

	public void setProblemNotes(String problemNotes) {
		this.problemNotes = problemNotes;
	}

	public String getReportedBy() {
		return this.reportedBy;
	}

	public void setReportedBy(String reportedBy) {
		this.reportedBy = reportedBy;
	}

	public String getResolvedBy() {
		return this.resolvedBy;
	}

	public void setResolvedBy(String resolvedBy) {
		this.resolvedBy = resolvedBy;
	}

	public String getResolverNotes() {
		return this.resolverNotes;
	}

	public void setResolverNotes(String resolverNotes) {
		this.resolverNotes = resolverNotes;
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

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}