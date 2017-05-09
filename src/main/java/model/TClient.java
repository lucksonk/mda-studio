package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_clients database table.
 * 
 */
@Entity
@Table(name="t_clients")
@NamedQuery(name="TClient.findAll", query="SELECT t FROM TClient t")
public class TClient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String name;

	private String email;

	private String fax;

	private String mobile;

	private String notes;

	private String organisation;

	private String phone1;

	private String phone2;

	private String roles;

	public TClient() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOrganisation() {
		return this.organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	public String getPhone1() {
		return this.phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getRoles() {
		return this.roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

}