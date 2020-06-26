package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.VehicleStatus;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface VehicleRepository extends JpaRepository<VehicleStatus, Integer> {

}
