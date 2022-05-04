package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cv_educations")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "cv"})
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
    @PastOrPresent
    @Column(name = "starting_date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate startingDate;

    @NotBlank
    @Column(name = "graduation_date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate graduationDate;

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private CV cv;
}
