package com.hospital.hospitals.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospitals {
	
	@Id
	@Column(name="hospital_Id")
	private int hospitalId;
	@Column(name="hospital_Name")
	private String hospitalName;
	@Column(name="hospital_Address")
	private String hospitalAddress;
	@Column(name="hospital_Phone")
	private int hospitalPhone;
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalAddress() {
		return hospitalAddress;
	}
	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}
	public int getHospitalPhone() {
		return hospitalPhone;
	}
	public void setHospitalPhone(int hospitalPhone) {
		this.hospitalPhone = hospitalPhone;
	}
	@Override
	public String toString() {
		return "Hospital [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", hospitalAddress="
				+ hospitalAddress + ", hospitalPhone=" + hospitalPhone + "]";
	}
	

}
