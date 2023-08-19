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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaTuyen() {
        return MaTuyen;
    }

    public void setMaTuyen(int maTuyen) {
        MaTuyen = maTuyen;
    }
}
