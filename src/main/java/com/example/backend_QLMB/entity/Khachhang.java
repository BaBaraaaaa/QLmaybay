package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Khachhang")
public class Khachhang {
    @Id
    @Column(name = "MaKH")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int MaKH;
    @Column(name = "TenKH",nullable = false)
    private String TenKH;
    @Column(name = "Diachi",nullable = false)
    private String Diachi;
    @Column(name = "CMND", nullable = false)
    private String CMND;
    @Column(name = "Sove", nullable = false)
    private String Sove;

    // Constructors, getters, setters
}