package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_constrainttypes database table.
 * 
 */
@Entity
@Table(name="t_constrainttypes")
@NamedQuery(name="TConstrainttype.findAll", query="SELECT t FROM TConstrainttype t")
public class TConstrainttype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String constraint;

	private String description;

	@Lob
	private String notes;

	public TConstrainttype() {
	}

	public String getConstraint() {
		return this.constraint;
	}

	public void setConstraint(String constraint) {
		this.constraint = constraint;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}