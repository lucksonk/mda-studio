package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_snapshot database table.
 * 
 */
@Entity
@Table(name="t_snapshot")
@NamedQuery(name="TSnapshot.findAll", query="SELECT t FROM TSnapshot t")
public class TSnapshot implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String snapshotID;

	@Lob
	private byte[] binContent1;

	@Lob
	private byte[] binContent2;

	private String elementID;

	private String elementType;

	@Lob
	private String notes;

	private int position;

	private String seriesID;

	private String snapshotName;

	@Lob
	private String strContent;

	private String style;

	public TSnapshot() {
	}

	public String getSnapshotID() {
		return this.snapshotID;
	}

	public void setSnapshotID(String snapshotID) {
		this.snapshotID = snapshotID;
	}

	public byte[] getBinContent1() {
		return this.binContent1;
	}

	public void setBinContent1(byte[] binContent1) {
		this.binContent1 = binContent1;
	}

	public byte[] getBinContent2() {
		return this.binContent2;
	}

	public void setBinContent2(byte[] binContent2) {
		this.binContent2 = binContent2;
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

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getPosition() {
		return this.position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getSeriesID() {
		return this.seriesID;
	}

	public void setSeriesID(String seriesID) {
		this.seriesID = seriesID;
	}

	public String getSnapshotName() {
		return this.snapshotName;
	}

	public void setSnapshotName(String snapshotName) {
		this.snapshotName = snapshotName;
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

}