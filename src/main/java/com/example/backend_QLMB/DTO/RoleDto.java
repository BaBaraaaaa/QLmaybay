package com.example.backend_QLMB.DTO;

public class RoleDto {
    private int RoleID;

    public int getId() {
        return RoleID;
    }

    public void setId(int id) {
        this.RoleID = id;
    }

    public String getName() {
        return role_name;
    }

    public void setName(String name) {
        this.role_name = name;
    }

    private String role_name;
    public RoleDto(int id, String name) {
        this.RoleID = id;
        this.role_name = name;
    }

    public RoleDto() {
    }
}
