package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_object database table.
 * 
 */
@Entity
@Table(name="t_object")
@NamedQuery(name="TObject.findAll", query="SELECT t FROM TObject t")
public class TObject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int object_ID;

	@Column(name="Abstract")
	private String abstract_;

	private String actionFlags;

	private String alias;

	private String author;

	private int backcolor;

	private int bordercolor;

	private int borderStyle;

	private int borderWidth;

	private String cardinality;

	private int classifier;

	private String classifier_guid;

	private String complexity;

	private String concurrency;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	private int diagram_ID;

	@Column(name="ea_guid")
	private String eaGuid;

	private int effort;

	private String eventFlags;

	private int fontcolor;

	private String genFile;

	@Lob
	private String genLinks;

	@Lob
	private String genOption;

	private String genType;

	@Lob
	private String header1;

	@Lob
	private String header2;

	private int isActive;

	private int isLeaf;

	private int isRoot;

	private int isSpec;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;

	private String multiplicity;

	private String name;

	@Lob
	private String note;

	private int NType;

	private String object_Type;

	private int package_ID;

	private String packageFlags;

	private int parentID;

	private String pdata1;

	@Lob
	private String pdata2;

	@Lob
	private String pdata3;

	@Lob
	private String pdata4;

	private String pdata5;

	private String persistence;

	private String phase;

	@Lob
	private String runState;

	private String scope;

	private String stateFlags;

	private String status;

	private String stereotype;

	private String style;

	@Lob
	private String styleEx;

	private int tagged;

	private int TPos;

	private String version;

	private String visibility;

	public TObject() {
	}

	public int getObject_ID() {
		return this.object_ID;
	}

	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}

	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	public String getActionFlags() {
		return this.actionFlags;
	}

	public void setActionFlags(String actionFlags) {
		this.actionFlags = actionFlags;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBackcolor() {
		return this.backcolor;
	}

	public void setBackcolor(int backcolor) {
		this.backcolor = backcolor;
	}

	public int getBordercolor() {
		return this.bordercolor;
	}

	public void setBordercolor(int bordercolor) {
		this.bordercolor = bordercolor;
	}

	public int getBorderStyle() {
		return this.borderStyle;
	}

	public void setBorderStyle(int borderStyle) {
		this.borderStyle = borderStyle;
	}

	public int getBorderWidth() {
		return this.borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public String getCardinality() {
		return this.cardinality;
	}

	public void setCardinality(String cardinality) {
		this.cardinality = cardinality;
	}

	public int getClassifier() {
		return this.classifier;
	}

	public void setClassifier(int classifier) {
		this.classifier = classifier;
	}

	public String getClassifier_guid() {
		return this.classifier_guid;
	}

	public void setClassifier_guid(String classifier_guid) {
		this.classifier_guid = classifier_guid;
	}

	public String getComplexity() {
		return this.complexity;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	public String getConcurrency() {
		return this.concurrency;
	}

	public void setConcurrency(String concurrency) {
		this.concurrency = concurrency;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public int getDiagram_ID() {
		return this.diagram_ID;
	}

	public void setDiagram_ID(int diagram_ID) {
		this.diagram_ID = diagram_ID;
	}

	public String getEaGuid() {
		return this.eaGuid;
	}

	public void setEaGuid(String eaGuid) {
		this.eaGuid = eaGuid;
	}

	public int getEffort() {
		return this.effort;
	}

	public void setEffort(int effort) {
		this.effort = effort;
	}

	public String getEventFlags() {
		return this.eventFlags;
	}

	public void setEventFlags(String eventFlags) {
		this.eventFlags = eventFlags;
	}

	public int getFontcolor() {
		return this.fontcolor;
	}

	public void setFontcolor(int fontcolor) {
		this.fontcolor = fontcolor;
	}

	public String getGenFile() {
		return this.genFile;
	}

	public void setGenFile(String genFile) {
		this.genFile = genFile;
	}

	public String getGenLinks() {
		return this.genLinks;
	}

	public void setGenLinks(String genLinks) {
		this.genLinks = genLinks;
	}

	public String getGenOption() {
		return this.genOption;
	}

	public void setGenOption(String genOption) {
		this.genOption = genOption;
	}

	public String getGenType() {
		return this.genType;
	}

	public void setGenType(String genType) {
		this.genType = genType;
	}

	public String getHeader1() {
		return this.header1;
	}

	public void setHeader1(String header1) {
		this.header1 = header1;
	}

	public String getHeader2() {
		return this.header2;
	}

	public void setHeader2(String header2) {
		this.header2 = header2;
	}

	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getIsLeaf() {
		return this.isLeaf;
	}

	public void setIsLeaf(int isLeaf) {
		this.isLeaf = isLeaf;
	}

	public int getIsRoot() {
		return this.isRoot;
	}

	public void setIsRoot(int isRoot) {
		this.isRoot = isRoot;
	}

	public int getIsSpec() {
		return this.isSpec;
	}

	public void setIsSpec(int isSpec) {
		this.isSpec = isSpec;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getMultiplicity() {
		return this.multiplicity;
	}

	public void setMultiplicity(String multiplicity) {
		this.multiplicity = multiplicity;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getNType() {
		return this.NType;
	}

	public void setNType(int NType) {
		this.NType = NType;
	}

	public String getObject_Type() {
		return this.object_Type;
	}

	public void setObject_Type(String object_Type) {
		this.object_Type = object_Type;
	}

	public int getPackage_ID() {
		return this.package_ID;
	}

	public void setPackage_ID(int package_ID) {
		this.package_ID = package_ID;
	}

	public String getPackageFlags() {
		return this.packageFlags;
	}

	public void setPackageFlags(String packageFlags) {
		this.packageFlags = packageFlags;
	}

	public int getParentID() {
		return this.parentID;
	}

	public void setParentID(int parentID) {
		this.parentID = parentID;
	}

	public String getPdata1() {
		return this.pdata1;
	}

	public void setPdata1(String pdata1) {
		this.pdata1 = pdata1;
	}

	public String getPdata2() {
		return this.pdata2;
	}

	public void setPdata2(String pdata2) {
		this.pdata2 = pdata2;
	}

	public String getPdata3() {
		return this.pdata3;
	}

	public void setPdata3(String pdata3) {
		this.pdata3 = pdata3;
	}

	public String getPdata4() {
		return this.pdata4;
	}

	public void setPdata4(String pdata4) {
		this.pdata4 = pdata4;
	}

	public String getPdata5() {
		return this.pdata5;
	}

	public void setPdata5(String pdata5) {
		this.pdata5 = pdata5;
	}

	public String getPersistence() {
		return this.persistence;
	}

	public void setPersistence(String persistence) {
		this.persistence = persistence;
	}

	public String getPhase() {
		return this.phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getRunState() {
		return this.runState;
	}

	public void setRunState(String runState) {
		this.runState = runState;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getStateFlags() {
		return this.stateFlags;
	}

	public void setStateFlags(String stateFlags) {
		this.stateFlags = stateFlags;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStereotype() {
		return this.stereotype;
	}

	public void setStereotype(String stereotype) {
		this.stereotype = stereotype;
	}

	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getStyleEx() {
		return this.styleEx;
	}

	public void setStyleEx(String styleEx) {
		this.styleEx = styleEx;
	}

	public int getTagged() {
		return this.tagged;
	}

	public void setTagged(int tagged) {
		this.tagged = tagged;
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

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

}