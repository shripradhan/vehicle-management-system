package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.VehicleModel;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}