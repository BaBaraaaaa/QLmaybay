package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Hoadon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MaHD;

    @ManyToOne
    @JoinColumn(name = "MaKH", referencedColumnName = "MaKH", foreignKey = @ForeignKey(name = "FK_HOADON_KHACHHANG"))
    private Khachhang khachhang;

    @ManyToOne
    @JoinColumn(name = "MaNV", referencedColumnName = "MaNV", foreignKey = @ForeignKey(name = "FK_HOADON_NHANVIEN"))
    private Nhanvien nhanvien;

    @Column(nullable = false)
    private LocalDateTime Ngaylap;
    @Column(name = "Thanhtien", nullable = false)
    private int Thanhtien;

    // Constructors, getters, setters
}