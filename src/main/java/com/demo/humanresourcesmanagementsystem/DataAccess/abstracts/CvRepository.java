package com.demo.humanresourcesmanagementsystem.DataAccess.abstracts;

import com.demo.humanresourcesmanagementsystem.Entities.concretes.CV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CvRepository extends JpaRepository<CV, Integer> {

    //ToDo : Cv listeleme sorunu çözülecek. DTO düzenlemesi yapılacak.
    @Query(value = "select employee.first_name, employee.last_name, employee.year_of_birth, " +
            "cv.cover_letter, cv.github, cv.linkedin, cv.photo, " +
            "educations.school_name, educations.department, educations.starting_date, educations.graduation_date, " +
            "works.workplace, works.job_id, works.starting_date, works.end_date " +
            "technologies.technology, langueges.languege, langueges.level " +
            "from cvs as cv inner join employees as employee on cv.employee_id = employee.user_id " +
            "left join cv_educations as educations on cv.id = educations.cv_id " +
            "left join cv_works as works on cv.id = works.cv_id" +
            "left join cv_technologies as technologies on cv.id = technologies.cv_id" +
            "left join cv_langueges as langueges on cv.id = langueges.cv_id" +
            "where employee.user_id =:employeeId", nativeQuery = true)
    CV findByEmployeeId(int employeeId);

}
