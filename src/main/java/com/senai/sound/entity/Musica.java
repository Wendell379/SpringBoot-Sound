package com.senai.sound.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Musica {

    @Id
    private int idartista;
    private int id;
    private String nomemusica;
    private genero genero;
}
