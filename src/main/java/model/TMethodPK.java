package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_method database table.
 * 
 */
@Embeddable
public class TMethodPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int object_ID;

	private String name;

	public TMethodPK() {
	}
	public int getObject_ID() {
		return this.object_ID;
	}
	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
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
		if (!(other instanceof TMethodPK)) {
			return false;
		}
		TMethodPK castOther = (TMethodPK)other;
		return 
			(this.object_ID == castOther.object_ID)
			&& this.name.equals(castOther.name);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.object_ID;
		hash = hash * prime + this.name.hashCode();
		
		return hash;
	}
}