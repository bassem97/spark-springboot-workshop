package com.spark.springbootworkshop.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity @Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String email;


    @Enumerated(EnumType.STRING)
    private GENDER gender;

    @ManyToOne()
    @JoinColumn(name = "idClassroom")
    @JsonIgnoreProperties({"students"})
    Classroom classroom;




}
