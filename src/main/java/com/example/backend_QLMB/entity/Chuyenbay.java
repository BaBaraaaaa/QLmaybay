package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Chuyenbay")
public class Chuyenbay implements Serializable {
    @Id
    @Column(name = "Machuyenbay")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  int id;
    @Column(name = "MaTuyen",nullable = false)
    private  int MaTuyen;





}
