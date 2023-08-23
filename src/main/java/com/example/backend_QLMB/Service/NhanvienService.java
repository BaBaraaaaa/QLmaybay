package com.example.backend_QLMB.Service;

import com.example.backend_QLMB.CreateandUpdateForm.formCrateNhanvien;
import com.example.backend_QLMB.CreateandUpdateForm.formUpdateNhanvien;
import com.example.backend_QLMB.entity.Nhanvien;
import com.example.backend_QLMB.entity.Role;
import com.example.backend_QLMB.repository.INhanVienRepository;
import com.example.backend_QLMB.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhanvienService implements INhanVienService {
    @Autowired
    private    INhanVienRepository iNhanVienRepository;
    @Autowired
    private IRoleRepository roleRepository;
    @Override
    public List<Nhanvien> getNhanvienList() {

        return iNhanVienRepository.findAll();
    }

    @Override
    public Nhanvien getNhanvienById(int id) {
        return iNhanVienRepository.findById(id).get();
    }

    @Override
    public void createNhanvien(formCrateNhanvien form) {
        Role role = (Role) roleRepository.getReferenceById(form.getRoleId());
        Nhanvien  nhanvien = new Nhanvien();
        nhanvien.setTenNV(form.getTenNV());
        nhanvien.setEmail(form.getEmail());
        nhanvien.setUsename(form.getUsername());
        nhanvien.setPassword(form.getPassword());
        nhanvien.setAvatarImg(form.getAvatarImg());
        nhanvien.setDiachi(form.getDiachi());
        nhanvien.setSDT(form.getSdt());
        nhanvien.setNgaysinh(form.getNgaysinh());
        nhanvien.setNgaytao(form.getNgaytao());
        nhanvien.setGioitinh(form.getGioitinh());
        nhanvien.setRole(role);
        iNhanVienRepository.save(nhanvien);
    }

    @Override
    public void updateNhanvien(int id, formUpdateNhanvien form) {

        Nhanvien  nhanvien = iNhanVienRepository.findById(id).get();
        nhanvien.setTenNV(form.getTenNV());
        nhanvien.setEmail(form.getEmail());
        nhanvien.setUsename(form.getUsername());
        nhanvien.setPassword(form.getPassword());
        nhanvien.setAvatarImg(form.getAvatarImg());
        nhanvien.setDiachi(form.getDiachi());
        nhanvien.setSDT(form.getSdt());
        nhanvien.setNgaysinh(form.getNgaysinh());
        nhanvien.setGioitinh(form.getGioitinh());
        iNhanVienRepository.save(nhanvien);

    }

    @Override
    public void deleteNhanvien(int id) {
        Nhanvien nhanvien = iNhanVienRepository.findById(id).get();

    iNhanVienRepository.delete(nhanvien);
    }
}
