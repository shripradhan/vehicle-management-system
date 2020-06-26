package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.VehicleType;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
