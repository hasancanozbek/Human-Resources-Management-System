package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Entity
@Table(name = "cv_works")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "cv"})
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "workplace")
    private String workplace;

    @ManyToOne
    @JoinColumn(name = "job_id", referencedColumnName = "id")
    private Job job;

    @PastOrPresent
    @Column(name = "starting_date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate startingDate;

    @Value("string value")
    @Column(name = "end_date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private CV cv;
}
