package com.demo.humanresourcesmanagementsystem.Business.concretes;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.JobService;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.SuccessDataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.SuccessResult;
import com.demo.humanresourcesmanagementsystem.DataAccess.abstracts.JobRepository;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobManager implements JobService {
    private JobRepository jobRepository;

    @Autowired
    public JobManager(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public SuccessDataResult getAllJobs() {
        return new SuccessDataResult("Jobs listed", jobRepository.findAll());
    }

    @Override
    public Result addJob(Job job) {
        jobRepository.save(job);
        return new SuccessResult(job.getJobName() + " added");
    }
}
