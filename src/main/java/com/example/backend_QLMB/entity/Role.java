package com.example.backend_QLMB.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "`Role`")
public class Role implements Serializable {
    @Id
    @Column(name = "RoleID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RoleID;

    @Column(name = "roleName",unique = true,nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleEnum roleName;

    // Constructors, getters, setters

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int roleID) {
        RoleID = roleID;
    }

    public RoleEnum getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleEnum roleName) {
        this.roleName = roleName;
    }

    public Role() {
    }

    public Role(int roleID, RoleEnum roleName) {
        RoleID = roleID;
        this.roleName = roleName;
    }
}