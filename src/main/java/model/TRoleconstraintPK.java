package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_roleconstraint database table.
 * 
 */
@Embeddable
public class TRoleconstraintPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int connectorID;

	private String constraint;

	private String connectorEnd;

	private String constraintType;

	public TRoleconstraintPK() {
	}
	public int getConnectorID() {
		return this.connectorID;
	}
	public void setConnectorID(int connectorID) {
		this.connectorID = connectorID;
	}
	public String getConstraint() {
		return this.constraint;
	}
	public void setConstraint(String constraint) {
		this.constraint = constraint;
	}
	public String getConnectorEnd() {
		return this.connectorEnd;
	}
	public void setConnectorEnd(String connectorEnd) {
		this.connectorEnd = connectorEnd;
	}
	public String getConstraintType() {
		return this.constraintType;
	}
	public void setConstraintType(String constraintType) {
		this.constraintType = constraintType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TRoleconstraintPK)) {
			return false;
		}
		TRoleconstraintPK castOther = (TRoleconstraintPK)other;
		return 
			(this.connectorID == castOther.connectorID)
			&& this.constraint.equals(castOther.constraint)
			&& this.connectorEnd.equals(castOther.connectorEnd)
			&& this.constraintType.equals(castOther.constraintType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.connectorID;
		hash = hash * prime + this.constraint.hashCode();
		hash = hash * prime + this.connectorEnd.hashCode();
		hash = hash * prime + this.constraintType.hashCode();
		
		return hash;
	}
}