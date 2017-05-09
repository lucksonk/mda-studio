package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_metrictypes database table.
 * 
 */
@Entity
@Table(name="t_metrictypes")
@NamedQuery(name="TMetrictype.findAll", query="SELECT t FROM TMetrictype t")
public class TMetrictype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String metric;

	private String description;

	private String notes;

	private double numericWeight;

	public TMetrictype() {
	}

	public String getMetric() {
		return this.metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
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