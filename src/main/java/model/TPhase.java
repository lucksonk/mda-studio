package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_phase database table.
 * 
 */
@Entity
@Table(name="t_phase")
@NamedQuery(name="TPhase.findAll", query="SELECT t FROM TPhase t")
public class TPhase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String phaseID;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	@Lob
	private String phaseContent;

	private String phaseName;

	@Lob
	private String phaseNotes;

	private String phaseStyle;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	public TPhase() {
	}

	public String getPhaseID() {
		return this.phaseID;
	}

	public void setPhaseID(String phaseID) {
		this.phaseID = phaseID;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPhaseContent() {
		return this.phaseContent;
	}

	public void setPhaseContent(String phaseContent) {
		this.phaseContent = phaseContent;
	}

	public String getPhaseName() {
		return this.phaseName;
	}

	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}

	public String getPhaseNotes() {
		return this.phaseNotes;
	}

	public void setPhaseNotes(String phaseNotes) {
		this.phaseNotes = phaseNotes;
	}

	public String getPhaseStyle() {
		return this.phaseStyle;
	}

	public void setPhaseStyle(String phaseStyle) {
		this.phaseStyle = phaseStyle;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}