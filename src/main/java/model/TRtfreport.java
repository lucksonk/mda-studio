package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_rtfreport database table.
 * 
 */
@Entity
@Table(name="t_rtfreport")
@NamedQuery(name="TRtfreport.findAll", query="SELECT t FROM TRtfreport t")
public class TRtfreport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String templateID;

	private int associations;

	private int attributes;

	private int childDiagrams;

	private int constraints;

	private int details;

	private String filename;

	private String heading;

	private int imageType;

	@Lob
	private String intro;

	private int methods;

	private int paging;

	private String pdata1;

	private String pdata2;

	private String pdata3;

	@Lob
	private String pdata4;

	private int processChildren;

	private int requirements;

	private int resources;

	private int rootPackage;

	private int scenarios;

	private int showAlias;

	private int showDiagrams;

	private int showTag;

	private int tagged;

	public TRtfreport() {
	}

	public String getTemplateID() {
		return this.templateID;
	}

	public void setTemplateID(String templateID) {
		this.templateID = templateID;
	}

	public int getAssociations() {
		return this.associations;
	}

	public void setAssociations(int associations) {
		this.associations = associations;
	}

	public int getAttributes() {
		return this.attributes;
	}

	public void setAttributes(int attributes) {
		this.attributes = attributes;
	}

	public int getChildDiagrams() {
		return this.childDiagrams;
	}

	public void setChildDiagrams(int childDiagrams) {
		this.childDiagrams = childDiagrams;
	}

	public int getConstraints() {
		return this.constraints;
	}

	public void setConstraints(int constraints) {
		this.constraints = constraints;
	}

	public int getDetails() {
		return this.details;
	}

	public void setDetails(int details) {
		this.details = details;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getHeading() {
		return this.heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public int getImageType() {
		return this.imageType;
	}

	public void setImageType(int imageType) {
		this.imageType = imageType;
	}

	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public int getMethods() {
		return this.methods;
	}

	public void setMethods(int methods) {
		this.methods = methods;
	}

	public int getPaging() {
		return this.paging;
	}

	public void setPaging(int paging) {
		this.paging = paging;
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

	public int getProcessChildren() {
		return this.processChildren;
	}

	public void setProcessChildren(int processChildren) {
		this.processChildren = processChildren;
	}

	public int getRequirements() {
		return this.requirements;
	}

	public void setRequirements(int requirements) {
		this.requirements = requirements;
	}

	public int getResources() {
		return this.resources;
	}

	public void setResources(int resources) {
		this.resources = resources;
	}

	public int getRootPackage() {
		return this.rootPackage;
	}

	public void setRootPackage(int rootPackage) {
		this.rootPackage = rootPackage;
	}

	public int getScenarios() {
		return this.scenarios;
	}

	public void setScenarios(int scenarios) {
		this.scenarios = scenarios;
	}

	public int getShowAlias() {
		return this.showAlias;
	}

	public void setShowAlias(int showAlias) {
		this.showAlias = showAlias;
	}

	public int getShowDiagrams() {
		return this.showDiagrams;
	}

	public void setShowDiagrams(int showDiagrams) {
		this.showDiagrams = showDiagrams;
	}

	public int getShowTag() {
		return this.showTag;
	}

	public void setShowTag(int showTag) {
		this.showTag = showTag;
	}

	public int getTagged() {
		return this.tagged;
	}

	public void setTagged(int tagged) {
		this.tagged = tagged;
	}

}