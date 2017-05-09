package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_tcf database table.
 * 
 */
@Entity
@Table(name="t_tcf")
@NamedQuery(name="TTcf.findAll", query="SELECT t FROM TTcf t")
public class TTcf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String tcfid;

	private String description;

	private String notes;

	private double value;

	private double weight;

	public TTcf() {
	}

	public String getTcfid() {
		return this.tcfid;
	}

	public void setTcfid(String tcfid) {
		this.tcfid = tcfid;
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