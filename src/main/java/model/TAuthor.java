package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_authors database table.
 * 
 */
@Entity
@Table(name="t_authors")
@NamedQuery(name="TAuthor.findAll", query="SELECT t FROM TAuthor t")
public class TAuthor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String authorName;

	private String notes;

	private String roles;

	public TAuthor() {
	}

	public String getAuthorName() {
		return this.authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getRoles() {
		return this.roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

}