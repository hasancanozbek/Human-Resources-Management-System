package com.demo.humanresourcesmanagementsystem.Entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cv_technologies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "cv"})
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @NotBlank
    @Column(name = "technology")
    private String technology;

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private CV cv;

}
