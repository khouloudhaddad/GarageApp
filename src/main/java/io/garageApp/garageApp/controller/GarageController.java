package io.garageApp.garageApp.controller;

import io.garageApp.garageApp.model.Car;
import io.garageApp.garageApp.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GarageController {

    @Autowired
    private GarageService garageService;
    
    @RequestMapping("/cars")
    public List<Car> cars(){
        return garageService.getCars();
    }
}
