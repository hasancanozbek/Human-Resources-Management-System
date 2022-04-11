package com.demo.humanresourcesmanagementsystem.Entities.dtos;

import com.demo.humanresourcesmanagementsystem.Entities.concretes.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CvDto {

    private String firstName;
    private String lastName;
    private String email;
    private int yearOfBirth;
    private CV cv;
    private List<Education> educations;
    private List<Work> works;
    private List<Technology> technologies;
    private List<Languege> langueges;
}
