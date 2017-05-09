package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usystables database table.
 * 
 */
@Entity
@Table(name="usystables")
@NamedQuery(name="Usystable.findAll", query="SELECT u FROM Usystable u")
public class Usystable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String tableName;

	private String displayName;

	private String fromVer;

	private int relOrder;

	private String toVer;

	public Usystable() {
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFromVer() {
		return this.fromVer;
	}

	public void setFromVer(String fromVer) {
		this.fromVer = fromVer;
	}

	public int getRelOrder() {
		return this.relOrder;
	}

	public void setRelOrder(int relOrder) {
		this.relOrder = relOrder;
	}

	public String getToVer() {
		return this.toVer;
	}

	public void setToVer(String toVer) {
		this.toVer = toVer;
	}

}