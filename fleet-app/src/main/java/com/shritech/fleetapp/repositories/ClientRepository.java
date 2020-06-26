package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.Client;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
