package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_lists database table.
 * 
 */
@Entity
@Table(name="t_lists")
@NamedQuery(name="TList.findAll", query="SELECT t FROM TList t")
public class TList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String listID;

	private String category;

	private String name;

	@Lob
	private String notes;

	private int NVal;

	public TList() {
	}

	public String getListID() {
		return this.listID;
	}

	public void setListID(String listID) {
		this.listID = listID;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public int getNVal() {
		return this.NVal;
	}

	public void setNVal(int NVal) {
		this.NVal = NVal;
	}

}