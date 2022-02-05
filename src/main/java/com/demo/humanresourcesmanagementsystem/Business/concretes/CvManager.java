package com.demo.humanresourcesmanagementsystem.Business.concretes;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.CvService;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.SuccessDataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.SuccessResult;
import com.demo.humanresourcesmanagementsystem.DataAccess.abstracts.*;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.*;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.EducationDto;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.WorkDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

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
    public Result addCV(CV cv) {
        cvRepository.save(cv);
        return new SuccessResult("CV added.");
    }

    @Override
    public Result addEducationInfo(Education education) {
        educationRepository.save(education);
        return new SuccessResult("Education information added to cv");
    }

    @Override
    public Result addWorkInfo(Work work) {
        workRepository.save(work);
        return new SuccessResult("Work information added to cv");
    }

    @Override
    public Result addLanguegeInfo(Languege languege) {
        languegeRepository.save(languege);
        return new SuccessResult("Languege information added to cv");
    }

    @Override
    public Result addTechnologyInfo(Technology technology) {
        technologyRepository.save(technology);
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
}
