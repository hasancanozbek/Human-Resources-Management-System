package com.demo.humanresourcesmanagementsystem.DataAccess.abstracts;

import com.demo.humanresourcesmanagementsystem.Entities.concretes.CV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CvRepository extends JpaRepository<CV, Integer> {

    List<CV> findCVByEmployeeId(int employeeId);

    @Transactional
    @Modifying
    @Query(value = "insert into cvs (github, linkedin, cover_letter, photo, employee_id) values (" +
            ":github, :linkedin, :coverLetter, :photo, :employeeId)", nativeQuery = true)
    int addCV(@Param("github") String github, @Param("linkedin") String linkedin, @Param("coverLetter") String coverLetter,
              @Param("photo") String photo, @Param("employeeId") int employeeId);
}
