package com.demo.humanresourcesmanagementsystem.DataAccess.abstracts;

import com.demo.humanresourcesmanagementsystem.Entities.concretes.Education;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.EducationDto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

public interface EducationRepository extends JpaRepository<Education, Integer> {

    List<Education> findAllByOrderByGraduationDateDesc();

    Education findById(int id);

    @Query("select new com.demo.humanresourcesmanagementsystem.Entities.dtos.EducationDto" +
            "(cv.id, education.schoolName, education.department, education.startingDate, education.graduationDate) from Education education " +
            "inner join education.cv cv where education.cv.id =:id")
    List<EducationDto> findAllByEducationId(int id, Sort sort);

    @Transactional
    @Modifying
    @Query(value = "insert into cv_educations (school_name, department, starting_date, graduation_date, cv_id) values (" +
            ":schoolName, :department, :startingDate, :graduationDate, :cvId)", nativeQuery = true)
    int addEducationInfo(@Param("schoolName") String schoolName, @Param("department") String department, @Param("startingDate") LocalDate startingDate,
                         @Param("graduationDate") LocalDate graduationDate, @Param("cvId") int cvId);
}
