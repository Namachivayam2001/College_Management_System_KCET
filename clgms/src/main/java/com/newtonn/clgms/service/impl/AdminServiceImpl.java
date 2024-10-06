package com.newtonn.clgms.service.impl;

import com.newtonn.clgms.dto.AdminDto;
import com.newtonn.clgms.mapper.AdminMapper;
import com.newtonn.clgms.model.Admin;
import com.newtonn.clgms.repo.AdminRepo;
import com.newtonn.clgms.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdminServiceImpl implements AdminService {

    private AdminRepo adminRepo;

    @Override
    public AdminDto getAdmin(String adminId) throws UsernameNotFoundException {

        Admin recivedAdmin = adminRepo.findByAdminId(adminId);
        if(recivedAdmin == null){
            System.out.println("Admin not found");
            throw new UsernameNotFoundException("Admin not found");
        }

        return AdminMapper.mapToAdminDto(recivedAdmin);
    }
}
