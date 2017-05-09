package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_secuserpermission database table.
 * 
 */
@Embeddable
public class TSecuserpermissionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String userID;

	private int permissionID;

	public TSecuserpermissionPK() {
	}
	public String getUserID() {
		return this.userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getPermissionID() {
		return this.permissionID;
	}
	public void setPermissionID(int permissionID) {
		this.permissionID = permissionID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TSecuserpermissionPK)) {
			return false;
		}
		TSecuserpermissionPK castOther = (TSecuserpermissionPK)other;
		return 
			this.userID.equals(castOther.userID)
			&& (this.permissionID == castOther.permissionID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userID.hashCode();
		hash = hash * prime + this.permissionID;
		
		return hash;
	}
}