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

    public int getMaVE() {
        return MaVE;
    }

    public void setMaVE(int maVE) {
        MaVE = maVE;
    }

    public Chuyenbay getChuyenbay() {
        return chuyenbay;
    }

    public void setChuyenbay(Chuyenbay chuyenbay) {
        this.chuyenbay = chuyenbay;
    }

    public Khachhang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }

    public Hoadon getHoadon() {
        return hoadon;
    }

    public void setHoadon(Hoadon hoadon) {
        this.hoadon = hoadon;
    }

    public String getHangve() {
        return Hangve;
    }

    public void setHangve(String hangve) {
        Hangve = hangve;
    }

    public String getLoaive() {
        return Loaive;
    }

    public void setLoaive(String loaive) {
        Loaive = loaive;
    }

    public int getSohe() {
        return Sohe;
    }

    public void setSohe(int sohe) {
        Sohe = sohe;
    }

    public String getTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        Tinhtrang = tinhtrang;
    }
}