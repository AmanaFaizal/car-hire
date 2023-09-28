/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.service.custom;

import car.hire.dto.RentDto;
import car.hire.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author ASS if
 */
public interface RentService extends SuperService{
    String saveRent(RentDto rentDto) throws Exception;

    String updateRent(RentDto rentDto) throws Exception;

    RentDto getRent(String id) throws Exception;

    ArrayList<RentDto> getAllRents() throws Exception;

}