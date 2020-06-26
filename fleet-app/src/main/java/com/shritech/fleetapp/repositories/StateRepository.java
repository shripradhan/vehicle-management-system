package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.State;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
