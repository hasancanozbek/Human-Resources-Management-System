package com.demo.humanresourcesmanagementsystem.Business.abstracts;

import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employer;

import java.util.List;

public interface EmployerService {

    public Result addEmployer(Employer employer);

    public DataResult<List<Employer>> getAllEmployers();

}
