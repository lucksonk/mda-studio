package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_objecttypes database table.
 * 
 */
@Entity
@Table(name="t_objecttypes")
@NamedQuery(name="TObjecttype.findAll", query="SELECT t FROM TObjecttype t")
public class TObjecttype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String object_Type;

	private String description;

	private int designObject;

	private short imageID;

	public TObjecttype() {
	}

	public String getObject_Type() {
		return this.object_Type;
	}

	public void setObject_Type(String object_Type) {
		this.object_Type = object_Type;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDesignObject() {
		return this.designObject;
	}

	public void setDesignObject(int designObject) {
		this.designObject = designObject;
	}

	public short getImageID() {
		return this.imageID;
	}

	public void setImageID(short imageID) {
		this.imageID = imageID;
	}

}