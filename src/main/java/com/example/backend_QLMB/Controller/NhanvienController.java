package com.example.backend_QLMB.Controller;

import com.example.backend_QLMB.DTO.NhanvienDto;
import com.example.backend_QLMB.Service.INhanVienService;
import com.example.backend_QLMB.entity.Nhanvien;
import com.example.backend_QLMB.repository.INhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/Nhanvien")
public class NhanvienController {
    @Autowired
    private INhanVienService iNhanVienService;

    @GetMapping
    public ResponseEntity<?> getNhanVienList()
    {
        List<Nhanvien> nhanviens = iNhanVienService.getNhanvienList();
        List<NhanvienDto> nhanvienDtos = new ArrayList<>();
        for (Nhanvien nhanvien : nhanviens)
        {
            NhanvienDto nhanvienDto = new NhanvienDto(nhanvien.getMaNV(),
                    nhanvien.getTenNV(),nhanvien.getEmail(),
                    nhanvien.getUsename(),nhanvien.getAvatarImg(),
                    nhanvien.getDiachi(),nhanvien.getSDT()
                    ,nhanvien.getNgaysinh(),nhanvien.getNgaytao(),
                    nhanvien.getGioitinh(),
                    nhanvien.getRole().getRoleID()
                    );
//                nhanvienDto.setId(nhanvien.getMaNV());
//                nhanvienDto.setTenNV(nhanvien.getTenNV());
//                nhanvienDto.setEmail(nhanvien.getEmail());
//                nhanvienDto.setUsername(nhanvien.getUsename());
//                nhanvienDto.setGioitinh(nhanvien.getGioitinh());
//                nhanvienDto.setSdt(nhanvien.getSDT());
//                nhanvienDto.setNgaysinh(nhanvien.getNgaysinh());
//                nhanvienDto.setAvatarImg(nhanvien.getAvatarImg());
//                nhanvienDto.setNgaysinh(nhanvien.getNgaysinh());
//
            nhanvienDtos.add(nhanvienDto);

        }

        return new ResponseEntity<>(nhanvienDtos, HttpStatus.OK);

    }

}
