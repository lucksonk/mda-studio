package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_package database table.
 * 
 */
@Entity
@Table(name="t_package")
@NamedQuery(name="TPackage.findAll", query="SELECT t FROM TPackage t")
public class TPackage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int package_ID;

	private int batchLoad;

	private int batchSave;

	private String codePath;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	@Column(name="ea_guid")
	private String eaGuid;

	private int isControlled;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLoadDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastSaveDate;

	private int logXML;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;

	private String name;

	private String namespace;

	@Lob
	private String notes;

	private String packageFlags;

	private int parent_ID;

	private String pkgOwner;

	@Column(name="Protected")
	private int protected_;

	private int TPos;

	private String UMLVersion;

	private int useDTD;

	private String version;

	private String XMLPath;

	public TPackage() {
	}

	public int getPackage_ID() {
		return this.package_ID;
	}

	public void setPackage_ID(int package_ID) {
		this.package_ID = package_ID;
	}

	public int getBatchLoad() {
		return this.batchLoad;
	}

	public void setBatchLoad(int batchLoad) {
		this.batchLoad = batchLoad;
	}

	public int getBatchSave() {
		return this.batchSave;
	}

	public void setBatchSave(int batchSave) {
		this.batchSave = batchSave;
	}

	public String getCodePath() {
		return this.codePath;
	}

	public void setCodePath(String codePath) {
		this.codePath = codePath;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getEaGuid() {
		return this.eaGuid;
	}

	public void setEaGuid(String eaGuid) {
		this.eaGuid = eaGuid;
	}

	public int getIsControlled() {
		return this.isControlled;
	}

	public void setIsControlled(int isControlled) {
		this.isControlled = isControlled;
	}

	public Date getLastLoadDate() {
		return this.lastLoadDate;
	}

	public void setLastLoadDate(Date lastLoadDate) {
		this.lastLoadDate = lastLoadDate;
	}

	public Date getLastSaveDate() {
		return this.lastSaveDate;
	}

	public void setLastSaveDate(Date lastSaveDate) {
		this.lastSaveDate = lastSaveDate;
	}

	public int getLogXML() {
		return this.logXML;
	}

	public void setLogXML(int logXML) {
		this.logXML = logXML;
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPackageFlags() {
		return this.packageFlags;
	}

	public void setPackageFlags(String packageFlags) {
		this.packageFlags = packageFlags;
	}

	public int getParent_ID() {
		return this.parent_ID;
	}

	public void setParent_ID(int parent_ID) {
		this.parent_ID = parent_ID;
	}

	public String getPkgOwner() {
		return this.pkgOwner;
	}

	public void setPkgOwner(String pkgOwner) {
		this.pkgOwner = pkgOwner;
	}

	public int getProtected_() {
		return this.protected_;
	}

	public void setProtected_(int protected_) {
		this.protected_ = protected_;
	}

	public int getTPos() {
		return this.TPos;
	}

	public void setTPos(int TPos) {
		this.TPos = TPos;
	}

	public String getUMLVersion() {
		return this.UMLVersion;
	}

	public void setUMLVersion(String UMLVersion) {
		this.UMLVersion = UMLVersion;
	}

	public int getUseDTD() {
		return this.useDTD;
	}

	public void setUseDTD(int useDTD) {
		this.useDTD = useDTD;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getXMLPath() {
		return this.XMLPath;
	}

	public void setXMLPath(String XMLPath) {
		this.XMLPath = XMLPath;
	}

}