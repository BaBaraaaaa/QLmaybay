package com.example.backend_QLMB.Service;



import com.example.backend_QLMB.entity.Maybay;

import java.util.List;

public interface IMaybayService {
    public List<Maybay> getNhanvienList();
    public Maybay getNhanvienById(int id);
    public void createNhanvien();
    public void updateNhanvien();
    public void deleteNhanvien();
}
