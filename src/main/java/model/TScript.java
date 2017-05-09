package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_script database table.
 * 
 */
@Entity
@Table(name="t_script")
@NamedQuery(name="TScript.findAll", query="SELECT t FROM TScript t")
public class TScript implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int scriptID;

	@Lob
	private String notes;

	@Lob
	private String script;

	private String scriptAuthor;

	private String scriptCategory;

	private String scriptName;

	public TScript() {
	}

	public int getScriptID() {
		return this.scriptID;
	}

	public void setScriptID(int scriptID) {
		this.scriptID = scriptID;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getScript() {
		return this.script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public String getScriptAuthor() {
		return this.scriptAuthor;
	}

	public void setScriptAuthor(String scriptAuthor) {
		this.scriptAuthor = scriptAuthor;
	}

	public String getScriptCategory() {
		return this.scriptCategory;
	}

	public void setScriptCategory(String scriptCategory) {
		this.scriptCategory = scriptCategory;
	}

	public String getScriptName() {
		return this.scriptName;
	}

	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
	}

}