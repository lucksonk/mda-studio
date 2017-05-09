package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_operationparams database table.
 * 
 */
@Entity
@Table(name="t_operationparams")
@NamedQuery(name="TOperationparam.findAll", query="SELECT t FROM TOperationparam t")
public class TOperationparam implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TOperationparamPK id;

	private String classifier;

	@Column(name="Const")
	private int const_;

	@Column(name="Default")
	private String default_;

	@Column(name="ea_guid")
	private String eaGuid;

	private String kind;

	@Lob
	private String notes;

	private int pos;

	private String style;

	@Lob
	private String styleEx;

	private String type;

	public TOperationparam() {
	}

	public TOperationparamPK getId() {
		return this.id;
	}

	public void setId(TOperationparamPK id) {
		this.id = id;
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

	public String getDefault_() {
		return this.default_;
	}

	public void setDefault_(String default_) {
		this.default_ = default_;
	}

	public String getEaGuid() {
		return this.eaGuid;
	}

	public void setEaGuid(String eaGuid) {
		this.eaGuid = eaGuid;
	}

	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getPos() {
		return this.pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
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

}