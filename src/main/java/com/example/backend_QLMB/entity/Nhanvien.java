package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "Nhanvien")
public class Nhanvien implements Serializable {
    @Id
    @Column(name = "MaNV", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MaNV;
    @Column(name = "TenNV", nullable = false,length = 50)
    private String TenNV;
    @Column(name = "email", nullable = false,length = 50)
    private String email;
    @Column(name = "usename", nullable = false,length = 50)
    private String usename;
    @Column(name = "password", nullable = false,length = 50)
    private String password;
    @Column(name = "avatar_img" ,length = 50)
    private String avatarImg;
    @Column(name = "Diachi", nullable = false,length = 50)
    private String Diachi;
    @Column(name = "SDT", nullable = false,length = 20)
    private String SDT;
    @Column(name = "Ngaysinh", nullable = false)
    private Date Ngaysinh;
    @Column(name = "Ngaytao", nullable = false)
    private Date Ngaytao;
    @Column(name = "Gioitinh", length = 5)
    private String Gioitinh;

    @ManyToOne
    @JoinColumn(name = "RoleID", referencedColumnName = "RoleID",nullable = false)
    private Role role;

    // Constructors, getters, setters

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int maNV) {
        MaNV = maNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatarImg() {
        return avatarImg;
    }

    public void setAvatarImg(String avatarImg) {
        this.avatarImg = avatarImg;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public Date getNgaytao() {
        return Ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        Ngaytao = ngaytao;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Nhanvien(int maNV, String tenNV, String email, String usename, String password, String avatarImg, String diachi,
                    String SDT, Date ngaysinh, Date ngaytao, String gioitinh, Role role) {
        MaNV = maNV;
        TenNV = tenNV;
        this.email = email;
        this.usename = usename;
        this.password = password;
        this.avatarImg = avatarImg;
        Diachi = diachi;
        this.SDT = SDT;
        Ngaysinh = ngaysinh;
        Ngaytao = ngaytao;
        Gioitinh = gioitinh;
        this.role = role;
    }

    public Nhanvien() {
    }
}