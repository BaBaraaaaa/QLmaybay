package com.example.backend_QLMB.Service;

import com.example.backend_QLMB.CreateandUpdateForm.formUpdateNhanvien;
import com.example.backend_QLMB.entity.Nhanvien;
import com.example.backend_QLMB.CreateandUpdateForm.formCrateNhanvien;
import java.util.List;

public interface INhanVienService {
    public List<Nhanvien> getNhanvienList();
    public Nhanvien getNhanvienById(int id);
    public void createNhanvien(formCrateNhanvien form);
    public void updateNhanvien(int id,formUpdateNhanvien form);
    public void deleteNhanvien(int id);

}
