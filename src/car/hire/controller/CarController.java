/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.controller;

import car.hire.dto.CarDto;
import car.hire.service.ServiceFactory;
import car.hire.service.custom.CarService;
import java.util.ArrayList;

/**
 *
 * @author ASS if
 */
public class CarController {
    CarService carService = (CarService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CAR);
    
    public String saveCar(CarDto carDto) throws Exception {
        return carService.addCar(carDto);
    }

    public ArrayList<CarDto> getAllCars() throws Exception {
        return carService.getAllCars();
    }

    public String updateCar(CarDto carDto) throws Exception {
        return carService.updateCar(carDto);
                
    }

    public String deleteCar(String carId) throws Exception {
        return carService.deleteCar(carId);
    }

    public CarDto getCar(String carId) throws Exception {
        return carService.getCar(carId);
    }
}

