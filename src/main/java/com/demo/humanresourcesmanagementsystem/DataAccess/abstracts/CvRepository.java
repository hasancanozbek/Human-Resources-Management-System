package com.demo.humanresourcesmanagementsystem.DataAccess.abstracts;

import com.demo.humanresourcesmanagementsystem.Entities.concretes.CV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CvRepository extends JpaRepository<CV, Integer> {

}
