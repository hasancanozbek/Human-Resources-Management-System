package com.demo.humanresourcesmanagementsystem.Entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingDto {

    private int id;
    private String companyName;
    private String jobName;
    private int openPositions;
    private LocalDate releaseDate;
    private LocalDate applicationDeadline;
}
