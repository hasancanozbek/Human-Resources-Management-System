package com.demo.humanresourcesmanagementsystem.DataAccess.abstracts;

import com.demo.humanresourcesmanagementsystem.Entities.concretes.Languege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface LanguegeRepository extends JpaRepository<Languege, Integer> {

    @Transactional
    @Modifying
    @Query(value = "insert into cv_langueges (cv_id, languege , level) values (" +
            ":cvId, :languege, :level)", nativeQuery = true)
    int addLanguegeInfo(@Param("cvId") int cvId, @Param("languege") String languege, @Param("level") int level);
}
