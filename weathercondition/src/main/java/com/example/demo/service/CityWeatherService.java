package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CityWeather;
import com.example.demo.repository.CityWeatherRepository;

@Service
public class CityWeatherService {
    @Autowired
    private CityWeatherRepository repository;

    public List<CityWeather> getAllCities() {
        return repository.findAll();
    }

    public CityWeather addCityWeather(CityWeather cityWeather) {
        return repository.save(cityWeather);
    }

    public void deleteCityWeather(Long id) {
        repository.deleteById(id);
    }

    public List<CityWeather> searchCity(String cityName) {
        return repository.findByCityNameContainingIgnoreCase(cityName);
    }
}
