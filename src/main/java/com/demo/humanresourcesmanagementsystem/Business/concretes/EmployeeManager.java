package com.demo.humanresourcesmanagementsystem.Business.concretes;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.EmployeeService;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.SuccessDataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.SuccessResult;
import com.demo.humanresourcesmanagementsystem.DataAccess.abstracts.EmployeeRepository;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeManager(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Result addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return new SuccessResult(employee.getFirstName() + " " + employee.getLastName() + " added.");
    }

    @Override
    public DataResult<List<Employee>> getAllEmployees() {
        return new SuccessDataResult<List<Employee>>("Employees listed", employeeRepository.findAll());
    }
}
