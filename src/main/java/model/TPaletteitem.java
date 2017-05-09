package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_paletteitem database table.
 * 
 */
@Entity
@Table(name="t_paletteitem")
@NamedQuery(name="TPaletteitem.findAll", query="SELECT t FROM TPaletteitem t")
public class TPaletteitem implements Serializable {
	private static final long serialVersionUID = 1L;

	private int itemID;

	private int paletteID;

	public TPaletteitem() {
	}

	public int getItemID() {
		return this.itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public int getPaletteID() {
		return this.paletteID;
	}

	public void setPaletteID(int paletteID) {
		this.paletteID = paletteID;
	}

}