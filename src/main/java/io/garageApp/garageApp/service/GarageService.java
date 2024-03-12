package io.garageApp.garageApp.service;

import io.garageApp.garageApp.model.Car;
import io.garageApp.garageApp.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GarageService{

    @Autowired
    private GarageRepository garageRepository;

    public List<Car> getCars(){
        List<Car> cars = new ArrayList<>();
        garageRepository.findAll().forEach(car-> {cars.add(car);});
        return cars;
    }

    public Car getCarById(long id) {
        return garageRepository.findById(id).orElse(null);
    }

    public void removeCar(long id) {
        garageRepository.deleteById(id);
    }

    public void createCar(Car car) {
        garageRepository.save(car);
    }

    public void editCar(Car car, long id) {
        garageRepository.save(car);
    }
}
