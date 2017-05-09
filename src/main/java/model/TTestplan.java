package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_testplans database table.
 * 
 */
@Entity
@Table(name="t_testplans")
@NamedQuery(name="TTestplan.findAll", query="SELECT t FROM TTestplan t")
public class TTestplan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String planID;

	private String author;

	private String category;

	private String name;

	@Lob
	private String notes;

	@Lob
	private String testPlan;

	public TTestplan() {
	}

	public String getPlanID() {
		return this.planID;
	}

	public void setPlanID(String planID) {
		this.planID = planID;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getTestPlan() {
		return this.testPlan;
	}

	public void setTestPlan(String testPlan) {
		this.testPlan = testPlan;
	}

}