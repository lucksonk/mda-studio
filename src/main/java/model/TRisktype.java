package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_risktypes database table.
 * 
 */
@Entity
@Table(name="t_risktypes")
@NamedQuery(name="TRisktype.findAll", query="SELECT t FROM TRisktype t")
public class TRisktype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String risk;

	private String description;

	private String notes;

	private double numericWeight;

	public TRisktype() {
	}

	public String getRisk() {
		return this.risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
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

	public double getNumericWeight() {
		return this.numericWeight;
	}

	public void setNumericWeight(double numericWeight) {
		this.numericWeight = numericWeight;
	}

}