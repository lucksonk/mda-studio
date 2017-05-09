package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_implement database table.
 * 
 */
@Entity
@Table(name="t_implement")
@NamedQuery(name="TImplement.findAll", query="SELECT t FROM TImplement t")
public class TImplement implements Serializable {
	private static final long serialVersionUID = 1L;

	private String type;

	public TImplement() {
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}