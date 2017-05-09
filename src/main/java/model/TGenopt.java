package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_genopt database table.
 * 
 */
@Entity
@Table(name="t_genopt")
@NamedQuery(name="TGenopt.findAll", query="SELECT t FROM TGenopt t")
public class TGenopt implements Serializable {
	private static final long serialVersionUID = 1L;

	private String appliesTo;

	@Lob
	private String option;

	public TGenopt() {
	}

	public String getAppliesTo() {
		return this.appliesTo;
	}

	public void setAppliesTo(String appliesTo) {
		this.appliesTo = appliesTo;
	}

	public String getOption() {
		return this.option;
	}

	public void setOption(String option) {
		this.option = option;
	}

}