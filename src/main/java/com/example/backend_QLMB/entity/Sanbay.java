package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Sanbay")
public class Sanbay implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MaSB;
    @Column(name = "TenSB", nullable = false)
    private String TenSB;
    @Column(name = "TinhBay", nullable = false)
    private String TinhBay;

    // Constructors, getters, setters

    public int getMaSB() {
        return MaSB;
    }

    public void setMaSB(int maSB) {
        MaSB = maSB;
    }

    public String getTenSB() {
        return TenSB;
    }

    public void setTenSB(String tenSB) {
        TenSB = tenSB;
    }

    public String getTinhBay() {
        return TinhBay;
    }

    public void setTinhBay(String tinhBay) {
        TinhBay = tinhBay;
    }
}