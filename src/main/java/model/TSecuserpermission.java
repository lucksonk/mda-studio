package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_secuserpermission database table.
 * 
 */
@Entity
@Table(name="t_secuserpermission")
@NamedQuery(name="TSecuserpermission.findAll", query="SELECT t FROM TSecuserpermission t")
public class TSecuserpermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TSecuserpermissionPK id;

	public TSecuserpermission() {
	}

	public TSecuserpermissionPK getId() {
		return this.id;
	}

	public void setId(TSecuserpermissionPK id) {
		this.id = id;
	}

}