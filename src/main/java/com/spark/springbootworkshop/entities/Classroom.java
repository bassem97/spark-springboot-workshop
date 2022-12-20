package com.spark.springbootworkshop.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClassroom;

    @Column(unique = true)
    private String name;

    @OneToMany()
    @JoinColumn(name = "idClassroom")
    List<Student> students ;
}
