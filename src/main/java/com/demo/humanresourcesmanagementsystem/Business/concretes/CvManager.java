package com.demo.humanresourcesmanagementsystem.Business.concretes;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.CvService;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.SuccessDataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.SuccessResult;
import com.demo.humanresourcesmanagementsystem.DataAccess.abstracts.*;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.CV;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Education;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Work;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.EducationDto;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.WorkDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CvManager implements CvService {

    private final CvRepository cvRepository;
    private final EducationRepository educationRepository;
    private final WorkRepository workRepository;
    private final LanguegeRepository languegeRepository;
    private final TechnologyRepository technologyRepository;


    @Autowired
    public CvManager(CvRepository cvRepository, EducationRepository educationRepository,
                     WorkRepository workRepository, LanguegeRepository languegeRepository,
                     TechnologyRepository technologyRepository) {
        this.cvRepository = cvRepository;
        this.educationRepository = educationRepository;
        this.workRepository = workRepository;
        this.languegeRepository = languegeRepository;
        this.technologyRepository = technologyRepository;
    }

    @Override
    public Result addCV(String github, String linkedin, String coverLetter, String photo, int employeeId) {
        cvRepository.addCV(github, linkedin, coverLetter, photo, employeeId);
        return new SuccessResult("CV added.");
    }


    @Override
    public Result addEducationInfo(String schoolName, String department, LocalDate startingDate, LocalDate graduationDate, int cvId) {
        educationRepository.addEducationInfo(schoolName, department, startingDate, graduationDate, cvId);
        return new SuccessResult("Education information added to cv");
    }


    @Override
    public Result addWorkInfo(String workplace, int jobId, LocalDate startingDate, LocalDate endDate, int cvId) {
        workRepository.addWorkInformation(workplace, jobId, startingDate, endDate, cvId);
        return new SuccessResult("Work information added to cv");
    }


    @Override
    public Result addLanguegeInfo(int cvId, String languege, int level) {
        languegeRepository.addLanguegeInfo(cvId, languege, level);
        return new SuccessResult("Languege information added to cv");
    }


    @Override
    public Result addTechnologyInfo(String technology, int cvId) {
        technologyRepository.addTechnologyInfo(technology, cvId);
        return new SuccessResult("Technology information added to cv");
    }


    @Override
    public DataResult<List<Education>> findAllByOrderByGraduationDateDesc() {
        return new SuccessDataResult<List<Education>>("Education information listed",
                educationRepository.findAllByOrderByGraduationDateDesc());
    }


    @Override
    public DataResult<Education> findByEducationId(int id) {
        return new SuccessDataResult<Education>("Education information listed",
                educationRepository.findById(id));
    }


    @Override
    public DataResult<List<EducationDto>> findAllByEducationId(int id) {
        return new SuccessDataResult<List<EducationDto>>("Education information listed",
                educationRepository.findAllByEducationId(id, Sort.by(Sort.Direction.DESC, "graduationDate")));
    }


    @Override
    public DataResult<List<Work>> findAllByOrderByEndDateDesc() {
        return new SuccessDataResult<List<Work>>("Work information listed",
                workRepository.findAllByOrderByEndDateDesc());
    }


    @Override
    public DataResult<Work> findByWorkId(int id) {
        return new SuccessDataResult<Work>("Work information listed",
                workRepository.findById(id));
    }


    @Override
    public DataResult<List<WorkDto>> findAllByWorkId(int id) {
        return new SuccessDataResult<List<WorkDto>>("Work information listed",
                workRepository.findAllByWorkId(id, Sort.by(Sort.Direction.DESC, "endDate")));
    }


    @Override
    public DataResult<List<CV>> findCVByEmployeeId(int employeeId) {
        return new SuccessDataResult<List<CV>>("Cv is listed for entered id", cvRepository.findCVByEmployeeId(employeeId));
    }


}
