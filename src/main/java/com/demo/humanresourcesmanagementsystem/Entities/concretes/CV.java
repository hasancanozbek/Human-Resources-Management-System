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

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Education> educations;

    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Work> works;

    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Languege> langueges;

    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List<Technology> technologies;

    @Column(name = "github")
    private String github;

    @Column(name = "linkedin")
    private String linkedin;

    @Column(name = "cover_letter")
    private String coverLetter;

    @Column(name = "photo")
    private String photo;

}
