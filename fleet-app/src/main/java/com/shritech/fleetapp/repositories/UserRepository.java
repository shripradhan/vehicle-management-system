package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.User;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
