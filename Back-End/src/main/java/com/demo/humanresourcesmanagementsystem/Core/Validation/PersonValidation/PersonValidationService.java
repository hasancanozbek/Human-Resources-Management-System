package com.demo.humanresourcesmanagementsystem.Core.Validation.PersonValidation;

import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employee;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.User;

public interface PersonValidationService {

    boolean isValidPerson(Employee employee) throws Exception;
}
