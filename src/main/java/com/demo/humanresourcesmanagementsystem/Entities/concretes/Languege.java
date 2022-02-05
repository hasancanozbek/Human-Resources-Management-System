package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cv_langueges")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Languege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "cv_id")
    private CV cv;

    @NotBlank
    @NotNull
    @Column(name = "languege")
    private String languege;

    @NotNull
    @NotBlank
    @DecimalMin(value = "1")
    @DecimalMax(value = "5")
    @Column(name = "level")
    private int level;

}
