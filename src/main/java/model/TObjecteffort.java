package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_objecteffort database table.
 * 
 */
@Entity
@Table(name="t_objecteffort")
@NamedQuery(name="TObjecteffort.findAll", query="SELECT t FROM TObjecteffort t")
public class TObjecteffort implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TObjecteffortPK id;

	private String effortType;

	private double EValue;

	@Lob
	private String notes;

	public TObjecteffort() {
	}

	public TObjecteffortPK getId() {
		return this.id;
	}

	public void setId(TObjecteffortPK id) {
		this.id = id;
	}

	public String getEffortType() {
		return this.effortType;
	}

	public void setEffortType(String effortType) {
		this.effortType = effortType;
	}

	public double getEValue() {
		return this.EValue;
	}

	public void setEValue(double EValue) {
		this.EValue = EValue;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}