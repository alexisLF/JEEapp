package com.example.appjee.services;

import com.example.appjee.daos.EmployeeDao;
import com.example.appjee.daos.FunctionDao;
import com.example.appjee.entities.Employee;
import com.example.appjee.entities.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FunctionService implements IFunctionService{
    @Autowired
    private FunctionDao repository;

    @Override
    public Function AddFunction(Function function) {
        return repository.save(function);
    }

    @Override
    public List<Function> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Function> findById(Long functionId) {
        return repository.findById(functionId);
    }
}
