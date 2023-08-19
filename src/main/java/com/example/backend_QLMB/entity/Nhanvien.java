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
}