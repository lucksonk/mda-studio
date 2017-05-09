package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_files database table.
 * 
 */
@Entity
@Table(name="t_files")
@NamedQuery(name="TFile.findAll", query="SELECT t FROM TFile t")
public class TFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String fileID;

	private String appliesTo;

	private String category;

	private String file;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fileDate;

	private int fileSize;

	private String name;

	@Lob
	private String notes;

	public TFile() {
	}

	public String getFileID() {
		return this.fileID;
	}

	public void setFileID(String fileID) {
		this.fileID = fileID;
	}

	public String getAppliesTo() {
		return this.appliesTo;
	}

	public void setAppliesTo(String appliesTo) {
		this.appliesTo = appliesTo;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Date getFileDate() {
		return this.fileDate;
	}

	public void setFileDate(Date fileDate) {
		this.fileDate = fileDate;
	}

	public int getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}