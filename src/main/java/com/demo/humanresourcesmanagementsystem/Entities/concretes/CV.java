package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cvs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CV {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToMany
    @JoinColumn(name = "education_id", referencedColumnName = "id")
    private List<Education> education;

    @ManyToMany
    @JoinColumn(name = "work_id", referencedColumnName = "id")
    private List<Work> work;

    @ManyToMany
    @JoinColumn(name = "languege_id", referencedColumnName = "id")
    private List<Languege> languege;

    @ManyToMany
    @JoinColumn(name = "technology_id", referencedColumnName = "id")
    private List<Technology> technology;

    @Column(name = "github")
    private String github;

    @Column(name = "linkedin")
    private String linkedin;

    @Column(name = "cover_letter")
    private String coverLetter;

    @Column(name = "photo")
    private String photo;

    @OneToOne(mappedBy = "cv")
    private Employee employee;
}
