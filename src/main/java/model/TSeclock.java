package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_seclocks database table.
 * 
 */
@Entity
@Table(name="t_seclocks")
@NamedQuery(name="TSeclock.findAll", query="SELECT t FROM TSeclock t")
public class TSeclock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String entityID;

	private String entityType;

	private String groupID;

	private String lockType;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	private String userID;

	public TSeclock() {
	}

	public String getEntityID() {
		return this.entityID;
	}

	public void setEntityID(String entityID) {
		this.entityID = entityID;
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getGroupID() {
		return this.groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public String getLockType() {
		return this.lockType;
	}

	public void setLockType(String lockType) {
		this.lockType = lockType;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

}