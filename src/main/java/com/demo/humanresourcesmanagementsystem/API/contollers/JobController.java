package com.demo.humanresourcesmanagementsystem.API.contollers;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.JobService;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    private JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/addJob")
    public Result addJob(@RequestBody Job job) {
        return jobService.addJob(job);
    }

    @GetMapping("/getAllJobs")
    public DataResult<List<Job>> getAllJobs() {
        return jobService.getAllJobs();
    }
}
