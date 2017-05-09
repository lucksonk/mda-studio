package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_secpolicies database table.
 * 
 */
@Entity
@Table(name="t_secpolicies")
@NamedQuery(name="TSecpolicy.findAll", query="SELECT t FROM TSecpolicy t")
public class TSecpolicy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String property;

	private String value;

	public TSecpolicy() {
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