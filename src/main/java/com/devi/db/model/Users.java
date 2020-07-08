package com.devi.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity(name = "Users1")
public class Users {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "middlename")
	private String middlename;

	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "filetype")
	private String filetype;

	@Column(name = "filename")
	private String filename;
	
	@Lob
	private byte[] image;
	public String getFiletype() {
		return filetype;
	}


	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}


	public String getFilename() {
		return filename;
	}


	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}
	
	public String getMiddlename() {
		return middlename;
	}


	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public Users(){
		
	}

	
}
