package com.hospital.doctors.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctors {
	
	@Id	
	@Column(name="doctor_id")
	private int doctorId;
	
	@Column(name="doctor_iame")
	private String doctorName;
	
	@Column(name="doctor_address")
	private String doctorAddress;
	
	@Column(name="doctor_phonenumber")
	private String doctorPhonenumber;
	
	@Column(name="doctor_age")
	private int doctorAge;
	
	
	@Column(name= "sspecialization_id")
	private int specializationId;
	
	@Column(name= "hospital_id")
	private int hospitalId;

}
