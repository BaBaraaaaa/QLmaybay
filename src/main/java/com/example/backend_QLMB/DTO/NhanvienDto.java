package com.example.backend_QLMB.DTO;

import com.example.backend_QLMB.entity.Role;

import java.time.LocalDateTime;

public class NhanvienDto {
    private int id;
    private String tenNV;
    private  String email;
    private String username;
    private String password;
    private String avatarImg;
    private  String Diachi;
    private  String sdt;
    private LocalDateTime Ngaysinh;
    private LocalDateTime Ngaytao;
    private String Gioitinh;
    private int role;

//Getter Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAvatarImg(String avatarImg) {
        this.avatarImg = avatarImg;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setNgaysinh(LocalDateTime ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public void setNgaytao(LocalDateTime ngaytao) {
        Ngaytao = ngaytao;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public void setRole(int role) {
        this.role = role;
    }

    //Contrustor

    public NhanvienDto(int id, String tenNV, String email, String username,
                        String avatarImg, String diachi,
                       String sdt, LocalDateTime ngaysinh,
                       LocalDateTime ngaytao,
                       String gioitinh, int role) {
        this.id = id;
        this.tenNV = tenNV;
        this.email = email;
        this.username = username;
        this.avatarImg = avatarImg;
        Diachi = diachi;
        this.sdt = sdt;
        Ngaysinh = ngaysinh;
        Ngaytao = ngaytao;
        Gioitinh = gioitinh;
        this.role = role;
    }

    public NhanvienDto() {
    }
}
