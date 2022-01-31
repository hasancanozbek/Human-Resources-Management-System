package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "works")
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @Column(name = "starting_date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate startingDate;

    @Column(name = "end_date")
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private LocalDate endDate;

    @ManyToMany(mappedBy = "work")
    private List<CV> cv;
}
