package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_rtf database table.
 * 
 */
@Entity
@Table(name="t_rtf")
@NamedQuery(name="TRtf.findAll", query="SELECT t FROM TRtf t")
public class TRtf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	private String template;

	private String type;

	public TRtf() {
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