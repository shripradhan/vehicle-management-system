package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.VehicleMake;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
