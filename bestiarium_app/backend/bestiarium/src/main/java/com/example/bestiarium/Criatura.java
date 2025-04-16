package com.example.bestiarium;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "Criatura")

public class Criatura {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_criatura;

    @Column (nullable = false, length = 50)
    private String nome_criatura;

    @Column (nullable = false, length = 20)
    private String especie_criatura;

    @Column (nullable = false, length = 50)
    private String criatura_habitat;

    @Column (nullable = false, length = 100)
    private String criatura_poderes;

}
