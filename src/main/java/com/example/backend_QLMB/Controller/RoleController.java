package com.example.backend_QLMB.Controller;

import com.example.backend_QLMB.DTO.RoleDto;
import com.example.backend_QLMB.Service.IRoleService;
import com.example.backend_QLMB.entity.Role;
import com.example.backend_QLMB.entity.RoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/Role")
public class RoleController {
    @Autowired
    private IRoleService iRoleService;
    @GetMapping
    public ResponseEntity<?> getAllListRole()
    {
        List<Role> roles = iRoleService.getListRole();
        List<RoleDto> roleDtos = new ArrayList<>();
        for (Role role : roles)
        {
            RoleDto roleDto = new RoleDto();
            roleDto.setId(role.getRoleID());
            roleDto.setName(role.getRoleName().name().toString());
            roleDtos.add(roleDto);
        }
        return new ResponseEntity<>(roleDtos, HttpStatus.OK);
    }
}
