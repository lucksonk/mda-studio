package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_operationpres database table.
 * 
 */
@Embeddable
public class TOperationprePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int operationID;

	private String preCondition;

	public TOperationprePK() {
	}
	public int getOperationID() {
		return this.operationID;
	}
	public void setOperationID(int operationID) {
		this.operationID = operationID;
	}
	public String getPreCondition() {
		return this.preCondition;
	}
	public void setPreCondition(String preCondition) {
		this.preCondition = preCondition;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TOperationprePK)) {
			return false;
		}
		TOperationprePK castOther = (TOperationprePK)other;
		return 
			(this.operationID == castOther.operationID)
			&& this.preCondition.equals(castOther.preCondition);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.operationID;
		hash = hash * prime + this.preCondition.hashCode();
		
		return hash;
	}
}