package com.example.appjee.services;

import com.example.appjee.entities.Function;

import java.util.List;
import java.util.Optional;

public interface IFunctionService {
    Function AddFunction(Function function);
    List<Function> findAll();
    Optional<Function> findById(Long functionId);
}
