package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_objecttrx database table.
 * 
 */
@Entity
@Table(name="t_objecttrx")
@NamedQuery(name="TObjecttrx.findAll", query="SELECT t FROM TObjecttrx t")
public class TObjecttrx implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TObjecttrxPK id;

	@Lob
	private String notes;

	private double weight;

	public TObjecttrx() {
	}

	public TObjecttrxPK getId() {
		return this.id;
	}

	public void setId(TObjecttrxPK id) {
		this.id = id;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}