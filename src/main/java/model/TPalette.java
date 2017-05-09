package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_palette database table.
 * 
 */
@Entity
@Table(name="t_palette")
@NamedQuery(name="TPalette.findAll", query="SELECT t FROM TPalette t")
public class TPalette implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;

	private int paletteID;

	private String type;

	public TPalette() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaletteID() {
		return this.paletteID;
	}

	public void setPaletteID(int paletteID) {
		this.paletteID = paletteID;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}