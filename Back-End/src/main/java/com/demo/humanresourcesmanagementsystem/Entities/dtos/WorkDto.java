package com.demo.humanresourcesmanagementsystem.Entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkDto {

    int id;
    private String workplace;
    private String job;
    private LocalDate startingDate;
    private LocalDate endDate;
}
