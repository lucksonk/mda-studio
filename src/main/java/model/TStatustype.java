package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_statustypes database table.
 * 
 */
@Entity
@Table(name="t_statustypes")
@NamedQuery(name="TStatustype.findAll", query="SELECT t FROM TStatustype t")
public class TStatustype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String status;

	private String description;

	public TStatustype() {
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}