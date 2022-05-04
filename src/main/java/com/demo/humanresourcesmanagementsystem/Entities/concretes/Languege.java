package com.demo.humanresourcesmanagementsystem.Entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "cv_langueges")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "cv"})
public class Languege {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @ManyToOne
    @JoinColumn(name = "cv_id")
    private CV cv;


    @Column(name = "languege")
    private String languege;


    @Column(name = "level")
    private int level;

}
