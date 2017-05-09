package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_complexitytypes database table.
 * 
 */
@Entity
@Table(name="t_complexitytypes")
@NamedQuery(name="TComplexitytype.findAll", query="SELECT t FROM TComplexitytype t")
public class TComplexitytype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String complexity;

	private int numericWeight;

	public TComplexitytype() {
	}

	public String getComplexity() {
		return this.complexity;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	public int getNumericWeight() {
		return this.numericWeight;
	}

	public void setNumericWeight(int numericWeight) {
		this.numericWeight = numericWeight;
	}

}