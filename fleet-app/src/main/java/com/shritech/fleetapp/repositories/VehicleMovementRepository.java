package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.VehicleMovement;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
