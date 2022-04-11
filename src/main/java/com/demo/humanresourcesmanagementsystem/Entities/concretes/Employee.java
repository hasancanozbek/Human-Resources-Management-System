package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
@Entity

@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Employee extends User {

    @NotNull
    @NotBlank
    @Column(name = "first_name", length = 50)
    private String firstName;

    @NotNull
    @NotBlank
    @Column(name = "last_name", length = 50)
    private String lastName;

    @NotNull
    @NotBlank
    @Column(name = "national_identity", length = 11)
    private String nationalIdentity;

    @NotNull
    @Column(name = "year_of_birth")
    private int yearOfBirth;

    @JsonIgnore
    @OneToOne(mappedBy = "employee")
    private CV cv;
}
