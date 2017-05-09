package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_operationpres database table.
 * 
 */
@Entity
@Table(name="t_operationpres")
@NamedQuery(name="TOperationpre.findAll", query="SELECT t FROM TOperationpre t")
public class TOperationpre implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TOperationprePK id;

	@Lob
	private String notes;

	private String type;

	public TOperationpre() {
	}

	public TOperationprePK getId() {
		return this.id;
	}

	public void setId(TOperationprePK id) {
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