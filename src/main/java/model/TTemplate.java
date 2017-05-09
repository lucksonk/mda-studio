package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_template database table.
 * 
 */
@Entity
@Table(name="t_template")
@NamedQuery(name="TTemplate.findAll", query="SELECT t FROM TTemplate t")
public class TTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String templateID;

	private String notes;

	private String style;

	@Lob
	private String template;

	private String templateName;

	private String templateType;

	public TTemplate() {
	}

	public String getTemplateID() {
		return this.templateID;
	}

	public void setTemplateID(String templateID) {
		this.templateID = templateID;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

}