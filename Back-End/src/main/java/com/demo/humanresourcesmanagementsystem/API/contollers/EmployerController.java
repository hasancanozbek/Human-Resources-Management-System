package com.demo.humanresourcesmanagementsystem.API.contollers;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.EmployerService;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employer;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.JobPosting;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.JobPostingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/employer")
public class EmployerController {
    private final EmployerService employerService;

    @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @PostMapping("/addEmployer")//Test edildi
    public Result addEmployer(@Valid @RequestBody Employer employer) {
        return employerService.addEmployer(employer);
    }

    @PostMapping("/addJobPosting")//Test edildi
    public Result addjobPosting(@RequestBody JobPosting jobPosting) {
        return employerService.addJobPosting(jobPosting);
    }

    @GetMapping("/getAllEmployers")//Test edildi
    public DataResult<List<Employer>> getAllEmployers() {
        return employerService.getAllEmployers();
    }

    @GetMapping("/findByActiveJobPostings")//Test edildi
    public DataResult<List<JobPostingDto>> findByActiveJobPostings() {
        return employerService.findByActiveJobPostings();
    }

    @GetMapping("/findByJobPostingsWithSorting")//Test edildi
    public DataResult<List<JobPostingDto>> findByJobPostingsWithSorting() {
        return employerService.findByJobPostingsWithSorting();
    }

    @GetMapping("/findByCompanyJobPostings")//Test edildi
    public DataResult<List<JobPostingDto>> findByCompanyJobPostings(@RequestParam String companyName) {
        return employerService.findByCompanyJobPostings(companyName);
    }

    @GetMapping("/passiveJobPosting")//Test edildi
    public Result passiveJobPosting(@RequestParam int id) {
        return employerService.passiveJobPosting(id);
    }

}
