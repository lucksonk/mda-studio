package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_objectscenarios database table.
 * 
 */
@Embeddable
public class TObjectscenarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int object_ID;

	private String scenario;

	public TObjectscenarioPK() {
	}
	public int getObject_ID() {
		return this.object_ID;
	}
	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}
	public String getScenario() {
		return this.scenario;
	}
	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TObjectscenarioPK)) {
			return false;
		}
		TObjectscenarioPK castOther = (TObjectscenarioPK)other;
		return 
			(this.object_ID == castOther.object_ID)
			&& this.scenario.equals(castOther.scenario);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.object_ID;
		hash = hash * prime + this.scenario.hashCode();
		
		return hash;
	}
}