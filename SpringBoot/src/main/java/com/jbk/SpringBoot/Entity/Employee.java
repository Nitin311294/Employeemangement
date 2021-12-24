package com.jbk.SpringBoot.Entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name= "employee")
public class Employee {
	@Id
	@Column
	private int id;
	@Column
	private String name;
    @Column
	private String username;
	@Column
    private String emailid;
	@Column
    private String phoneno;
	@Column
	private String gender;
	@Column
	private String address;
	@Column
	private String password;
	@Column
	private Timestamp createddt;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String username, String emailid, String phoneno, String gender, String address,
			String password, Timestamp createddt) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.emailid = emailid;
		this.phoneno = phoneno;
		this.gender = gender;
		this.address = address;
		this.password = password;
		this.createddt = createddt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getCreateddt() {
		return createddt;
	}

	public void setCreateddt(Timestamp createddt) {
		this.createddt = createddt;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", username=" + username + ", emailid=" + emailid
				+ ", phoneno=" + phoneno + ", gender=" + gender + ", address=" + address + ", password=" + password
				+ ", createddt=" + createddt + "]";
	}
	
	

}
