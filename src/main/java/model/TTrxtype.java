package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_trxtypes database table.
 * 
 */
@Entity
@Table(name="t_trxtypes")
@NamedQuery(name="TTrxtype.findAll", query="SELECT t FROM TTrxtype t")
public class TTrxtype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TRX_ID")
	private int trxId;

	private String description;

	@Lob
	private String notes;

	private double numericWeight;

	@Lob
	private String style;

	private String trx;

	public TTrxtype() {
	}

	public int getTrxId() {
		return this.trxId;
	}

	public void setTrxId(int trxId) {
		this.trxId = trxId;
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

	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getTrx() {
		return this.trx;
	}

	public void setTrx(String trx) {
		this.trx = trx;
	}

}