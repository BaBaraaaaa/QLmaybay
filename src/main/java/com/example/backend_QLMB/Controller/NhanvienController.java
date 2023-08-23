package com.example.backend_QLMB.Controller;

import com.example.backend_QLMB.CreateandUpdateForm.formCrateNhanvien;
import com.example.backend_QLMB.CreateandUpdateForm.formUpdateNhanvien;
import com.example.backend_QLMB.DTO.NhanvienDto;
import com.example.backend_QLMB.Service.INhanVienService;
import com.example.backend_QLMB.Service.IRoleService;
import com.example.backend_QLMB.entity.Nhanvien;

import com.example.backend_QLMB.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/Nhanvien")
public class NhanvienController {
    @Autowired
    private INhanVienService iNhanVienService;
    @Autowired
    private IRoleService iRoleService;

    @GetMapping
    public ResponseEntity<?> getNhanVienList()
    {
        //covert Entity from Dto
        List<Nhanvien> nhanviens = iNhanVienService.getNhanvienList();
        List<NhanvienDto> nhanvienDtos = new ArrayList<>();
        for (Nhanvien nhanvien : nhanviens)
        {
            Role role =  iRoleService.getRoleById(nhanvien.getRole().getRoleID());
            NhanvienDto nhanvienDto = new NhanvienDto(nhanvien.getMaNV(),
                    nhanvien.getTenNV(),nhanvien.getEmail(),
                    nhanvien.getUsename(),nhanvien.getPassword(),nhanvien.getAvatarImg(),
                    nhanvien.getDiachi(),nhanvien.getSDT()
                    ,nhanvien.getNgaysinh(),nhanvien.getNgaytao(),
                    nhanvien.getGioitinh(),role.getRoleName().name().toString()

                    );
//            NhanvienDto nhanvienDto = new NhanvienDto();
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
        System.out.println(nhanvienDtos);
        return new ResponseEntity<>(nhanvienDtos, HttpStatus.OK);

    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getNhanvienById(@PathVariable int id)
    {
        Nhanvien nhanvien = iNhanVienService.getNhanvienById(id);
        return new ResponseEntity<Nhanvien>(nhanvien,HttpStatus.OK);
    }
    @PostMapping
    public  ResponseEntity<?> createNhanvienbyForm(@RequestBody formCrateNhanvien form )
    {
        iNhanVienService.createNhanvien(form);
        return new ResponseEntity<String>("create sussessfully",HttpStatus.OK);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<?> updateNhanvienbyId(@PathVariable int id, @RequestBody formUpdateNhanvien form)
    {
        iNhanVienService.updateNhanvien(id,form);
        return new ResponseEntity<>("Update Sussessfully",HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteNhanvienByID(@PathVariable int id)
    {
        iNhanVienService.deleteNhanvien(id);
        return new ResponseEntity<>("Delete Sussessfully",HttpStatus.OK);
    }

}
