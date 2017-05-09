package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_primitives database table.
 * 
 */
@Entity
@Table(name="t_primitives")
@NamedQuery(name="TPrimitive.findAll", query="SELECT t FROM TPrimitive t")
public class TPrimitive implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String datatype;

	private String description;

	public TPrimitive() {
	}

	public String getDatatype() {
		return this.datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}