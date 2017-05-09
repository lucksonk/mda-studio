package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_objecttrx database table.
 * 
 */
@Embeddable
public class TObjecttrxPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int object_ID;

	private String TRXType;

	private String trx;

	public TObjecttrxPK() {
	}
	public int getObject_ID() {
		return this.object_ID;
	}
	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}
	public String getTRXType() {
		return this.TRXType;
	}
	public void setTRXType(String TRXType) {
		this.TRXType = TRXType;
	}
	public String getTrx() {
		return this.trx;
	}
	public void setTrx(String trx) {
		this.trx = trx;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TObjecttrxPK)) {
			return false;
		}
		TObjecttrxPK castOther = (TObjecttrxPK)other;
		return 
			(this.object_ID == castOther.object_ID)
			&& this.TRXType.equals(castOther.TRXType)
			&& this.trx.equals(castOther.trx);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.object_ID;
		hash = hash * prime + this.TRXType.hashCode();
		hash = hash * prime + this.trx.hashCode();
		
		return hash;
	}
}