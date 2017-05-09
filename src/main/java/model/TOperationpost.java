package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_operationposts database table.
 * 
 */
@Entity
@Table(name="t_operationposts")
@NamedQuery(name="TOperationpost.findAll", query="SELECT t FROM TOperationpost t")
public class TOperationpost implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TOperationpostPK id;

	@Lob
	private String notes;

	private String type;

	public TOperationpost() {
	}

	public TOperationpostPK getId() {
		return this.id;
	}

	public void setId(TOperationpostPK id) {
		this.id = id;
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