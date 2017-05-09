package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_operationtag database table.
 * 
 */
@Entity
@Table(name="t_operationtag")
@NamedQuery(name="TOperationtag.findAll", query="SELECT t FROM TOperationtag t")
public class TOperationtag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int propertyID;

	@Column(name="ea_guid")
	private String eaGuid;

	private int elementID;

	@Lob
	private String notes;

	private String property;

	private String value;

	public TOperationtag() {
	}

	public int getPropertyID() {
		return this.propertyID;
	}

	public void setPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}

	public String getEaGuid() {
		return this.eaGuid;
	}

	public void setEaGuid(String eaGuid) {
		this.eaGuid = eaGuid;
	}

	public int getElementID() {
		return this.elementID;
	}

	public void setElementID(int elementID) {
		this.elementID = elementID;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}