package com.example.demo.service;

import com.example.demo.domain.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public Car createCar(Car newCar) {
        return carRepository.save(newCar);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCarById(int id) {
        return carRepository.getById(id);
    }
}
