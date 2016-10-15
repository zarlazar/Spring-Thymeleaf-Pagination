package com.project.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Building {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private long buildingId;
	
	private String streetName;
	
	private String buildingNumber;
	
	private int numberOfFloors;
	
	public Building(){
		
	}

	public Building(long buildingId, String streetName, String buildingNumber, int numberOfFloors) {
		this.buildingId = buildingId;
		this.streetName = streetName;
		this.buildingNumber = buildingNumber;
		this.numberOfFloors = numberOfFloors;
	}

	public long getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(long buildingId) {
		this.buildingId = buildingId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(String buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	@Override
	public String toString() {
		return "Building [buildingId=" + buildingId + ", streetName=" + streetName + ", buildingNumber="
				+ buildingNumber + ", numberOfFloors=" + numberOfFloors + "]";
	}
	
	
}
