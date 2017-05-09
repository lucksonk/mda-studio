package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_glossary database table.
 * 
 */
@Entity
@Table(name="t_glossary")
@NamedQuery(name="TGlossary.findAll", query="SELECT t FROM TGlossary t")
public class TGlossary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String term;

	private int glossaryID;

	@Lob
	private String meaning;

	private String type;

	public TGlossary() {
	}

	public String getTerm() {
		return this.term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public int getGlossaryID() {
		return this.glossaryID;
	}

	public void setGlossaryID(int glossaryID) {
		this.glossaryID = glossaryID;
	}

	public String getMeaning() {
		return this.meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}