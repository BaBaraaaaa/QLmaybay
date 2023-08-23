package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Khachhang")
public class Khachhang implements Serializable {
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

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int maKH) {
        MaKH = maKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String tenKH) {
        TenKH = tenKH;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSove() {
        return Sove;
    }

    public void setSove(String sove) {
        Sove = sove;
    }
}