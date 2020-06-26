package com.shritech.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shritech.fleetapp.model.JobTitle;

/**
* @author Shrikant Pradhan
*/

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
