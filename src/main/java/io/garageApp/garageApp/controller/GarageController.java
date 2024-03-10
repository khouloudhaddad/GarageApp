package io.garageApp.garageApp.controller;

import io.garageApp.garageApp.model.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarageController {
    @RequestMapping("/car")
    public Car getCar(){
       Car car = new Car("Laguna", "Renault", 2004, Car.Color.RED);

       return car;
    }
}
