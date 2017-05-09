package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_version database table.
 * 
 */
@Embeddable
public class TVersionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String elementID;

	private String versionID;

	public TVersionPK() {
	}
	public String getElementID() {
		return this.elementID;
	}
	public void setElementID(String elementID) {
		this.elementID = elementID;
	}
	public String getVersionID() {
		return this.versionID;
	}
	public void setVersionID(String versionID) {
		this.versionID = versionID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TVersionPK)) {
			return false;
		}
		TVersionPK castOther = (TVersionPK)other;
		return 
			this.elementID.equals(castOther.elementID)
			&& this.versionID.equals(castOther.versionID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.elementID.hashCode();
		hash = hash * prime + this.versionID.hashCode();
		
		return hash;
	}
}