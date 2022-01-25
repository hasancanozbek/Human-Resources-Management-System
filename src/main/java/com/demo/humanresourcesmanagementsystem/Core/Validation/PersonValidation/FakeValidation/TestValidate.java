package com.demo.humanresourcesmanagementsystem.Core.Validation.PersonValidation.FakeValidation;

import com.demo.humanresourcesmanagementsystem.Core.Validation.PersonValidation.PersonValidationService;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("TestValidate")
public class TestValidate implements PersonValidationService {
    @Override
    public boolean isValidPerson(Employee employee) {
        return true;
    }
}
