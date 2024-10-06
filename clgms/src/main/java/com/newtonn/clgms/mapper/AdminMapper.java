package com.newtonn.clgms.mapper;

import com.newtonn.clgms.dto.AdminDto;
import com.newtonn.clgms.model.Admin;

public class AdminMapper {
    public static Admin mapToAdmin(AdminDto adminDto){
        return new Admin(
                adminDto.getSNo(),
                adminDto.getAdminId(),
                adminDto.getAdminPassword()
        );
    }
    public static AdminDto mapToAdminDto(Admin admin){
        return new AdminDto(
                admin.getSNo(),
                admin.getAdminId(),
                admin.getAdminPassword()
        );
    }
}
