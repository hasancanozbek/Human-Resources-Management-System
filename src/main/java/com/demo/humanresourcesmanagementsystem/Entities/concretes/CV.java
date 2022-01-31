package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "education_id", referencedColumnName = "id")
    private Education education;

    @ManyToOne
    @JoinColumn(name = "work_id", referencedColumnName = "id")
    private Work work;

    @ManyToOne
    @JoinColumn(name = "languege_id", referencedColumnName = "id")
    private Languege languege;

    @ManyToOne
    @JoinColumn(name = "technology_id", referencedColumnName = "id")
    private Technology technology;

    @Column(name = "github")
    private String github;

    @Column(name = "linkedin")
    private String linkedin;

    @Column(name = "cover_letter")
    private String coverLetter;

    @Column(name = "photo")
    private String photo;

    @JsonIgnore
    @OneToOne(mappedBy = "cv")
    private Employee employee;
}
