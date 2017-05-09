package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_secusergroup database table.
 * 
 */
@Entity
@Table(name="t_secusergroup")
@NamedQuery(name="TSecusergroup.findAll", query="SELECT t FROM TSecusergroup t")
public class TSecusergroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TSecusergroupPK id;

	public TSecusergroup() {
	}

	public TSecusergroupPK getId() {
		return this.id;
	}

	public void setId(TSecusergroupPK id) {
		this.id = id;
	}

}