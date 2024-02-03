package com.example.appjee.daos;

import com.example.appjee.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Long> {
}
