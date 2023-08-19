
package com.infogalaxy.employeeapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogalaxy.employeeapp.entity.Employeeentity;
import com.infogalaxy.employeeapp.Model.EmployeeModel;
import com.infogalaxy.employeeapp.repo.EmployeeRepo;
import com.infogalaxy.employeeapp.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public String addemp(EmployeeModel employeeModel) {

		Employeeentity employeeentity = new Employeeentity();
		employeeentity.setEid(employeeModel.getEid());
		employeeentity.setName(employeeModel.getName());
		employeeentity.setDepartment(employeeModel.getDepartment());
		employeeentity.setSalary(employeeModel.getSalary());
		employeeentity.setDoj(employeeModel.getDoj());
		employeeentity.setAge(employeeModel.getAge());

		employeeRepo.save(employeeentity);
		return "Employee Added...";
	}

	@Override
	public List<EmployeeEntity> getallemp() {
		return employeeRepo.findAll();
	}

	@Override
	public EmployeeEntity getempbyid(int eid) {
		return employeeRepo.getEmployeeEntityByEid(eid);
	}



}