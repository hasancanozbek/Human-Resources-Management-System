package com.demo.humanresourcesmanagementsystem.DataAccess.abstracts;

import com.demo.humanresourcesmanagementsystem.Entities.concretes.Education;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.EducationDto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EducationRepository extends JpaRepository<Education, Integer> {

    List<Education> findAllByOrderByGraduationDateDesc();

    Education findById(int id);

    @Query("select new com.demo.humanresourcesmanagementsystem.Entities.dtos.EducationDto" +
            "(cv.id, education.schoolName, education.department, education.startingDate, education.graduationDate) from Education education " +
            "inner join education.cv cv where education.cv.id =:id")
    List<EducationDto> findAllByEducationId(int id, Sort sort);
}
