package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_objectresource database table.
 * 
 */
@Entity
@Table(name="t_objectresource")
@NamedQuery(name="TObjectresource.findAll", query="SELECT t FROM TObjectresource t")
public class TObjectresource implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TObjectresourcePK id;

	private int actualHours;

	@Temporal(TemporalType.DATE)
	private Date dateEnd;

	@Temporal(TemporalType.DATE)
	private Date dateStart;

	private int expectedHours;

	@Lob
	private String history;

	@Lob
	private String notes;

	private short percentComplete;

	private double time;

	public TObjectresource() {
	}

	public TObjectresourcePK getId() {
		return this.id;
	}

	public void setId(TObjectresourcePK id) {
		this.id = id;
	}

	public int getActualHours() {
		return this.actualHours;
	}

	public void setActualHours(int actualHours) {
		this.actualHours = actualHours;
	}

	public Date getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	public Date getDateStart() {
		return this.dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public int getExpectedHours() {
		return this.expectedHours;
	}

	public void setExpectedHours(int expectedHours) {
		this.expectedHours = expectedHours;
	}

	public String getHistory() {
		return this.history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public short getPercentComplete() {
		return this.percentComplete;
	}

	public void setPercentComplete(short percentComplete) {
		this.percentComplete = percentComplete;
	}

	public double getTime() {
		return this.time;
	}

	public void setTime(double time) {
		this.time = time;
	}

}