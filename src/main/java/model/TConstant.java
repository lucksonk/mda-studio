package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_constants database table.
 * 
 */
@Entity
@Table(name="t_constants")
@NamedQuery(name="TConstant.findAll", query="SELECT t FROM TConstant t")
public class TConstant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String constantName;

	private String constantValue;

	public TConstant() {
	}

	public String getConstantName() {
		return this.constantName;
	}

	public void setConstantName(String constantName) {
		this.constantName = constantName;
	}

	public String getConstantValue() {
		return this.constantValue;
	}

	public void setConstantValue(String constantValue) {
		this.constantValue = constantValue;
	}

}