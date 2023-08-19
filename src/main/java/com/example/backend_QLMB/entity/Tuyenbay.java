package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Tuyenbay")
public class Tuyenbay {
    @Id
    @Column(name = "MaTuyen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MaTuyen;

    @ManyToOne
    @JoinColumn(name = "MaSB", referencedColumnName = "MaSB", foreignKey = @ForeignKey(name = "FK_TUYENBAY_SANBAY"))
    private Sanbay sanbay;
    @Column(name = "Sanbaydi", nullable = false)
    private String Sanbaydi;
    @Column(name = "Sanbayden", nullable = false)
    private String Sanbayden;

    // Constructors, getters, setters
}