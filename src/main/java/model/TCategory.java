package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_category database table.
 * 
 */
@Entity
@Table(name="t_category")
@NamedQuery(name="TCategory.findAll", query="SELECT t FROM TCategory t")
public class TCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int categoryID;

	private String name;

	@Lob
	private String notes;

	private String type;

	public TCategory() {
	}

	public int getCategoryID() {
		return this.categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}