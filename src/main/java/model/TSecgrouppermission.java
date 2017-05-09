package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_secgrouppermission database table.
 * 
 */
@Entity
@Table(name="t_secgrouppermission")
@NamedQuery(name="TSecgrouppermission.findAll", query="SELECT t FROM TSecgrouppermission t")
public class TSecgrouppermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TSecgrouppermissionPK id;

	public TSecgrouppermission() {
	}

	public TSecgrouppermissionPK getId() {
		return this.id;
	}

	public void setId(TSecgrouppermissionPK id) {
		this.id = id;
	}

}