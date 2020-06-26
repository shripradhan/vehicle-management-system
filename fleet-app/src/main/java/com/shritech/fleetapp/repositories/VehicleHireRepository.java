package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.VehicleHire;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
