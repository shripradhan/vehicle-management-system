package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.Employee;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface EmployeeTypeRepository extends JpaRepository<Employee, Integer> {

}
