package com.example.backend_QLMB.DTO;



import com.example.backend_QLMB.entity.Role;

import java.util.Date;


public class NhanvienDto {
    private int id;
    private String tenNV;
    private  String email;
    private String username;
    private String password;
    private String avatarImg;
    private  String Diachi;
    private  String sdt;
    private Date Ngaysinh;
    private Date Ngaytao;
    private String Gioitinh;
    private String role;

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

    public void setNgaysinh(Date ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public void setNgaytao(Date ngaytao) {
        Ngaytao = ngaytao;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //Contrustor

    public int getId() {
        return id;
    }

    public String getTenNV() {
        return tenNV;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAvatarImg() {
        return avatarImg;
    }

    public String getDiachi() {
        return Diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public Date getNgaytao() {
        return Ngaytao;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public String getRole() {
        return role;
    }

    public NhanvienDto(int id, String tenNV, String email, String username,
                       String avatarImg, String diachi,
                       String sdt, Date ngaysinh,
                       Date ngaytao,
                       String gioitinh, String role) {
        this.id = id;
        this.tenNV = tenNV;
        this.email = email;
        this.username = username;
        this.avatarImg = avatarImg;
        this.Diachi = diachi;
        this.sdt = sdt;
        Ngaysinh = ngaysinh;
        Ngaytao = ngaytao;
        Gioitinh = gioitinh;
        this.role = role;
    }

    public NhanvienDto(int id, String tenNV, String email, String username, String password, String avatarImg, String diachi, String sdt, Date ngaysinh, Date ngaytao, String gioitinh, String role) {
        this.id = id;
        this.tenNV = tenNV;
        this.email = email;
        this.username = username;
        this.password = password;
        this.avatarImg = avatarImg;
        Diachi = diachi;
        this.sdt = sdt;
        Ngaysinh = ngaysinh;
        Ngaytao = ngaytao;
        Gioitinh = gioitinh;
        this.role = role;
    }
}
