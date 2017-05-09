package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usysoldtables database table.
 * 
 */
@Entity
@Table(name="usysoldtables")
@NamedQuery(name="Usysoldtable.findAll", query="SELECT u FROM Usysoldtable u")
public class Usysoldtable implements Serializable {
	private static final long serialVersionUID = 1L;

	private int fixCode;

	private String newName;

	private int relOrder;

	private String tableName;

	public Usysoldtable() {
	}

	public int getFixCode() {
		return this.fixCode;
	}

	public void setFixCode(int fixCode) {
		this.fixCode = fixCode;
	}

	public String getNewName() {
		return this.newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public int getRelOrder() {
		return this.relOrder;
	}

	public void setRelOrder(int relOrder) {
		this.relOrder = relOrder;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}