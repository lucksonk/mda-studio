package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_roleconstraint database table.
 * 
 */
@Entity
@Table(name="t_roleconstraint")
@NamedQuery(name="TRoleconstraint.findAll", query="SELECT t FROM TRoleconstraint t")
public class TRoleconstraint implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TRoleconstraintPK id;

	@Lob
	private String notes;

	public TRoleconstraint() {
	}

	public TRoleconstraintPK getId() {
		return this.id;
	}

	public void setId(TRoleconstraintPK id) {
		this.id = id;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}