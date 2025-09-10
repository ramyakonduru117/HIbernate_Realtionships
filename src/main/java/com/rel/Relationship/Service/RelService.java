package com.rel.Relationship.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.rel.Relationship.Model.Employee;
import com.rel.Relationship.jparepo.Employeerepository;

import jakarta.transaction.Transactional;

@Service
//ksdjflerjg
public class RelService 
{
  @Autowired
  private Employeerepository emprepo;
	public Employee saveobj(Employee emp)
	{
		return emprepo.save(emp);
	}
	public Employee getobj(Integer empid)
	{
		return emprepo.findById(empid).get();
	}

	
	
}
