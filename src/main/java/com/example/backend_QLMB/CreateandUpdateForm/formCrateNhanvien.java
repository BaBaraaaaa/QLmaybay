package com.example.backend_QLMB.CreateandUpdateForm;

import java.util.Date;

public class formCrateNhanvien {
    private String TenNV;
    private String email;
    private String username;
    private String password;
    private String avatarImg;
    private String Diachi;
    private String sdt;
    private Date Ngaysinh;

    private String gioitinh;
    private int roleId;
    private Date ngaytao;
    //getter and setter

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }
    //construstor

    public formCrateNhanvien() {
    }

    public formCrateNhanvien(String tenNV, String email, String username,
                             String password, String avatarImg, String diachi, String sdt, Date ngaysinh,Date ngaytao,
                             String gioitinh, int roleId) {
        TenNV = tenNV;
        this.email = email;
        this.username = username;
        this.password = password;
        this.avatarImg = avatarImg;
        Diachi = diachi;
        this.sdt = sdt;
        Ngaysinh = ngaysinh;
        this.ngaytao = ngaytao;
        this.gioitinh = gioitinh;
        this.roleId = roleId;
    }
}
