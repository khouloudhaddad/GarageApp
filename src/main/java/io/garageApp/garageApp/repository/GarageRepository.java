package io.garageApp.garageApp.repository;

import io.garageApp.garageApp.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car, Long> {
}
