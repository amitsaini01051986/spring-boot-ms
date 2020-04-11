package org.shopping.springbootstarter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Amit Saini
 *
 */
@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int id;
	private String name;
//	private int age;
	private String emailAddress;

	public Customer() {
	}

	// Parameterized constructor.
	public Customer(int id, String name, String emailAddress) {
		this.id = id;
		this.name = name;
//		this.age = age;
		this.emailAddress = emailAddress;
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
