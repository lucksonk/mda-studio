package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_secpermission database table.
 * 
 */
@Entity
@Table(name="t_secpermission")
@NamedQuery(name="TSecpermission.findAll", query="SELECT t FROM TSecpermission t")
public class TSecpermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int permissionID;

	private String permissionName;

	public TSecpermission() {
	}

	public int getPermissionID() {
		return this.permissionID;
	}

	public void setPermissionID(int permissionID) {
		this.permissionID = permissionID;
	}

	public String getPermissionName() {
		return this.permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

}