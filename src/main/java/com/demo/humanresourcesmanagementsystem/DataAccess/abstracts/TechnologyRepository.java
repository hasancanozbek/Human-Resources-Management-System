package com.demo.humanresourcesmanagementsystem.DataAccess.abstracts;

import com.demo.humanresourcesmanagementsystem.Entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {
}
