package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.Country;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
