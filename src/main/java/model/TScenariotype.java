package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_scenariotypes database table.
 * 
 */
@Entity
@Table(name="t_scenariotypes")
@NamedQuery(name="TScenariotype.findAll", query="SELECT t FROM TScenariotype t")
public class TScenariotype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String scenarioType;

	private String description;

	private String notes;

	private double numericWeight;

	public TScenariotype() {
	}

	public String getScenarioType() {
		return this.scenarioType;
	}

	public void setScenarioType(String scenarioType) {
		this.scenarioType = scenarioType;
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