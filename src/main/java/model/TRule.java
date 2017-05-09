package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_rules database table.
 * 
 */
@Entity
@Table(name="t_rules")
@NamedQuery(name="TRule.findAll", query="SELECT t FROM TRule t")
public class TRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String ruleID;

	private String errorMsg;

	private String flags;

	@Lob
	private String notes;

	private int ruleActive;

	private String ruleName;

	@Lob
	private String ruleOCL;

	private String ruleType;

	@Lob
	private String ruleXML;

	public TRule() {
	}

	public String getRuleID() {
		return this.ruleID;
	}

	public void setRuleID(String ruleID) {
		this.ruleID = ruleID;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getFlags() {
		return this.flags;
	}

	public void setFlags(String flags) {
		this.flags = flags;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getRuleActive() {
		return this.ruleActive;
	}

	public void setRuleActive(int ruleActive) {
		this.ruleActive = ruleActive;
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleOCL() {
		return this.ruleOCL;
	}

	public void setRuleOCL(String ruleOCL) {
		this.ruleOCL = ruleOCL;
	}

	public String getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public String getRuleXML() {
		return this.ruleXML;
	}

	public void setRuleXML(String ruleXML) {
		this.ruleXML = ruleXML;
	}

}