package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_method database table.
 * 
 */
@Entity
@Table(name="t_method")
@NamedQuery(name="TMethod.findAll", query="SELECT t FROM TMethod t")
public class TMethod implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TMethodPK id;

	private String scope;

	private String type;

	public TMethod() {
	}

	public TMethodPK getId() {
		return this.id;
	}

	public void setId(TMethodPK id) {
		this.id = id;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}