package com.example.demo.controller;

import com.example.demo.domain.Car;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping("/api/car")
    public Car createCar(@RequestBody Car newCar) {
        return carService.createCar(newCar);
    }

    @GetMapping("/api/car")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/api/car/{id}")
    public Car getCarById(@PathVariable("id") int id) {
        return carService.getCarById(id);
    }
}
