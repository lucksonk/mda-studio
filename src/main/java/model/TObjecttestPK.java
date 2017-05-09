package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_objecttests database table.
 * 
 */
@Embeddable
public class TObjecttestPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int object_ID;

	private String test;

	private int testClass;

	public TObjecttestPK() {
	}
	public int getObject_ID() {
		return this.object_ID;
	}
	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}
	public String getTest() {
		return this.test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public int getTestClass() {
		return this.testClass;
	}
	public void setTestClass(int testClass) {
		this.testClass = testClass;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TObjecttestPK)) {
			return false;
		}
		TObjecttestPK castOther = (TObjecttestPK)other;
		return 
			(this.object_ID == castOther.object_ID)
			&& this.test.equals(castOther.test)
			&& (this.testClass == castOther.testClass);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.object_ID;
		hash = hash * prime + this.test.hashCode();
		hash = hash * prime + this.testClass;
		
		return hash;
	}
}