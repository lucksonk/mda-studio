package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_xrefuser database table.
 * 
 */
@Entity
@Table(name="t_xrefuser")
@NamedQuery(name="TXrefuser.findAll", query="SELECT t FROM TXrefuser t")
public class TXrefuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String xrefID;

	private String behavior;

	private String client;

	private String constraint;

	@Lob
	private String description;

	private String link;

	private String name;

	private String namespace;

	private String partition;

	private String requirement;

	private String supplier;

	private String toolID;

	private String type;

	private String visibility;

	public TXrefuser() {
	}

	public String getXrefID() {
		return this.xrefID;
	}

	public void setXrefID(String xrefID) {
		this.xrefID = xrefID;
	}

	public String getBehavior() {
		return this.behavior;
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}

	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getConstraint() {
		return this.constraint;
	}

	public void setConstraint(String constraint) {
		this.constraint = constraint;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
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

	public String getPartition() {
		return this.partition;
	}

	public void setPartition(String partition) {
		this.partition = partition;
	}

	public String getRequirement() {
		return this.requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public String getSupplier() {
		return this.supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getToolID() {
		return this.toolID;
	}

	public void setToolID(String toolID) {
		this.toolID = toolID;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

}