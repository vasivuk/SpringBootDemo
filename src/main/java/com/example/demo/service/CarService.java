package com.example.demo.service;

import com.example.demo.domain.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Car getCarById(int id) throws Exception {
        Optional<Car> optionalCar = carRepository.findById(id);
        if (!optionalCar.isPresent()) {
            throw new Exception();
        }
        return optionalCar.get();
    }

    public void deleteCarById(int id) {
        carRepository.deleteById(id);
    }

    public Car updateCarById(int id, Car car) throws Exception {
        Car oldCar = getCarById(id);

        oldCar.setManufacturer(car.getManufacturer());
        oldCar.setModel(car.getModel());
        oldCar.setYear(car.getYear());

        Car savedCar = carRepository.save(oldCar);

        return savedCar;
    }
}
