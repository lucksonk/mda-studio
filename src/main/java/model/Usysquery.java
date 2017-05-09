package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usysqueries database table.
 * 
 */
@Entity
@Table(name="usysqueries")
@NamedQuery(name="Usysquery.findAll", query="SELECT u FROM Usysquery u")
public class Usysquery implements Serializable {
	private static final long serialVersionUID = 1L;

	private int fixCode;

	private String newName;

	private String queryName;

	public Usysquery() {
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

	public String getQueryName() {
		return this.queryName;
	}

	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}

}