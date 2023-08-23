package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Tuyenbay")
public class Tuyenbay implements Serializable {
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

    public int getMaTuyen() {
        return MaTuyen;
    }

    public void setMaTuyen(int maTuyen) {
        MaTuyen = maTuyen;
    }

    public Sanbay getSanbay() {
        return sanbay;
    }

    public void setSanbay(Sanbay sanbay) {
        this.sanbay = sanbay;
    }

    public String getSanbaydi() {
        return Sanbaydi;
    }

    public void setSanbaydi(String sanbaydi) {
        Sanbaydi = sanbaydi;
    }

    public String getSanbayden() {
        return Sanbayden;
    }

    public void setSanbayden(String sanbayden) {
        Sanbayden = sanbayden;
    }
}