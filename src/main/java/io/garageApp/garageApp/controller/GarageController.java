package io.garageApp.garageApp.controller;

import io.garageApp.garageApp.model.Car;
import io.garageApp.garageApp.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GarageController {

    @Autowired
    private GarageService garageService;
    
    @RequestMapping("/cars")
    public List<Car> cars(){
        return garageService.getCars();
    }
    
    @RequestMapping("/car/{id}")
    public Car getCar(@PathVariable long id){
        return garageService.getCarById(id);
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/cars")
    public void addCar(@RequestBody Car car)
    {
        garageService.createCar(car);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value="/car/{id}")
    public void updateCar(@RequestBody Car car, @PathVariable long id){
        garageService.editCar(car, id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/car/{id}")
    public void deleteCar(@PathVariable long id){
        garageService.removeCar(id);
    }
}
