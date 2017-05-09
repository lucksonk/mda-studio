package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_ecf database table.
 * 
 */
@Entity
@Table(name="t_ecf")
@NamedQuery(name="TEcf.findAll", query="SELECT t FROM TEcf t")
public class TEcf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String ecfid;

	private String description;

	private String notes;

	private double value;

	private double weight;

	public TEcf() {
	}

	public String getEcfid() {
		return this.ecfid;
	}

	public void setEcfid(String ecfid) {
		this.ecfid = ecfid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}