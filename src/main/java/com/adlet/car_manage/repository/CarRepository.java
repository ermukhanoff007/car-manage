package com.adlet.car_manage.repository;

import com.adlet.car_manage.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}

