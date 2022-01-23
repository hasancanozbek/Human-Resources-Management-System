package com.demo.humanresourcesmanagementsystem.API.contollers;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.JobService;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    private JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/getalljobs")
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }
}
