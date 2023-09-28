/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service.custom.Impl;

import car.hire.dao.DaoFactory;
import car.hire.dao.custom.CarDao;
import car.hire.dao.custom.RentDao;
import car.hire.db.DBConnection;
import car.hire.dto.RentDto;
import car.hire.entity.RentEntity;
import car.hire.service.custom.RentService;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author ASS if
 */
public class RentServiceImpl implements RentService{

    RentDao rentDao = (RentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RENT);

    @Override
    public String saveRent(RentDto dto) throws Exception {
       if (rentDao.add(new RentEntity(dto.getRentId(), 
               dto.getFromDate(), 
               dto.getToDate(), 
               dto.getCarId(), 
               dto.getCustId(), 
               dto.getTotal(),
               dto.getAdvance(),
               dto.getBalance(),
                dto.getIsReturn()))) {
            return "Successfully Saved";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateRent(RentDto dto) throws Exception {
      RentEntity re = new RentEntity(dto.getRentId(),
              dto.getFromDate(), dto.getToDate(), 
              dto.getCarId(), dto.getCustId(),
              dto.getTotal(), dto.getAdvance(), 
              dto.getBalance(), dto.getIsReturn());
        if (rentDao.update(re)) {
            return "Successfully Update";
        } else {
            return "Fail";
        }
    }

    @Override
    public RentDto getRent(String id) throws Exception {
       RentEntity entity = rentDao.get(id);
        return new RentDto(entity.getRentId(), 
                entity.getFromDate(), entity.getToDate(), 
                entity.getCarId(), entity.getCustId(),
                entity.getTotal(), entity.getAdvance(),
                entity.getBalance(), entity.getIsReturn());
    }

    @Override
    public ArrayList<RentDto> getAllRents() throws Exception {
        ArrayList<RentDto> rentDtos = new ArrayList<>();
        ArrayList<RentEntity> rentEntitys = rentDao.getAll();
        
        for (RentEntity entity : rentEntitys) {
            RentDto dto = new RentDto(entity.getRentId(), 
                    entity.getFromDate(), entity.getToDate(),
                    entity.getCarId(), entity.getCustId(), 
                    entity.getTotal(), entity.getAdvance(), 
                    entity.getBalance(), entity.getIsReturn());
           rentDtos.add(dto);
        }
        return rentDtos;
    }
}
