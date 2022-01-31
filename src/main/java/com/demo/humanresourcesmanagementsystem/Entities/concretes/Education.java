package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "educations")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @NotBlank
    @Column(name = "school_name")
    private String schoolName;

    @NotNull
    @NotBlank
    @Column(name = "department")
    private String department;

    @NotNull
    @NotBlank
    @Column(name = "starting_date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate startingDate;

    @Column(name = "graduation_date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate graduationDate;

    @ManyToMany(mappedBy = "education")
    private List<CV> cv;

}
