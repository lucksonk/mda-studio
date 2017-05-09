package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_connectorconstraint database table.
 * 
 */
@Embeddable
public class TConnectorconstraintPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int connectorID;

	private String constraint;

	public TConnectorconstraintPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TConnectorconstraintPK)) {
			return false;
		}
		TConnectorconstraintPK castOther = (TConnectorconstraintPK)other;
		return 
			(this.connectorID == castOther.connectorID)
			&& this.constraint.equals(castOther.constraint);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.connectorID;
		hash = hash * prime + this.constraint.hashCode();
		
		return hash;
	}
}