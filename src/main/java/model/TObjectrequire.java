package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_objectrequires database table.
 * 
 */
@Entity
@Table(name="t_objectrequires")
@NamedQuery(name="TObjectrequire.findAll", query="SELECT t FROM TObjectrequire t")
public class TObjectrequire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int reqID;

	private String difficulty;

	private String lastUpdate;

	@Lob
	private String notes;

	private int object_ID;

	private String priority;

	private String reqType;

	private String requirement;

	private String stability;

	private String status;

	public TObjectrequire() {
	}

	public int getReqID() {
		return this.reqID;
	}

	public void setReqID(int reqID) {
		this.reqID = reqID;
	}

	public String getDifficulty() {
		return this.difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getObject_ID() {
		return this.object_ID;
	}

	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getReqType() {
		return this.reqType;
	}

	public void setReqType(String reqType) {
		this.reqType = reqType;
	}

	public String getRequirement() {
		return this.requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public String getStability() {
		return this.stability;
	}

	public void setStability(String stability) {
		this.stability = stability;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}