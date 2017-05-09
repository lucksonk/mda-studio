package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_attributeconstraints database table.
 * 
 */
@Embeddable
public class TAttributeconstraintPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	private String constraint;

	public TAttributeconstraintPK() {
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConstraint() {
		return this.constraint;
	}
	public void setConstraint(String constraint) {
		this.constraint = constraint;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TAttributeconstraintPK)) {
			return false;
		}
		TAttributeconstraintPK castOther = (TAttributeconstraintPK)other;
		return 
			(this.id == castOther.id)
			&& this.constraint.equals(castOther.constraint);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.constraint.hashCode();
		
		return hash;
	}
}