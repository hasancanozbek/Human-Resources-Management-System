package com.demo.humanresourcesmanagementsystem.Business.abstracts;

import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.JobPostingDto;

import java.util.List;

public interface JobPostingService {

    DataResult<List<JobPostingDto>> findByActiveJobPostings();

    DataResult<List<JobPostingDto>> findByJobPostingsWithSorting();

    DataResult<List<JobPostingDto>> findByCompanyJobPostings(String companyName);

}
