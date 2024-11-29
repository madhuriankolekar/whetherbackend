package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CityWeather;

public interface CityWeatherRepository extends JpaRepository<CityWeather, Long> {
    List<CityWeather> findByCityNameContainingIgnoreCase(String cityName);
}
