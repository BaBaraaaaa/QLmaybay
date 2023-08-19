package com.example.backend_QLMB.Service;

import com.example.backend_QLMB.entity.Nhanvien;

import java.util.List;

public interface INhanVienService {
    public List<Nhanvien> getNhanvienList();
    public Nhanvien getNhanvienById(int id);
    public void createNhanvien();
    public void updateNhanvien();
    public void deleteNhanvien();

}
