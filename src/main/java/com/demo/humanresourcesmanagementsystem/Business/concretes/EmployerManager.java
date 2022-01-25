package com.demo.humanresourcesmanagementsystem.Business.concretes;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.EmployerService;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Regex.MailRegex;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.*;
import com.demo.humanresourcesmanagementsystem.Core.Validation.MailValidation.MailVerificationService;
import com.demo.humanresourcesmanagementsystem.DataAccess.abstracts.EmployerRepository;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerRepository employerRepository;
    private MailVerificationService mailVerificationService;

    @Autowired
    public EmployerManager(EmployerRepository employerRepository, @Qualifier("TestMailVerification") MailVerificationService mailVerificationService) {
        this.employerRepository = employerRepository;
        this.mailVerificationService = mailVerificationService;
    }

    @Override
    public Result addEmployer(Employer employer) {
        if (MailRegex.ifValidMail(employer.getEmail()) && MailRegex.ifCompanyMail(employer) && mailVerificationService.isValidMail(employer.getEmail())) {
            employerRepository.save(employer);
            return new SuccessResult(employer.getCompanyName() + " added");
        } else {
            return new ErrorResult("Registration failed because your company information was invalid.");
        }
    }

    @Override
    public DataResult<List<Employer>> getAllEmployers() {
        return new SuccessDataResult<List<Employer>>("Employers listed", employerRepository.findAll());
    }
}
