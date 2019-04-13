package com.path.validation.AllValidationPathDev.bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class StudentBean {
	private String collageName;
	@Embedded
	private Name name;
	@Embedded
	private Address address;

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public StudentBean(String collageName, Name name, Address address) {
		super();
		this.collageName = collageName;
		this.name = name;
		this.address = address;
	}

}
