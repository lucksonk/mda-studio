package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_stereotypes database table.
 * 
 */
@Entity
@Table(name="t_stereotypes")
@NamedQuery(name="TStereotype.findAll", query="SELECT t FROM TStereotype t")
public class TStereotype implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TStereotypePK id;

	private String description;

	@Column(name="ea_guid")
	private String eaGuid;

	@Lob
	private byte[] metafile;

	private int MFEnabled;

	private String MFPath;

	@Lob
	private String style;

	private String visualType;

	public TStereotype() {
	}

	public TStereotypePK getId() {
		return this.id;
	}

	public void setId(TStereotypePK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEaGuid() {
		return this.eaGuid;
	}

	public void setEaGuid(String eaGuid) {
		this.eaGuid = eaGuid;
	}

	public byte[] getMetafile() {
		return this.metafile;
	}

	public void setMetafile(byte[] metafile) {
		this.metafile = metafile;
	}

	public int getMFEnabled() {
		return this.MFEnabled;
	}

	public void setMFEnabled(int MFEnabled) {
		this.MFEnabled = MFEnabled;
	}

	public String getMFPath() {
		return this.MFPath;
	}

	public void setMFPath(String MFPath) {
		this.MFPath = MFPath;
	}

	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getVisualType() {
		return this.visualType;
	}

	public void setVisualType(String visualType) {
		this.visualType = visualType;
	}

}