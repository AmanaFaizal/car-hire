/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service.custom.Impl;

import car.hire.dao.DaoFactory;
import car.hire.dao.custom.CarDao;
import car.hire.dto.CarDto;
import car.hire.entity.CarEntity;
import car.hire.service.custom.CarService;
import java.util.ArrayList;


/**
 *
 * @author ASS if
 */
public class CarServiceImpl implements CarService {

    CarDao carDao = (CarDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CAR);

    @Override
    public String addCar(CarDto dto) throws Exception {
       if (carDao.add(new CarEntity(dto.getCarId(), 
                dto.getCategoryId(),
                dto.getVehicleNo(),
               dto.getYear(),
               dto.getBrand(),
               dto.getModel(),
                dto.getRent()))) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateCar(CarDto dto) throws Exception {
        CarEntity ce = new CarEntity(dto.getCarId(),
                dto.getCategoryId(), dto.getVehicleNo(),
                dto.getYear(), dto.getBrand(), dto.getModel(),
                dto.getRent());
        
        if (carDao.update(ce)) {
            return "Successfully Update";
        } else {
            return "Fail";
        }
    }
    @Override
    public String deleteCar(String id) throws Exception {
       if(carDao.delete(id)){
            return "Successfully Delete";
        } else {
            return "Fail";
        }
    }
    
    @Override
    public CarDto getCar(String id) throws Exception {
       CarEntity entity = carDao.get(id);
        return new CarDto(entity.getCarId(), 
                entity.getCategoryId(),entity.getVehiclleNo(),entity.getYear(),
                entity.getBrand(), entity.getModel(), entity.getRent());
    }

    @Override
    public ArrayList<CarDto> getAllCars() throws Exception {
       ArrayList<CarDto> carDtos = new ArrayList<>();
        ArrayList<CarEntity> carEntitys = carDao.getAll();
        
        for (CarEntity entity : carEntitys) {
            CarDto dto = new CarDto(entity.getCarId(),
            entity.getCategoryId(),entity.getVehiclleNo(),entity.getYear(),
            entity.getBrand(),entity.getModel(),entity.getRent());
            carDtos.add(dto);
        }
        return carDtos;
    }
    
}