package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_version database table.
 * 
 */
@Entity
@Table(name="t_version")
@NamedQuery(name="TVersion.findAll", query="SELECT t FROM TVersion t")
public class TVersion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TVersionPK id;

	private String branch;

	private String elementType;

	@Lob
	private String elementXML;

	private String externalFile;

	private String flags;

	private String notes;

	private String owner;

	@Temporal(TemporalType.TIMESTAMP)
	private Date versionDate;

	public TVersion() {
	}

	public TVersionPK getId() {
		return this.id;
	}

	public void setId(TVersionPK id) {
		this.id = id;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getElementType() {
		return this.elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	public String getElementXML() {
		return this.elementXML;
	}

	public void setElementXML(String elementXML) {
		this.elementXML = elementXML;
	}

	public String getExternalFile() {
		return this.externalFile;
	}

	public void setExternalFile(String externalFile) {
		this.externalFile = externalFile;
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

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Date getVersionDate() {
		return this.versionDate;
	}

	public void setVersionDate(Date versionDate) {
		this.versionDate = versionDate;
	}

}