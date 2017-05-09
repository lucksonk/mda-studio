package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_stereotypes database table.
 * 
 */
@Embeddable
public class TStereotypePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String appliesTo;

	private String stereotype;

	public TStereotypePK() {
	}
	public String getAppliesTo() {
		return this.appliesTo;
	}
	public void setAppliesTo(String appliesTo) {
		this.appliesTo = appliesTo;
	}
	public String getStereotype() {
		return this.stereotype;
	}
	public void setStereotype(String stereotype) {
		this.stereotype = stereotype;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TStereotypePK)) {
			return false;
		}
		TStereotypePK castOther = (TStereotypePK)other;
		return 
			this.appliesTo.equals(castOther.appliesTo)
			&& this.stereotype.equals(castOther.stereotype);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.appliesTo.hashCode();
		hash = hash * prime + this.stereotype.hashCode();
		
		return hash;
	}
}