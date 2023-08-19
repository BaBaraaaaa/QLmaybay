package com.example.backend_QLMB.Service;

import com.example.backend_QLMB.entity.Nhanvien;
import com.example.backend_QLMB.repository.INhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhanvienService implements INhanVienService {
    @Autowired
    private    INhanVienRepository iNhanVienRepository;
    @Override
    public List<Nhanvien> getNhanvienList() {

        return iNhanVienRepository.findAll();
    }

    @Override
    public Nhanvien getNhanvienById(int id) {
        return null;
    }

    @Override
    public void createNhanvien() {

    }

    @Override
    public void updateNhanvien() {

    }

    @Override
    public void deleteNhanvien() {

    }
}
