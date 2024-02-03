package com.example.appjee.services;

import com.example.appjee.daos.FunctionDao;
import com.example.appjee.daos.RoleDao;
import com.example.appjee.entities.Function;
import com.example.appjee.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService implements IRoleService{
    @Autowired
    private RoleDao repository;

    @Override
    public Role AddFunction(Role role) {
        return repository.save(role);
    }

    @Override
    public List<Role> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Role> findById(Long roleId) {
        return repository.findById(roleId);
    }
}
