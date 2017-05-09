package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_document database table.
 * 
 */
@Entity
@Table(name="t_document")
@NamedQuery(name="TDocument.findAll", query="SELECT t FROM TDocument t")
public class TDocument implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String docID;

	private String author;

	@Lob
	private byte[] binContent;

	@Temporal(TemporalType.TIMESTAMP)
	private Date docDate;

	private String docName;

	private String docType;

	private String elementID;

	private String elementType;

	private int isActive;

	private String notes;

	private int sequence;

	@Lob
	private String strContent;

	private String style;

	private String version;

	public TDocument() {
	}

	public String getDocID() {
		return this.docID;
	}

	public void setDocID(String docID) {
		this.docID = docID;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public byte[] getBinContent() {
		return this.binContent;
	}

	public void setBinContent(byte[] binContent) {
		this.binContent = binContent;
	}

	public Date getDocDate() {
		return this.docDate;
	}

	public void setDocDate(Date docDate) {
		this.docDate = docDate;
	}

	public String getDocName() {
		return this.docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocType() {
		return this.docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getElementID() {
		return this.elementID;
	}

	public void setElementID(String elementID) {
		this.elementID = elementID;
	}

	public String getElementType() {
		return this.elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getSequence() {
		return this.sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getStrContent() {
		return this.strContent;
	}

	public void setStrContent(String strContent) {
		this.strContent = strContent;
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