package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_objectproperties database table.
 * 
 */
@Entity
@Table(name="t_objectproperties")
@NamedQuery(name="TObjectproperty.findAll", query="SELECT t FROM TObjectproperty t")
public class TObjectproperty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int propertyID;

	@Column(name="ea_guid")
	private String eaGuid;

	@Lob
	private String notes;

	private int object_ID;

	private String property;

	private String value;

	public TObjectproperty() {
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