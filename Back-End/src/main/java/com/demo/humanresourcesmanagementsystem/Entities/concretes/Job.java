package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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

    @NotBlank
    @NotNull
    @Column(name = "job_name")
    private String jobName;

    @JsonIgnore
    @OneToMany(mappedBy = "job")
    private List<JobPosting> jobPostings;

    @JsonIgnore
    @OneToMany(mappedBy = "job")
    private List<Work> works;
}
