package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_objectproblems database table.
 * 
 */
@Embeddable
public class TObjectproblemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int object_ID;

	private String problemType;

	private String problem;

	public TObjectproblemPK() {
	}
	public int getObject_ID() {
		return this.object_ID;
	}
	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}
	public String getProblemType() {
		return this.problemType;
	}
	public void setProblemType(String problemType) {
		this.problemType = problemType;
	}
	public String getProblem() {
		return this.problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TObjectproblemPK)) {
			return false;
		}
		TObjectproblemPK castOther = (TObjectproblemPK)other;
		return 
			(this.object_ID == castOther.object_ID)
			&& this.problemType.equals(castOther.problemType)
			&& this.problem.equals(castOther.problem);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.object_ID;
		hash = hash * prime + this.problemType.hashCode();
		hash = hash * prime + this.problem.hashCode();
		
		return hash;
	}
}