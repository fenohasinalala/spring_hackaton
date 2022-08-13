package com.example.hackathonhei.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Concours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConcours;

    @Column(length = 100)
    private String session;

    @Column
    private Float minAdmission;

    @Column
    private Float minListeAttente;

    @Column
    private Float minMath;
}
