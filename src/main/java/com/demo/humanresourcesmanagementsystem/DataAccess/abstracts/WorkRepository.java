package com.demo.humanresourcesmanagementsystem.DataAccess.abstracts;


import com.demo.humanresourcesmanagementsystem.Entities.concretes.Work;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.WorkDto;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorkRepository extends JpaRepository<Work, Integer> {

    List<Work> findAllByOrderByEndDateDesc();

    Work findById(int id);

    @Query("select new com.demo.humanresourcesmanagementsystem.Entities.dtos.WorkDto" + "" +
            "(cv.id, work.workplace, job.jobName, work.startingDate, work.endDate) from Work work " + "" +
            "inner join work.cv cv inner join work.job job where work.cv.id =:id")
    List<WorkDto> findAllByWorkId(int id, Sort sort);

}
