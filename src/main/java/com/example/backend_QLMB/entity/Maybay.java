package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Maybay")
public class Maybay implements Serializable {
    @Id
    @Column(name = "MaMB")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int maMB;
    @Column(name = "TenMB", nullable = false)
    private String tenMB;
    @Column(name = "Tongsoghe", nullable = false)
    private int tongsoghe;

    // Constructors, getters, setters

    public int getMaMB() {
        return maMB;
    }

    public void setMaMB(int maMB) {
        this.maMB = maMB;
    }

    public String getTenMB() {
        return tenMB;
    }

    public void setTenMB(String tenMB) {
        this.tenMB = tenMB;
    }

    public int getTongsoghe() {
        return tongsoghe;
    }

    public void setTongsoghe(int tongsoghe) {
        this.tongsoghe = tongsoghe;
    }
}