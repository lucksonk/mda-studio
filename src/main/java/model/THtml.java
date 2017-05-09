package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_html database table.
 * 
 */
@Entity
@Table(name="t_html")
@NamedQuery(name="THtml.findAll", query="SELECT t FROM THtml t")
public class THtml implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	private String template;

	private String type;

	public THtml() {
	}

	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}