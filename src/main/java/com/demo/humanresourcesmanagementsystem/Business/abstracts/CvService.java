package com.demo.humanresourcesmanagementsystem.Business.abstracts;

import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.CV;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Education;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Work;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.EducationDto;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.WorkDto;

import java.time.LocalDate;
import java.util.List;

public interface CvService {

    Result addCV(String github, String linkedin, String coverLetter, String photo, int employeeId);

    Result addEducationInfo(String schoolName, String department, LocalDate startingDate, LocalDate graduationDate, int cvId);

    Result addWorkInfo(String workplace, int jobId, LocalDate startingDate, LocalDate endDate, int cvId);

    Result addLanguegeInfo(int cvId, String languege, int level);

    Result addTechnologyInfo(String technology, int cvId);

    DataResult<List<Education>> findAllByOrderByGraduationDateDesc();

    DataResult<Education> findByEducationId(int id);

    DataResult<List<EducationDto>> findAllByEducationId(int id);

    DataResult<List<Work>> findAllByOrderByEndDateDesc();

    DataResult<Work> findByWorkId(int id);

    DataResult<List<WorkDto>> findAllByWorkId(int id);

    DataResult<String> uploadPhoto(int id, String file);

    DataResult<List<CV>> findCVByEmployeeId(int employeeId);


}
