package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.Location;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
