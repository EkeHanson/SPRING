package com.dailyCodeBuffer.springdatajpatutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Locale;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {
    @Id
    @SequenceGenerator(
            name = "teacher_sequence",
            sequenceName = "teacher_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
         strategy =  GenerationType.SEQUENCE,
         generator = "teacher_sequence"
    )
    private long teacherId;
    private String firstName;
    private String lastName;

    @OneToMany(
       cascade =  CascadeType.ALL
    )
    @JoinColumn(
       name = "teacher_id",
       referencedColumnName = "teacherId"
    )
    private List <Course> courses;

}
