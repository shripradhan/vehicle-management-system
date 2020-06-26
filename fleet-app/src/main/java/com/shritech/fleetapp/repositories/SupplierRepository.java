package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.Supplier;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
