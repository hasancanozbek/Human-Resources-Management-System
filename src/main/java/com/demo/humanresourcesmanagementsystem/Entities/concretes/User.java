package com.demo.humanresourcesmanagementsystem.Entities.concretes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity

@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @NotBlank
    @Email
    @Column(name = "email")
    private String email;

    @NotNull
    @NotBlank
    @Column(name = "password")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

}
