package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_attributeconstraints database table.
 * 
 */
@Entity
@Table(name="t_attributeconstraints")
@NamedQuery(name="TAttributeconstraint.findAll", query="SELECT t FROM TAttributeconstraint t")
public class TAttributeconstraint implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TAttributeconstraintPK id;

	private String attName;

	@Lob
	private String notes;

	private int object_ID;

	private String type;

	public TAttributeconstraint() {
	}

	public TAttributeconstraintPK getId() {
		return this.id;
	}

	public void setId(TAttributeconstraintPK id) {
		this.id = id;
	}

	public String getAttName() {
		return this.attName;
	}

	public void setAttName(String attName) {
		this.attName = attName;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getObject_ID() {
		return this.object_ID;
	}

	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}