/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.controller;

import car.hire.dto.RentDto;
import car.hire.service.ServiceFactory;
import car.hire.service.custom.RentService;
import java.util.ArrayList;

/**
 *
 * @author ASS if
 */
public class RentController {
     RentService rentService =  (RentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RENT);
    
    public String saveRent(RentDto rentDto) throws Exception {
        return rentService.saveRent(rentDto);
    }

    public ArrayList<RentDto> getAllRents() throws Exception {
        return rentService.getAllRents();
    }

    public String updateRent(RentDto rentDto) throws Exception {
        return rentService.updateRent(rentDto);           
    }

    public RentDto getRent(String rentId) throws Exception {
        return rentService.getRent(rentId);
    }
}


