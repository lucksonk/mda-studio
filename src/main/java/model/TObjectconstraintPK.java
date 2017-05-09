package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_objectconstraint database table.
 * 
 */
@Embeddable
public class TObjectconstraintPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int object_ID;

	private String constraintType;

	private String constraint;

	public TObjectconstraintPK() {
	}
	public int getObject_ID() {
		return this.object_ID;
	}
	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}
	public String getConstraintType() {
		return this.constraintType;
	}
	public void setConstraintType(String constraintType) {
		this.constraintType = constraintType;
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
		if (!(other instanceof TObjectconstraintPK)) {
			return false;
		}
		TObjectconstraintPK castOther = (TObjectconstraintPK)other;
		return 
			(this.object_ID == castOther.object_ID)
			&& this.constraintType.equals(castOther.constraintType)
			&& this.constraint.equals(castOther.constraint);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.object_ID;
		hash = hash * prime + this.constraintType.hashCode();
		hash = hash * prime + this.constraint.hashCode();
		
		return hash;
	}
}