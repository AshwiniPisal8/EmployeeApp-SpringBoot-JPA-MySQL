package com.infogalaxy.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infogalaxy.employeeapp.entity.Employeeentity;
import com.infogalaxy.employeeapp.model.EmployeeModel;
import com.infogalaxy.employeeapp.service.IEmployeeService;
import com.infogalaxy.employeeapp.service.impl.EmployeeService;

@RestController
@RequestMapping("/employeeapp")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to Employee App";
	}

	@PostMapping("/addemp")
	public String addemp(@RequestBody EmployeeModel employeeModel) {
		return employeeService.addemp(employeeModel);
	}

	@GetMapping("/getallemp")
	public ResponseEntity<List<Employeeentity>> getallemp() {
		return new ResponseEntity<List<Employeeentity>>(employeeService.getallemp(), HttpStatus.ACCEPTED) ;
	}

	@GetMapping("/getemp/{eid}")
	public EmployeeEntity getempbyid(@PathVariable("eid") int eid) {
		return employeeService.getempbyid(eid);
	}

}