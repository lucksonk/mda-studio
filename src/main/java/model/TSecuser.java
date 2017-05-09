package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_secuser database table.
 * 
 */
@Entity
@Table(name="t_secuser")
@NamedQuery(name="TSecuser.findAll", query="SELECT t FROM TSecuser t")
public class TSecuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String userID;

	private String department;

	private String firstName;

	private String password;

	private String surname;

	private String userLogin;

	public TSecuser() {
	}

	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

}