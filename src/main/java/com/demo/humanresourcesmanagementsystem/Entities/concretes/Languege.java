package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "langueges")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Languege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "languege")
    private String languege;

    @Column(name = "level")
    private int level;

    @JsonIgnore
    @OneToMany(mappedBy = "languege")
    private List<CV> cv;
}
