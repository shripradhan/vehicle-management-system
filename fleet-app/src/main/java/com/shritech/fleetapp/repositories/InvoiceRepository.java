package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.Invoice;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
