package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_propertytypes database table.
 * 
 */
@Entity
@Table(name="t_propertytypes")
@NamedQuery(name="TPropertytype.findAll", query="SELECT t FROM TPropertytype t")
public class TPropertytype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String property;

	private String description;

	@Lob
	private String notes;

	public TPropertytype() {
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}