package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_objectscenarios database table.
 * 
 */
@Entity
@Table(name="t_objectscenarios")
@NamedQuery(name="TObjectscenario.findAll", query="SELECT t FROM TObjectscenario t")
public class TObjectscenario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TObjectscenarioPK id;

	@Column(name="ea_guid")
	private String eaGuid;

	private double EValue;

	@Lob
	private String notes;

	private String scenarioType;

	@Lob
	private String XMLContent;

	public TObjectscenario() {
	}

	public TObjectscenarioPK getId() {
		return this.id;
	}

	public void setId(TObjectscenarioPK id) {
		this.id = id;
	}

	public String getEaGuid() {
		return this.eaGuid;
	}

	public void setEaGuid(String eaGuid) {
		this.eaGuid = eaGuid;
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

	public String getScenarioType() {
		return this.scenarioType;
	}

	public void setScenarioType(String scenarioType) {
		this.scenarioType = scenarioType;
	}

	public String getXMLContent() {
		return this.XMLContent;
	}

	public void setXMLContent(String XMLContent) {
		this.XMLContent = XMLContent;
	}

}