package com.demo.humanresourcesmanagementsystem.Entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationDto {

    private int id;
    private String schoolName;
    private String department;
    private LocalDate startingDate;
    private LocalDate graduationDate;

}
