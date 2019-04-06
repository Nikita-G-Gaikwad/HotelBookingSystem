package com.fujitsu.beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(length=20)
	private int flatNo;
	@Column(length=20)
	private String buildingName;
	@Column(length=20)
	private String streetName;
	@Column(length=20)
	private String locality;
	@Column(length=20)
	private String city;
	@Column(length=20)
	private String state;
	@Column(length=20)
	private String country;
	@Column(length=20)
	private String zip;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int flatNo, String buildingName, String streetName, String locality, String city, String state,
			String country, String zip) {
		super();
		this.flatNo = flatNo;
		this.buildingName = buildingName;
		this.streetName = streetName;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", buildingName=" + buildingName + ", streetName=" + streetName
				+ ", locality=" + locality + ", city=" + city + ", state=" + state + ", country=" + country + ", zip="
				+ zip + "]";
	}
	
	
	
}
