package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_objectmetrics database table.
 * 
 */
@Entity
@Table(name="t_objectmetrics")
@NamedQuery(name="TObjectmetric.findAll", query="SELECT t FROM TObjectmetric t")
public class TObjectmetric implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TObjectmetricPK id;

	private double EValue;

	private String metricType;

	@Lob
	private String notes;

	public TObjectmetric() {
	}

	public TObjectmetricPK getId() {
		return this.id;
	}

	public void setId(TObjectmetricPK id) {
		this.id = id;
	}

	public double getEValue() {
		return this.EValue;
	}

	public void setEValue(double EValue) {
		this.EValue = EValue;
	}

	public String getMetricType() {
		return this.metricType;
	}

	public void setMetricType(String metricType) {
		this.metricType = metricType;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}