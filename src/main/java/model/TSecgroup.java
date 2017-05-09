package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_secgroup database table.
 * 
 */
@Entity
@Table(name="t_secgroup")
@NamedQuery(name="TSecgroup.findAll", query="SELECT t FROM TSecgroup t")
public class TSecgroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String groupID;

	private String description;

	private String groupName;

	public TSecgroup() {
	}

	public String getGroupID() {
		return this.groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}