package com.demo.humanresourcesmanagementsystem.Business.concretes;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.EmployeeService;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Regex.MailRegex;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.*;
import com.demo.humanresourcesmanagementsystem.Core.Validation.MailValidation.MailVerificationService;
import com.demo.humanresourcesmanagementsystem.Core.Validation.PersonValidation.PersonValidationService;
import com.demo.humanresourcesmanagementsystem.DataAccess.abstracts.EmployeeRepository;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeRepository employeeRepository;
    private MailVerificationService mailVerificationService;
    private PersonValidationService personValidationService;

    @Autowired
    public EmployeeManager(EmployeeRepository employeeRepository, @Qualifier("TestMailVerification") MailVerificationService mailVerificationService, @Qualifier("TestValidate") PersonValidationService personValidationService) {
        this.employeeRepository = employeeRepository;
        this.mailVerificationService = mailVerificationService;
        this.personValidationService = personValidationService;
    }

    @Override
    public Result addEmployee(Employee employee) throws Exception {
        if (MailRegex.ifValidMail(employee.getEmail()) && personValidationService.isValidPerson(employee) && mailVerificationService.isValidMail(employee.getEmail())) {
            employeeRepository.save(employee);
            return new SuccessResult(employee.getFirstName() + " " + employee.getLastName() + " added.");
        } else {
            return new ErrorResult("Registration failed because your information was invalid.");
        }
    }

    @Override
    public DataResult<List<Employee>> getAllEmployees() {
        return new SuccessDataResult<List<Employee>>("Employees listed", employeeRepository.findAll());
    }
}
