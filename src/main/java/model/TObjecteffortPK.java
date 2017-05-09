package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_objecteffort database table.
 * 
 */
@Embeddable
public class TObjecteffortPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int object_ID;

	private String effort;

	public TObjecteffortPK() {
	}
	public int getObject_ID() {
		return this.object_ID;
	}
	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}
	public String getEffort() {
		return this.effort;
	}
	public void setEffort(String effort) {
		this.effort = effort;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TObjecteffortPK)) {
			return false;
		}
		TObjecteffortPK castOther = (TObjecteffortPK)other;
		return 
			(this.object_ID == castOther.object_ID)
			&& this.effort.equals(castOther.effort);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.object_ID;
		hash = hash * prime + this.effort.hashCode();
		
		return hash;
	}
}