package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_attribute database table.
 * 
 */
@Entity
@Table(name="t_attribute")
@NamedQuery(name="TAttribute.findAll", query="SELECT t FROM TAttribute t")
public class TAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int allowDuplicates;

	private String classifier;

	@Column(name="Const")
	private int const_;

	private String container;

	private String containment;

	@Lob
	@Column(name="Default")
	private String default_;

	private String derived;

	@Column(name="ea_guid")
	private String eaGuid;

	@Lob
	private String genOption;

	private int isCollection;

	private int isOrdered;

	private int isStatic;

	private int length;

	private String lowerBound;

	private String name;

	@Lob
	private String notes;

	private int object_ID;

	private int pos;

	private int precision;

	private int scale;

	private String scope;

	private String stereotype;

	private String style;

	@Lob
	private String styleEx;

	private String type;

	private String upperBound;

	public TAttribute() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAllowDuplicates() {
		return this.allowDuplicates;
	}

	public void setAllowDuplicates(int allowDuplicates) {
		this.allowDuplicates = allowDuplicates;
	}

	public String getClassifier() {
		return this.classifier;
	}

	public void setClassifier(String classifier) {
		this.classifier = classifier;
	}

	public int getConst_() {
		return this.const_;
	}

	public void setConst_(int const_) {
		this.const_ = const_;
	}

	public String getContainer() {
		return this.container;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	public String getContainment() {
		return this.containment;
	}

	public void setContainment(String containment) {
		this.containment = containment;
	}

	public String getDefault_() {
		return this.default_;
	}

	public void setDefault_(String default_) {
		this.default_ = default_;
	}

	public String getDerived() {
		return this.derived;
	}

	public void setDerived(String derived) {
		this.derived = derived;
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

	public int getIsCollection() {
		return this.isCollection;
	}

	public void setIsCollection(int isCollection) {
		this.isCollection = isCollection;
	}

	public int getIsOrdered() {
		return this.isOrdered;
	}

	public void setIsOrdered(int isOrdered) {
		this.isOrdered = isOrdered;
	}

	public int getIsStatic() {
		return this.isStatic;
	}

	public void setIsStatic(int isStatic) {
		this.isStatic = isStatic;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getLowerBound() {
		return this.lowerBound;
	}

	public void setLowerBound(String lowerBound) {
		this.lowerBound = lowerBound;
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

	public int getPrecision() {
		return this.precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public int getScale() {
		return this.scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUpperBound() {
		return this.upperBound;
	}

	public void setUpperBound(String upperBound) {
		this.upperBound = upperBound;
	}

}