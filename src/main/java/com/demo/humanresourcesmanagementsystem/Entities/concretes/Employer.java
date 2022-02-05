package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "employers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Employer extends User {

    @NotBlank
    @NotNull
    @Column(name = "company_name", length = 128)
    private String companyName;

    @NotBlank
    @NotNull
    @Column(name = "company_website", length = 128)
    private String companyWebsite;

    @NotBlank
    @NotNull
    @Column(name = "company_telephone", length = 12)
    private String companyTelephone;

    @Column(name = "validation", columnDefinition = "boolean default false")
    private boolean validation;

    @JsonIgnore
    @OneToMany(mappedBy = "employer")
    private List<JobPosting> jobPostings;
}
