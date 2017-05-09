package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_testclass database table.
 * 
 */
@Entity
@Table(name="t_testclass")
@NamedQuery(name="TTestclass.findAll", query="SELECT t FROM TTestclass t")
public class TTestclass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String testClass;

	private String description;

	public TTestclass() {
	}

	public String getTestClass() {
		return this.testClass;
	}

	public void setTestClass(String testClass) {
		this.testClass = testClass;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}