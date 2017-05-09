package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_objectconstraint database table.
 * 
 */
@Entity
@Table(name="t_objectconstraint")
@NamedQuery(name="TObjectconstraint.findAll", query="SELECT t FROM TObjectconstraint t")
public class TObjectconstraint implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TObjectconstraintPK id;

	@Lob
	private String notes;

	private String status;

	private double weight;

	public TObjectconstraint() {
	}

	public TObjectconstraintPK getId() {
		return this.id;
	}

	public void setId(TObjectconstraintPK id) {
		this.id = id;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}