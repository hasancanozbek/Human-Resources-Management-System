package com.demo.humanresourcesmanagementsystem.Business.concretes;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.EmployerService;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Regex.MailRegex;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.*;
import com.demo.humanresourcesmanagementsystem.Core.Validation.MailValidation.MailVerificationService;
import com.demo.humanresourcesmanagementsystem.DataAccess.abstracts.EmployerRepository;
import com.demo.humanresourcesmanagementsystem.DataAccess.abstracts.JobPostingRepository;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employer;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.JobPosting;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.JobPostingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerRepository employerRepository;
    private MailVerificationService mailVerificationService;
    private JobPostingRepository jobPostingRepository;

    @Autowired
    public EmployerManager(EmployerRepository employerRepository, JobPostingRepository jobPostingRepository, @Qualifier("TestMailVerification") MailVerificationService mailVerificationService) {
        this.employerRepository = employerRepository;
        this.mailVerificationService = mailVerificationService;
        this.jobPostingRepository = jobPostingRepository;
    }

    @Override
    public Result addEmployer(Employer employer) {
        if (MailRegex.ifValidMail(employer.getEmail()) && MailRegex.ifCompanyMail(employer) && mailVerificationService.isValidMail(employer.getEmail())) {
            employerRepository.save(employer);
            return new SuccessResult(employer.getCompanyName() + " added");
        } else {
            return new ErrorResult("Registration failed because your company information was invalid.");
        }
    }

    @Override
    public DataResult<List<Employer>> getAllEmployers() {
        return new SuccessDataResult<List<Employer>>("Employers listed", employerRepository.findAll());
    }

    @Override
    public Result addJobPosting(JobPosting jobPosting) {
        jobPostingRepository.save(jobPosting);
        return new SuccessResult("Job posting added for company");
    }


    @Override
    public DataResult<List<JobPostingDto>> findByActiveJobPostings() {
        return new SuccessDataResult<List<JobPostingDto>>("All active job postings are listed", jobPostingRepository.findByActiveJobPostings());
    }

    @Override
    public DataResult<List<JobPostingDto>> findByJobPostingsWithSorting() {
        return new SuccessDataResult<List<JobPostingDto>>("All active job postings sorted by date",
                jobPostingRepository.findByJobPostingsWithSorting(Sort.by(Sort.Direction.ASC, "applicationDeadline")));
    }

    @Override
    public DataResult<List<JobPostingDto>> findByCompanyJobPostings(String companyName) {
        return new SuccessDataResult<List<JobPostingDto>>(companyName + "'s active job postings are listed",
                jobPostingRepository.findByCompanyJobPostings(companyName));
    }

    @Override
    public Result passiveJobPosting(int id) {
        JobPosting jobPosting = jobPostingRepository.findById(id).get();
        jobPosting.setActive(false);
        jobPostingRepository.save(jobPosting);
        return new SuccessResult("Job posting deactivated");
    }
}
