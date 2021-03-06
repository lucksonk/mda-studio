package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_secusergroup database table.
 * 
 */
@Embeddable
public class TSecusergroupPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String userID;

	private String groupID;

	public TSecusergroupPK() {
	}
	public String getUserID() {
		return this.userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getGroupID() {
		return this.groupID;
	}
	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TSecusergroupPK)) {
			return false;
		}
		TSecusergroupPK castOther = (TSecusergroupPK)other;
		return 
			this.userID.equals(castOther.userID)
			&& this.groupID.equals(castOther.groupID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userID.hashCode();
		hash = hash * prime + this.groupID.hashCode();
		
		return hash;
	}
}