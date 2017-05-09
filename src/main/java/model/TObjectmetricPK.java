package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_objectmetrics database table.
 * 
 */
@Embeddable
public class TObjectmetricPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int object_ID;

	private String metric;

	public TObjectmetricPK() {
	}
	public int getObject_ID() {
		return this.object_ID;
	}
	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}
	public String getMetric() {
		return this.metric;
	}
	public void setMetric(String metric) {
		this.metric = metric;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TObjectmetricPK)) {
			return false;
		}
		TObjectmetricPK castOther = (TObjectmetricPK)other;
		return 
			(this.object_ID == castOther.object_ID)
			&& this.metric.equals(castOther.metric);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.object_ID;
		hash = hash * prime + this.metric.hashCode();
		
		return hash;
	}
}