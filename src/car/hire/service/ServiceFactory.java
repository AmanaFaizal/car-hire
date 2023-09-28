/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service;

import car.hire.service.custom.Impl.CarServiceImpl;
import car.hire.service.custom.Impl.CustomerServiceImpl;
import car.hire.service.custom.Impl.RentServiceImpl;

/**
 *
 * @author ASS if
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        
        return serviceFactory;
    }
    
     public SuperService getService(ServiceType type){
    
         switch (type) {
             case CAR:
                 return new CarServiceImpl();
              case CUSTOMER:
                 return new CustomerServiceImpl();
               case RENT:
                 return new RentServiceImpl();
                 
             default:
                return null;
         }
}
     
public enum ServiceType{
     CAR, CUSTOMER, RENT;
}
}
