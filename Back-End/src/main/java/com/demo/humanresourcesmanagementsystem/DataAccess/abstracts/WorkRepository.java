package com.demo.humanresourcesmanagementsystem.DataAccess.abstracts;


import com.demo.humanresourcesmanagementsystem.Entities.concretes.Work;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.WorkDto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

public interface WorkRepository extends JpaRepository<Work, Integer> {

    List<Work> findAllByOrderByEndDateDesc();

    Work findById(int id);

    @Query("select new com.demo.humanresourcesmanagementsystem.Entities.dtos.WorkDto" + "" +
            "(cv.id, work.workplace, job.jobName, work.startingDate, work.endDate) from Work work " + "" +
            "inner join work.cv cv inner join work.job job where work.cv.id =:id")
    List<WorkDto> findAllByWorkId(int id, Sort sort);

    @Transactional
    @Modifying
    @Query(value = "insert into cv_works (workplace, job_id, starting_date, end_date, cv_id) values (" +
            ":workplace, :jobId, :startingDate, :endDate, :cvId)", nativeQuery = true)
    int addWorkInformation(@Param("workplace") String workplace, @Param("jobId") int jobId, @Param("startingDate") LocalDate startingDate,
                           @Param("endDate") LocalDate endDate, @Param("cvId") int cvId);
}
