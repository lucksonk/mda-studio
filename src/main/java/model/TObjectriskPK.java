package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_objectrisks database table.
 * 
 */
@Embeddable
public class TObjectriskPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int object_ID;

	private String risk;

	public TObjectriskPK() {
	}
	public int getObject_ID() {
		return this.object_ID;
	}
	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}
	public String getRisk() {
		return this.risk;
	}
	public void setRisk(String risk) {
		this.risk = risk;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TObjectriskPK)) {
			return false;
		}
		TObjectriskPK castOther = (TObjectriskPK)other;
		return 
			(this.object_ID == castOther.object_ID)
			&& this.risk.equals(castOther.risk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.object_ID;
		hash = hash * prime + this.risk.hashCode();
		
		return hash;
	}
}