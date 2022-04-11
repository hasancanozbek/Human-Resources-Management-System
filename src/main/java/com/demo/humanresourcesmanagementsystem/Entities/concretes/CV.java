package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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

    //Todo : Jackson Ignore sorunu düzeltilecek
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @JsonIgnore
    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Education> educations;

    @JsonIgnore
    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Work> works;

    @JsonIgnore
    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Languege> langueges;

    @JsonIgnore
    @OneToMany(mappedBy = "cv", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Technology> technologies;

    @Column(name = "github")
    private String github;

    @Column(name = "linkedin")
    private String linkedin;

    @NotNull
    @NotBlank
    @Column(name = "cover_letter")
    private String coverLetter;

    @Column(name = "photo")
    private String photo;

}
