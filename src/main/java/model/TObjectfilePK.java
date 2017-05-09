package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_objectfiles database table.
 * 
 */
@Embeddable
public class TObjectfilePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int object_ID;

	private String fileName;

	public TObjectfilePK() {
	}
	public int getObject_ID() {
		return this.object_ID;
	}
	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}
	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TObjectfilePK)) {
			return false;
		}
		TObjectfilePK castOther = (TObjectfilePK)other;
		return 
			(this.object_ID == castOther.object_ID)
			&& this.fileName.equals(castOther.fileName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.object_ID;
		hash = hash * prime + this.fileName.hashCode();
		
		return hash;
	}
}