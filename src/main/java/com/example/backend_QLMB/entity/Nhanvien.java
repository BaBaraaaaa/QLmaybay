package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Nhanvien")
public class Nhanvien {
    @Id
    @Column(name = "MaNV", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MaNV;
    @Column(name = "TenNV", nullable = false)
    private String TenNV;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "usename", nullable = false)
    private String usename;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "avatarImg", nullable = false)
    private String avatarImg;
    @Column(name = "Diachi", nullable = false)
    private String Diachi;
    @Column(name = "SDT", nullable = false)
    private String SDT;
    @Column(name = "Ngaysinh", nullable = false)
    private LocalDateTime Ngaysinh;
    @Column(name = "Ngaytao", nullable = false)
    private LocalDateTime Ngaytao;
    @Column(name = "Gioitinh", nullable = false)
    private String Gioitinh;

    @ManyToOne
    @JoinColumn(name = "RoleID", referencedColumnName = "RoleID", foreignKey = @ForeignKey(name = "FK_NHANVIEN_ROLE"))
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

    public LocalDateTime getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(LocalDateTime ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public LocalDateTime getNgaytao() {
        return Ngaytao;
    }

    public void setNgaytao(LocalDateTime ngaytao) {
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
}