package io.garageApp.garageApp.service;

import io.garageApp.garageApp.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {

    static private ArrayList<Car> cars = new ArrayList<Car>(Arrays.asList(
            new Car(1, "Laguna", "Renault", 2004, Car.Color.RED),
            new Car(2, "C4", "Peugeot", 1998, Car.Color.BLUE),
            new Car(3, "5008", "Citroen", 2008, Car.Color.YELLOW),
            new Car(4, "Polo6", "Volkswagen", 2008, Car.Color.GREY)
    ));

    public List<Car> getCars(){
        return cars;
    }

    public Car getCarById(long id) {
        return cars.stream().filter(car -> car.getId() == id).findFirst().orElse(null);
    }

    public void removeCar(long id) {
        cars.removeIf(car-> car.getId() == id);
    }

    public void createCar(Car car) {
        cars.add(car);
    }

    public void editCar(Car car, long id) {
        cars.forEach(
        carItem-> {
            if(carItem.getId() == id){
                cars.set(cars.indexOf(carItem), car);
            }
        });
    }
}
