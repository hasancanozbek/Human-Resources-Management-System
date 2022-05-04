package com.demo.humanresourcesmanagementsystem.DataAccess.abstracts;

import com.demo.humanresourcesmanagementsystem.Entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

    @Transactional
    @Modifying
    @Query(value = "insert into cv_technologies (technology, cv_id) values (" +
            ":technology, :cvId)", nativeQuery = true)
    int addTechnologyInfo(@Param("technology") String technology, @Param("cvId") int cvId);
}
