package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.Contact;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
