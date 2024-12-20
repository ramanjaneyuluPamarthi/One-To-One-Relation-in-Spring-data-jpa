package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
