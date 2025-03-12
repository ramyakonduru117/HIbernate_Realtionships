package com.rel.Relationship.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rel.Relationship.Model.Employee;
import com.rel.Relationship.Service.RelService;

@RestController
@RequestMapping("/api")
public class RelController 
{
	@Autowired
	private RelService relserve;
  @PostMapping("/post")
  public String  saveemp(@RequestBody Employee emp)
  {
	  relserve.saveobj(emp);
	  return "data saved";
  }
  @GetMapping("/get")
  public Employee getallemp(@RequestParam Integer empid)
  {
	  return relserve.getobj(empid);
  }
//  @DeleteMapping("/delete/{empid}")
//  public String deleteemp(@PathVariable Integer empid)
//  {
//	  relserve.deleteobj(empid);
//	  return "empdeleted";
//  }
}
