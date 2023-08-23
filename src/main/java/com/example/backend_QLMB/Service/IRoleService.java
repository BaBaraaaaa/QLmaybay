package com.example.backend_QLMB.Service;

import com.example.backend_QLMB.entity.Role;

import java.util.List;

public interface IRoleService {
    public List<Role> getListRole();
    public Role getRoleById(int id);
}
