package com.newtonn.clgms.repo;

import com.newtonn.clgms.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Short> {
    Admin findByAdminId(String adminId);
}
