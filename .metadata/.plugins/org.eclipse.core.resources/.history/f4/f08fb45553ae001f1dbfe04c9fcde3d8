package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CityWeather;
import com.example.demo.service.CityWeatherService;

@CrossOrigin(origins = "http://192.168.31.32:3003") // React frontend URL
@RestController
@RequestMapping("/api/weather")
public class CityWeatherController {
    
    @Autowired
    private CityWeatherService service;

    // Get all cities
    @GetMapping
    public List<CityWeather> getAllCities() {
        List<CityWeather> cities = service.getAllCities();
        if (cities.isEmpty()) {
            System.out.println("No cities found in the database.");
        } else {
            System.out.println("Cities found: " + cities);
        }
        return cities;
    }

    // Add a new city weather
    @PostMapping
    public CityWeather addCityWeather(@RequestBody CityWeather cityWeather) {
        return service.addCityWeather(cityWeather);
    }

    // Delete a city
    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Long id) {
        service.deleteCityWeather(id);
    }

    // Search cities by name
    @GetMapping("/search")
    public List<CityWeather> searchCity(@RequestParam String cityName) {
        return service.searchCity(cityName);
    }
}
