package com.demo.humanresourcesmanagementsystem.DataAccess.abstracts;

import com.demo.humanresourcesmanagementsystem.Entities.concretes.Languege;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguegeRepository extends JpaRepository<Languege, Integer> {
}
