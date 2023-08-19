package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Maybay")
public class Maybay {
    @Id
    @Column(name = "MaMB")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int maMB;
    @Column(name = "TenMB", nullable = false)
    private String tenMB;
    @Column(name = "Tongsoghe", nullable = false)
    private int tongsoghe;

    // Constructors, getters, setters
}