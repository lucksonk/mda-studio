package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_secgrouppermission database table.
 * 
 */
@Embeddable
public class TSecgrouppermissionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String groupID;

	private int permissionID;

	public TSecgrouppermissionPK() {
	}
	public String getGroupID() {
		return this.groupID;
	}
	public void setGroupID(String groupID) {
		this.groupID = groupID;
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
		if (!(other instanceof TSecgrouppermissionPK)) {
			return false;
		}
		TSecgrouppermissionPK castOther = (TSecgrouppermissionPK)other;
		return 
			this.groupID.equals(castOther.groupID)
			&& (this.permissionID == castOther.permissionID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.groupID.hashCode();
		hash = hash * prime + this.permissionID;
		
		return hash;
	}
}