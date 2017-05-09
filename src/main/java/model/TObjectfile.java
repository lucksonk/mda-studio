package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_objectfiles database table.
 * 
 */
@Entity
@Table(name="t_objectfiles")
@NamedQuery(name="TObjectfile.findAll", query="SELECT t FROM TObjectfile t")
public class TObjectfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TObjectfilePK id;

	private String fileDate;

	private String fileSize;

	@Lob
	private String note;

	private String type;

	public TObjectfile() {
	}

	public TObjectfilePK getId() {
		return this.id;
	}

	public void setId(TObjectfilePK id) {
		this.id = id;
	}

	public String getFileDate() {
		return this.fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	public String getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}