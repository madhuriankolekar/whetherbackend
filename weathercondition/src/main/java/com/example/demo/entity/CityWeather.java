package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "city_weather")
public class CityWeather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cityName;
    private double currentTemperature;
    private String weatherCondition;
    private double highTemperature;
    private double lowTemperature;

    @Lob
    private String forecast; // JSON string for the 3-day forecast

    public CityWeather() {
    }

    public CityWeather(Long id, String cityName, double currentTemperature, String weatherCondition,
                       double highTemperature, double lowTemperature, String forecast) {
        this.id = id;
        this.cityName = cityName;
        this.currentTemperature = currentTemperature;
        this.weatherCondition = weatherCondition;
        this.highTemperature = highTemperature;
        this.lowTemperature = lowTemperature;
        this.forecast = forecast;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public double getHighTemperature() {
        return highTemperature;
    }

    public void setHighTemperature(double highTemperature) {
        this.highTemperature = highTemperature;
    }

    public double getLowTemperature() {
        return lowTemperature;
    }

    public void setLowTemperature(double lowTemperature) {
        this.lowTemperature = lowTemperature;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }
}
