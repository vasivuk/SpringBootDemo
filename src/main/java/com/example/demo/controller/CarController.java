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
    public Car getCarById(@PathVariable("id") int id) throws Exception{
        return carService.getCarById(id);
    }

    //Update
    //Mozemo id da posaljemo u query parametru, a mozemo i u request body
    //Sa put se ocekuje da se proslede sve nove vrednosti, to jest novi objekat
    //Sa patch se menja jedan atribut
    @PutMapping("/api/car/{id}")
    public Car updateCarById(@PathVariable("id") int id, @RequestBody Car car) throws Exception{
        return carService.updateCarById(id, car);
    }


    @DeleteMapping("/api/car/{id}")
    public void deleteCarById(@PathVariable("id") int id) {
        carService.deleteCarById(id);
    }
}
