package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_objectrisks database table.
 * 
 */
@Entity
@Table(name="t_objectrisks")
@NamedQuery(name="TObjectrisk.findAll", query="SELECT t FROM TObjectrisk t")
public class TObjectrisk implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TObjectriskPK id;

	private double EValue;

	@Lob
	private String notes;

	private String riskType;

	public TObjectrisk() {
	}

	public TObjectriskPK getId() {
		return this.id;
	}

	public void setId(TObjectriskPK id) {
		this.id = id;
	}

	public double getEValue() {
		return this.EValue;
	}

	public void setEValue(double EValue) {
		this.EValue = EValue;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getRiskType() {
		return this.riskType;
	}

	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

}