package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_diagram database table.
 * 
 */
@Entity
@Table(name="t_diagram")
@NamedQuery(name="TDiagram.findAll", query="SELECT t FROM TDiagram t")
public class TDiagram implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int diagram_ID;

	private int attPri;

	private int attPro;

	private int attPub;

	private String author;

	@Temporal(TemporalType.DATE)
	private Date createdDate;

	private int cx;

	private int cy;

	private String diagram_Type;

	@Column(name="ea_guid")
	private String eaGuid;

	private String HTMLPath;

	private int locked;

	@Temporal(TemporalType.DATE)
	private Date modifiedDate;

	private String name;

	@Lob
	private String notes;

	private String orientation;

	private int package_ID;

	private int parentID;

	private String pdata;

	private int scale;

	private int showBorder;

	private int showDetails;

	private int showForeign;

	private int showPackageContents;

	private String stereotype;

	@Lob
	private String styleEx;

	private String swimlanes;

	private int TPos;

	private String version;

	public TDiagram() {
	}

	public int getDiagram_ID() {
		return this.diagram_ID;
	}

	public void setDiagram_ID(int diagram_ID) {
		this.diagram_ID = diagram_ID;
	}

	public int getAttPri() {
		return this.attPri;
	}

	public void setAttPri(int attPri) {
		this.attPri = attPri;
	}

	public int getAttPro() {
		return this.attPro;
	}

	public void setAttPro(int attPro) {
		this.attPro = attPro;
	}

	public int getAttPub() {
		return this.attPub;
	}

	public void setAttPub(int attPub) {
		this.attPub = attPub;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getCx() {
		return this.cx;
	}

	public void setCx(int cx) {
		this.cx = cx;
	}

	public int getCy() {
		return this.cy;
	}

	public void setCy(int cy) {
		this.cy = cy;
	}

	public String getDiagram_Type() {
		return this.diagram_Type;
	}

	public void setDiagram_Type(String diagram_Type) {
		this.diagram_Type = diagram_Type;
	}

	public String getEaGuid() {
		return this.eaGuid;
	}

	public void setEaGuid(String eaGuid) {
		this.eaGuid = eaGuid;
	}

	public String getHTMLPath() {
		return this.HTMLPath;
	}

	public void setHTMLPath(String HTMLPath) {
		this.HTMLPath = HTMLPath;
	}

	public int getLocked() {
		return this.locked;
	}

	public void setLocked(int locked) {
		this.locked = locked;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
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

	public String getOrientation() {
		return this.orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public int getPackage_ID() {
		return this.package_ID;
	}

	public void setPackage_ID(int package_ID) {
		this.package_ID = package_ID;
	}

	public int getParentID() {
		return this.parentID;
	}

	public void setParentID(int parentID) {
		this.parentID = parentID;
	}

	public String getPdata() {
		return this.pdata;
	}

	public void setPdata(String pdata) {
		this.pdata = pdata;
	}

	public int getScale() {
		return this.scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public int getShowBorder() {
		return this.showBorder;
	}

	public void setShowBorder(int showBorder) {
		this.showBorder = showBorder;
	}

	public int getShowDetails() {
		return this.showDetails;
	}

	public void setShowDetails(int showDetails) {
		this.showDetails = showDetails;
	}

	public int getShowForeign() {
		return this.showForeign;
	}

	public void setShowForeign(int showForeign) {
		this.showForeign = showForeign;
	}

	public int getShowPackageContents() {
		return this.showPackageContents;
	}

	public void setShowPackageContents(int showPackageContents) {
		this.showPackageContents = showPackageContents;
	}

	public String getStereotype() {
		return this.stereotype;
	}

	public void setStereotype(String stereotype) {
		this.stereotype = stereotype;
	}

	public String getStyleEx() {
		return this.styleEx;
	}

	public void setStyleEx(String styleEx) {
		this.styleEx = styleEx;
	}

	public String getSwimlanes() {
		return this.swimlanes;
	}

	public void setSwimlanes(String swimlanes) {
		this.swimlanes = swimlanes;
	}

	public int getTPos() {
		return this.TPos;
	}

	public void setTPos(int TPos) {
		this.TPos = TPos;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}