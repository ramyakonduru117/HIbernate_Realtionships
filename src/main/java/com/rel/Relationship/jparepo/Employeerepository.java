package com.rel.Relationship.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rel.Relationship.Model.Employee;

@Repository
public interface Employeerepository extends JpaRepository<Employee, Integer>{

}
