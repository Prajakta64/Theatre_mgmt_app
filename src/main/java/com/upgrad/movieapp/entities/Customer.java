package com.upgrad.movieapp.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="customer_id_PK", length= 10)
	private int customerId ;
	
	@Column(name="first_name", length=20, nullable= false)
	private String firstName;
	
	@Column(name="last_name", length=20)
	private String lastName;
	
	@Column(name="username", length=20, nullable=false, unique=true)
	private String userName ;
	
	@Column(name="password", length=20)
	private String password;
	
	private LocalDateTime date_of_birth;
	
	private int user_type_id;
	private int language_id;
	
	
	
	// getter and setter methods
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length() >=5) {
		this.password = password;
		} else {
			System.out.println("password length must be greater than or equal to 5");
		}
	}
	public LocalDateTime getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(LocalDateTime date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public int getUser_type_id() {
		return user_type_id;
	}
	public void setUser_type_id(int user_type_id) {
		this.user_type_id = user_type_id;
	}
	public int getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerId, date_of_birth, firstName, language_id, lastName, password, userName,
				user_type_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return customerId == other.customerId && Objects.equals(date_of_birth, other.date_of_birth)
				&& Objects.equals(firstName, other.firstName) && language_id == other.language_id
				&& Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password)
				&& Objects.equals(userName, other.userName) && user_type_id == other.user_type_id;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", userName=" + userName + ", password=" + password + ", date_of_birth=" + date_of_birth
				+ ", user_type_id=" + user_type_id + ", language_id=" + language_id + "]";
	}
	
	
	

}
