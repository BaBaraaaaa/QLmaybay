package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Hoadon implements Serializable {
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

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int maHD) {
        MaHD = maHD;
    }

    public Khachhang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }

    public Nhanvien getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(Nhanvien nhanvien) {
        this.nhanvien = nhanvien;
    }

    public LocalDateTime getNgaylap() {
        return Ngaylap;
    }

    public void setNgaylap(LocalDateTime ngaylap) {
        Ngaylap = ngaylap;
    }

    public int getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(int thanhtien) {
        Thanhtien = thanhtien;
    }
}