package com.hospital.hospitals.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospitals.model.Hospitals;
import com.hospital.hospitals.repositry.HospitalRepositary;

@RestController
@RequestMapping("hopitals")
public class HospitalController {
	
	@Autowired
	HospitalRepositary hospitalRepositary;
	
	@GetMapping("/all")
	public List<Hospitals> getAllHospital(){
		return this.hospitalRepositary.findAll();
	}
	
	@GetMapping("/{Id}")
	public Optional<Hospitals> getById(@PathVariable (value = "id") int hopitalId) {
		
		return this.hospitalRepositary.findById(hopitalId);
		
	}
	
	@PostMapping("/addHospital")
	public Hospitals addHospital(@RequestBody Hospitals hospital) {
		return this.hospitalRepositary.save(hospital);
		
	}
	
	@DeleteMapping("/deleteHospital")
	public void deleteHospital(@PathVariable (value = "id") int hospitalId) {
		hospitalRepositary.deleteById(hospitalId);
	}

}
