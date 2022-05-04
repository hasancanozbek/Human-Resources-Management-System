package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "job_postings")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobPosting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "employer_id", referencedColumnName = "user_id")
    private Employer employer;

    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "id")
    private Job job;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City city;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;

    @Column(name = "open_positions")
    private int openPositions;

    @Column(name = "application_deadline")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate applicationDeadline;

    @Column(name = "release_date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate releaseDate = LocalDate.now();

    @Column(name = "active", columnDefinition = "boolean default true")
    private boolean active;

}