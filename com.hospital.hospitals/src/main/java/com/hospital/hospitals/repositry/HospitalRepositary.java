package com.hospital.hospitals.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospitals.model.Hospitals;

@Repository
public interface HospitalRepositary extends JpaRepository<Hospitals, Integer> {

}
