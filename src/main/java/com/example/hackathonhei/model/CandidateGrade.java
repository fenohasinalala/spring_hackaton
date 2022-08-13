package com.example.hackathonhei.model;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CandidateGrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCandidateGrade;

    @OneToOne
    private Candidate candidate;

    @OneToOne
    private Test test;

    @Column
    private Float grade;
}
