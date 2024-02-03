package com.example.appjee.daos;

import com.example.appjee.entities.City;
import com.example.appjee.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role,Long> {
}
