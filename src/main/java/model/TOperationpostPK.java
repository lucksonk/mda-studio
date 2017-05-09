package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_operationposts database table.
 * 
 */
@Embeddable
public class TOperationpostPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int operationID;

	private String postCondition;

	public TOperationpostPK() {
	}
	public int getOperationID() {
		return this.operationID;
	}
	public void setOperationID(int operationID) {
		this.operationID = operationID;
	}
	public String getPostCondition() {
		return this.postCondition;
	}
	public void setPostCondition(String postCondition) {
		this.postCondition = postCondition;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TOperationpostPK)) {
			return false;
		}
		TOperationpostPK castOther = (TOperationpostPK)other;
		return 
			(this.operationID == castOther.operationID)
			&& this.postCondition.equals(castOther.postCondition);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.operationID;
		hash = hash * prime + this.postCondition.hashCode();
		
		return hash;
	}
}