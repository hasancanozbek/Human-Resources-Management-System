package com.demo.humanresourcesmanagementsystem.DataAccess.abstracts;

import com.demo.humanresourcesmanagementsystem.Entities.concretes.JobPosting;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.JobPostingDto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobPostingRepository extends JpaRepository<JobPosting, Integer> {

    @Query("Select new com.demo.humanresourcesmanagementsystem.Entities.dtos.JobPostingDto" +
            "(j.id ,employer.companyName, job.jobName, j.openPositions, j.releaseDate, j.applicationDeadline) From JobPosting j " +
            "Inner Join j.employer employer Inner Join j.job job Where j.active=true")
    List<JobPostingDto> findByActiveJobPostings();

    @Query("Select new com.demo.humanresourcesmanagementsystem.Entities.dtos.JobPostingDto" +
            "(j.id ,employer.companyName, job.jobName, j.openPositions, j.releaseDate, j.applicationDeadline) From JobPosting j " +
            "Inner Join j.employer employer Inner Join j.job job Where j.active=true")
    List<JobPostingDto> findByJobPostingsWithSorting(Sort sort);

    @Query("Select new com.demo.humanresourcesmanagementsystem.Entities.dtos.JobPostingDto" +
            "(j.id ,employer.companyName, job.jobName, j.openPositions, j.releaseDate, j.applicationDeadline) From JobPosting j " +
            "Inner Join j.employer employer Inner Join j.job job Where j.employer.companyName =:companyName And j.active = true")
    List<JobPostingDto> findByCompanyJobPostings(String companyName);


}
