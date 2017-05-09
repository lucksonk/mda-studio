package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_taggedvalue database table.
 * 
 */
@Entity
@Table(name="t_taggedvalue")
@NamedQuery(name="TTaggedvalue.findAll", query="SELECT t FROM TTaggedvalue t")
public class TTaggedvalue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String propertyID;

	private String baseClass;

	private String elementID;

	@Lob
	private String notes;

	@Lob
	private String tagValue;

	public TTaggedvalue() {
	}

	public String getPropertyID() {
		return this.propertyID;
	}

	public void setPropertyID(String propertyID) {
		this.propertyID = propertyID;
	}

	public String getBaseClass() {
		return this.baseClass;
	}

	public void setBaseClass(String baseClass) {
		this.baseClass = baseClass;
	}

	public String getElementID() {
		return this.elementID;
	}

	public void setElementID(String elementID) {
		this.elementID = elementID;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getTagValue() {
		return this.tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}