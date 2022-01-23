package com.demo.humanresourcesmanagementsystem.Business.abstracts;

import com.demo.humanresourcesmanagementsystem.Entities.concretes.Job;

import java.util.List;

public interface JobService {
    List<Job> getAllJobs();
}
