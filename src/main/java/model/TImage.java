package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_image database table.
 * 
 */
@Entity
@Table(name="t_image")
@NamedQuery(name="TImage.findAll", query="SELECT t FROM TImage t")
public class TImage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int imageID;

	@Lob
	private byte[] image;

	private String name;

	private String type;

	public TImage() {
	}

	public int getImageID() {
		return this.imageID;
	}

	public void setImageID(int imageID) {
		this.imageID = imageID;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}