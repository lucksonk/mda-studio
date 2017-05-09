package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_operationparams database table.
 * 
 */
@Embeddable
public class TOperationparamPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int operationID;

	private String name;

	public TOperationparamPK() {
	}
	public int getOperationID() {
		return this.operationID;
	}
	public void setOperationID(int operationID) {
		this.operationID = operationID;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TOperationparamPK)) {
			return false;
		}
		TOperationparamPK castOther = (TOperationparamPK)other;
		return 
			(this.operationID == castOther.operationID)
			&& this.name.equals(castOther.name);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.operationID;
		hash = hash * prime + this.name.hashCode();
		
		return hash;
	}
}