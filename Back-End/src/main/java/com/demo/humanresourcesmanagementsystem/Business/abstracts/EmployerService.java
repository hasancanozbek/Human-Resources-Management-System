package com.demo.humanresourcesmanagementsystem.Business.abstracts;

import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employer;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.JobPosting;

import java.util.List;

public interface EmployerService extends JobPostingService {

    Result addEmployer(Employer employer);

    Result addJobPosting(JobPosting jobPosting);

    DataResult<List<Employer>> getAllEmployers();

    Result passiveJobPosting(int id);


}
