package com.infogalaxy.employeeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infogalaxy.employeeapp.entity.Employeeentity;

@Repository
public interface EmployeeRepo extends JpaRepository<Employeeentity , Integer>{

}
