package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobs")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobPostings"})
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "job_name")
    private String jobName;

    @OneToMany(mappedBy = "job")
    List<JobPosting> jobPostings;

    @OneToMany(mappedBy = "job")
    List<Work> works;
}
