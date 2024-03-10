package io.garageApp.garageApp.service;

import io.garageApp.garageApp.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {

    static private ArrayList<Car> cars = new ArrayList<Car>(Arrays.asList(
            new Car("Laguna", "Renault", 2004, Car.Color.RED),
            new Car("C4", "Peugeot", 1998, Car.Color.BLUE),
            new Car("5008", "Citroen", 2008, Car.Color.YELLOW),
            new Car("Polo6", "Volkswagen", 2008, Car.Color.GREY)
    ));

    public List<Car> getCars(){
        return cars;
    }
}
