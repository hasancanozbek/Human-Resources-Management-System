package com.demo.humanresourcesmanagementsystem.Business.concretes;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.JobService;
import com.demo.humanresourcesmanagementsystem.DataAccess.abstracts.JobRepository;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {
    private JobRepository jobRepository;

    @Autowired
    public JobManager(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }
}
