package com.fujitsu.beans;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fujitsu.project.user.User;



@Entity
@Table(name="CUSTOMER_MASTER")
 public class Customer 
{
	
  @Id
  @GeneratedValue
  private int customer_Id;
  
  @Column(length=30,nullable=false)
  private String customer_Name; 
  
  private Long phone_No;
  
  @Column(length=30,nullable=false)
  private String email_Id;
  
  private Address address;
  
  @Column(length=30,nullable=false)
  private String gender;
  
  @Column(length=30,nullable=false)
  private String id_Type;
  
  @Column(length=30,nullable=false)
  private String id_No;
 
  @Column(length=30,nullable=false)
  private String nationality;
  
  private Date birthDate;
  private User user_Id;
  private Long country_Code;
  @OneToOne(cascade=CascadeType.ALL)
  @JoinColumn(name="")
  private User user;
  
  
public int getCustomer_Id() {
	return customer_Id;
}
public void setCustomer_Id(int customer_Id) {
	this.customer_Id = customer_Id;
}
public String getCustomer_Name() {
	return customer_Name;
}
public void setCustomer_Name(String customer_Name) {
	this.customer_Name = customer_Name;
}
public Long getPhone_No() {
	return phone_No;
}
public void setPhone_No(Long phone_No) {
	this.phone_No = phone_No;
}
public String getEmail_Id() {
	return email_Id;
}
public void setEmail_Id(String email_Id) {
	this.email_Id = email_Id;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getId_Type() {
	return id_Type;
}
public void setId_Type(String id_Type) {
	this.id_Type = id_Type;
}
public String getNationality() {
	return nationality;
}
public void setNationality(String nationality) {
	this.nationality = nationality;
}
public String getId_No() {
	return id_No;
}
public void setId_No(String id_No) {
	this.id_No = id_No;
}
public Date getBirthDate() {
	return birthDate;
}
public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
}
public User getUser_Id() {
	return user_Id;
}
public void setUser_Id(User user_Id) {
	this.user_Id = user_Id;
}
public Long getCountry_Code() {
	return country_Code;
}
public void setCountry_Code(Long country_Code) {
	this.country_Code = country_Code;
}

public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}


@Override
public String toString() {
	return "Customer [customer_Id=" + customer_Id + ", customer_Name=" + customer_Name + ", phone_No=" + phone_No
			+ ", email_Id=" + email_Id + ", address=" + address + ", gender=" + gender + ", id_Type=" + id_Type
			+ ", nationality=" + nationality + ", id_No=" + id_No + ", birthDate=" + birthDate + ", user_Id=" + user_Id
			+ ", country_Code=" + country_Code + ", user=" + user + "]";
}

}

  
  
  
