package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_objectresource database table.
 * 
 */
@Embeddable
public class TObjectresourcePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int object_ID;

	private String resource;

	private String role;

	public TObjectresourcePK() {
	}
	public int getObject_ID() {
		return this.object_ID;
	}
	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}
	public String getResource() {
		return this.resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TObjectresourcePK)) {
			return false;
		}
		TObjectresourcePK castOther = (TObjectresourcePK)other;
		return 
			(this.object_ID == castOther.object_ID)
			&& this.resource.equals(castOther.resource)
			&& this.role.equals(castOther.role);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.object_ID;
		hash = hash * prime + this.resource.hashCode();
		hash = hash * prime + this.role.hashCode();
		
		return hash;
	}
}