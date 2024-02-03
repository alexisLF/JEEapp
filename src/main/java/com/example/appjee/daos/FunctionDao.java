package com.example.appjee.daos;

import com.example.appjee.entities.Function;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FunctionDao extends JpaRepository<Function, Long> {
}
