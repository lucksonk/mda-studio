package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_ocf database table.
 * 
 */
@Entity
@Table(name="t_ocf")
@NamedQuery(name="TOcf.findAll", query="SELECT t FROM TOcf t")
public class TOcf implements Serializable {
	private static final long serialVersionUID = 1L;

	private double complexityWeight;

	private String objectType;

	public TOcf() {
	}

	public double getComplexityWeight() {
		return this.complexityWeight;
	}

	public void setComplexityWeight(double complexityWeight) {
		this.complexityWeight = complexityWeight;
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

}