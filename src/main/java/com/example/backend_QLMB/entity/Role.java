package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Role")
public class Role {
    @Id
    @Column(name = "RoleID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RoleID;

    @Column(name = "roleName",unique = true)
    private String roleName;

    // Constructors, getters, setters

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int roleID) {
        RoleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}