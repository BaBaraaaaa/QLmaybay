package com.example.backend_QLMB.Service;

import com.example.backend_QLMB.entity.Role;
import com.example.backend_QLMB.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleService implements IRoleService {
    @Autowired
    IRoleRepository roleRepository;
    @Override
    public List<Role> getListRole() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(int id) {
        return roleRepository.findById(id).get();
    }
}
