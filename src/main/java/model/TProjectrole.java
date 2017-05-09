package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_projectroles database table.
 * 
 */
@Entity
@Table(name="t_projectroles")
@NamedQuery(name="TProjectrole.findAll", query="SELECT t FROM TProjectrole t")
public class TProjectrole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String role;

	private String description;

	@Lob
	private String notes;

	public TProjectrole() {
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
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