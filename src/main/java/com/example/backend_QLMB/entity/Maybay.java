package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Maybay")
public class Maybay {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int maMB;

    private String tenMB;
    private int tongsoghe;

    // Constructors, getters, setters
}