package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_umlpattern database table.
 * 
 */
@Entity
@Table(name="t_umlpattern")
@NamedQuery(name="TUmlpattern.findAll", query="SELECT t FROM TUmlpattern t")
public class TUmlpattern implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int patternID;

	@Lob
	private String notes;

	private String patternCategory;

	private String patternName;

	@Lob
	private String patternXML;

	private String style;

	private String version;

	public TUmlpattern() {
	}

	public int getPatternID() {
		return this.patternID;
	}

	public void setPatternID(int patternID) {
		this.patternID = patternID;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPatternCategory() {
		return this.patternCategory;
	}

	public void setPatternCategory(String patternCategory) {
		this.patternCategory = patternCategory;
	}

	public String getPatternName() {
		return this.patternName;
	}

	public void setPatternName(String patternName) {
		this.patternName = patternName;
	}

	public String getPatternXML() {
		return this.patternXML;
	}

	public void setPatternXML(String patternXML) {
		this.patternXML = patternXML;
	}

	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}