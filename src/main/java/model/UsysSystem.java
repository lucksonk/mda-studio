package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usys_system database table.
 * 
 */
@Entity
@Table(name="usys_system")
@NamedQuery(name="UsysSystem.findAll", query="SELECT u FROM UsysSystem u")
public class UsysSystem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String property;

	private String value;

	public UsysSystem() {
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}