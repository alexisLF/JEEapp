package com.example.appjee.services;

import com.example.appjee.entities.Function;
import com.example.appjee.entities.Role;

import java.util.List;
import java.util.Optional;

public interface IRoleService {
    Role AddFunction(Role role);
    List<Role> findAll();
    Optional<Role> findById(Long roleId);
}
