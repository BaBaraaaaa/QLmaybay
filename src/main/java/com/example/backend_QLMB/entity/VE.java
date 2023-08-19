package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "VE")
public class VE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MaVE;

    @ManyToOne
    @JoinColumn(name = "Machuyenbay", referencedColumnName = "Machuyenbay", foreignKey = @ForeignKey(name = "FK_VE_CHUYENBAY"))
    private Chuyenbay chuyenbay;

    @ManyToOne
    @JoinColumn(name = "MaKH", referencedColumnName = "MaKH", foreignKey = @ForeignKey(name = "FK_VE_KHACHHANG"))
    private Khachhang khachhang;

    @ManyToOne
    @JoinColumn(name = "MaHD", referencedColumnName = "MaHD", foreignKey = @ForeignKey(name = "FK_VE_HOADON"))
    private Hoadon hoadon;
    @Column(name = "Hangve", nullable = false)
    private String Hangve;
    @Column(name = "Loaive", nullable = false)
    private String Loaive;
    @Column(name = "Sohe", nullable = false)
    private int Sohe;
    @Column(name = "Tinhtrang", nullable = false)
    private String Tinhtrang;

    // Constructors, getters, setters
}