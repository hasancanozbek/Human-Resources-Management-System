package com.demo.humanresourcesmanagementsystem.Business.abstracts;

import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.*;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.EducationDto;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.WorkDto;

import java.util.List;

public interface CvService {

    Result addCV(CV cv);

    Result addEducationInfo(Education education);

    Result addWorkInfo(Work work);

    Result addLanguegeInfo(Languege languege);

    Result addTechnologyInfo(Technology technology);

    DataResult<List<Education>> findAllByOrderByGraduationDateDesc();

    DataResult<Education> findByEducationId(int id);

    DataResult<List<EducationDto>> findAllByEducationId(int id);

    DataResult<List<Work>> findAllByOrderByEndDateDesc();

    DataResult<Work> findByWorkId(int id);

    DataResult<List<WorkDto>> findAllByWorkId(int id);
}
