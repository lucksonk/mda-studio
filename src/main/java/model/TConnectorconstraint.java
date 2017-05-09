package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_connectorconstraint database table.
 * 
 */
@Entity
@Table(name="t_connectorconstraint")
@NamedQuery(name="TConnectorconstraint.findAll", query="SELECT t FROM TConnectorconstraint t")
public class TConnectorconstraint implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TConnectorconstraintPK id;

	private String constraintType;

	@Lob
	private String notes;

	public TConnectorconstraint() {
	}

	public TConnectorconstraintPK getId() {
		return this.id;
	}

	public void setId(TConnectorconstraintPK id) {
		this.id = id;
	}

	public String getConstraintType() {
		return this.constraintType;
	}

	public void setConstraintType(String constraintType) {
		this.constraintType = constraintType;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}