/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao;

import car.hire.dao.custom.impl.CarDaoImpl;
import car.hire.dao.custom.impl.CustomerDaoImpl;
import car.hire.dao.custom.impl.RentDaoImpl;

/**
 *
 * @author ASS if
 */
public class DaoFactory {
    
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }

        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type) {
        switch (type) {
            case CAR:
                return new CarDaoImpl();
            case CUSTOMER:
                return new CustomerDaoImpl();
            case RENT:
                return new RentDaoImpl();
            
            default:
                return null;
        }
    }

    public enum DaoTypes {
        CAR, CUSTOMER, RENT;
}
}
