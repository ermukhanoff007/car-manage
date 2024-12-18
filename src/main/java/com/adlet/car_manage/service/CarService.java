package com.adlet.car_manage.service;


import com.adlet.car_manage.model.Car;
import com.adlet.car_manage.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).orElseThrow(() -> new RuntimeException("Car not found"));
    }

    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Long id, Car carDetails) {
        Car car = getCarById(id);
        car.setName(carDetails.getName());
        car.setBrand(carDetails.getBrand());
        car.setYear(carDetails.getCarYear());
        car.setOwnerEmail(carDetails.getOwnerEmail());
        return carRepository.save(car);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
