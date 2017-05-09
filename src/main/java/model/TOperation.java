package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_operation database table.
 * 
 */
@Entity
@Table(name="t_operation")
@NamedQuery(name="TOperation.findAll", query="SELECT t FROM TOperation t")
public class TOperation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int operationID;

	@Column(name="Abstract")
	private String abstract_;

	@Lob
	private String behaviour;

	private String classifier;

	@Lob
	private String code;

	private String concurrency;

	@Column(name="Const")
	private int const_;

	@Column(name="ea_guid")
	private String eaGuid;

	@Lob
	private String genOption;

	private int isLeaf;

	private int isQuery;

	private int isRoot;

	private String isStatic;

	private String name;

	@Lob
	private String notes;

	private int object_ID;

	private int pos;

	private int pure;

	private String returnArray;

	private String scope;

	private String stateFlags;

	private String stereotype;

	private String style;

	@Lob
	private String styleEx;

	@Column(name="Synchronized")
	private String synchronized_;

	@Column(name="Throws")
	private String throws_;

	private String type;

	public TOperation() {
	}

	public int getOperationID() {
		return this.operationID;
	}

	public void setOperationID(int operationID) {
		this.operationID = operationID;
	}

	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	public String getBehaviour() {
		return this.behaviour;
	}

	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}

	public String getClassifier() {
		return this.classifier;
	}

	public void setClassifier(String classifier) {
		this.classifier = classifier;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getConcurrency() {
		return this.concurrency;
	}

	public void setConcurrency(String concurrency) {
		this.concurrency = concurrency;
	}

	public int getConst_() {
		return this.const_;
	}

	public void setConst_(int const_) {
		this.const_ = const_;
	}

	public String getEaGuid() {
		return this.eaGuid;
	}

	public void setEaGuid(String eaGuid) {
		this.eaGuid = eaGuid;
	}

	public String getGenOption() {
		return this.genOption;
	}

	public void setGenOption(String genOption) {
		this.genOption = genOption;
	}

	public int getIsLeaf() {
		return this.isLeaf;
	}

	public void setIsLeaf(int isLeaf) {
		this.isLeaf = isLeaf;
	}

	public int getIsQuery() {
		return this.isQuery;
	}

	public void setIsQuery(int isQuery) {
		this.isQuery = isQuery;
	}

	public int getIsRoot() {
		return this.isRoot;
	}

	public void setIsRoot(int isRoot) {
		this.isRoot = isRoot;
	}

	public String getIsStatic() {
		return this.isStatic;
	}

	public void setIsStatic(String isStatic) {
		this.isStatic = isStatic;
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

	public int getObject_ID() {
		return this.object_ID;
	}

	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}

	public int getPos() {
		return this.pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getPure() {
		return this.pure;
	}

	public void setPure(int pure) {
		this.pure = pure;
	}

	public String getReturnArray() {
		return this.returnArray;
	}

	public void setReturnArray(String returnArray) {
		this.returnArray = returnArray;
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

	public String getSynchronized_() {
		return this.synchronized_;
	}

	public void setSynchronized_(String synchronized_) {
		this.synchronized_ = synchronized_;
	}

	public String getThrows_() {
		return this.throws_;
	}

	public void setThrows_(String throws_) {
		this.throws_ = throws_;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}