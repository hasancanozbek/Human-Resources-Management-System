package com.demo.humanresourcesmanagementsystem.Business.abstracts;

import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employee;

import java.util.List;

public interface EmployeeService extends JobPostingService {
    Result addEmployee(Employee employee) throws Exception;

    DataResult<List<Employee>> getAllEmployees();
}
