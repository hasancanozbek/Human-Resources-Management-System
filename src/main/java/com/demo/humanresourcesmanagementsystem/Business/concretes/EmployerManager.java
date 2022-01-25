package com.demo.humanresourcesmanagementsystem.Business.concretes;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.EmployerService;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.SuccessDataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.SuccessResult;
import com.demo.humanresourcesmanagementsystem.DataAccess.abstracts.EmployerRepository;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerRepository employerRepository;

    @Autowired
    public EmployerManager(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    @Override
    public Result addEmployer(Employer employer) {
        employerRepository.save(employer);
        return new SuccessResult(employer.getCompanyName() + " added");
    }

    @Override
    public DataResult<List<Employer>> getAllEmployers() {
        return new SuccessDataResult<List<Employer>>("Employers listed", employerRepository.findAll());
    }
}
