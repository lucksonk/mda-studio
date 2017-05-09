package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_cardinality database table.
 * 
 */
@Entity
@Table(name="t_cardinality")
@NamedQuery(name="TCardinality.findAll", query="SELECT t FROM TCardinality t")
public class TCardinality implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String cardinality;

	public TCardinality() {
	}

	public String getCardinality() {
		return this.cardinality;
	}

	public void setCardinality(String cardinality) {
		this.cardinality = cardinality;
	}

}