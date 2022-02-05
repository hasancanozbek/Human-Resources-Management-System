package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
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

    @NotBlank
    @NotNull
    @ManyToOne
    @JoinColumn(name = "employer_id", referencedColumnName = "user_id")
    private Employer employer;

    @NotBlank
    @NotNull
    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "id")
    private Job job;

    @NotBlank
    @NotNull
    @Column(name = "description")
    private String description;

    @NotBlank
    @NotNull
    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City city;

    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;

    @NotBlank
    @NotNull
    @Column(name = "open_positions")
    private int openPositions;

    @NotBlank
    @NotNull
    @FutureOrPresent
    @Column(name = "application_deadline")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate applicationDeadline;

    @NotBlank
    @NotNull
    @PastOrPresent
    @Column(name = "release_date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate releaseDate = LocalDate.now();

    @NotBlank
    @NotNull
    @Column(name = "active", columnDefinition = "boolean default true")
    private boolean active;

}