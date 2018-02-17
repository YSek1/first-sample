package sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.entity.Employee;
import sample.repository.EmployeeRepository;

@Service
public class ViewService {
	
	private EmployeeRepository employeeRepository;
	
	public ViewService() {
	}

	@Autowired
	public ViewService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
}