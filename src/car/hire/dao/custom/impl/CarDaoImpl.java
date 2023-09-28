/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao.custom.impl;

import car.hire.dao.CrudUtil;
import car.hire.dao.custom.CarDao;
import car.hire.entity.CarEntity;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author ASS if
 */
public class CarDaoImpl implements CarDao{

    @Override
    public boolean add(CarEntity t) throws Exception {
        
         return CrudUtil.executeUpdate("INSERT INTO Car VALUES(?,?,?,?,?,?,?)",
                 t.getCarId(),
                 t.getCategoryId(),
                 t.getVehiclleNo(),
                 t.getYear(),
                 t.getBrand(),
                 t.getModel(),
                 t.getRent());
    }

    @Override
    public boolean update(CarEntity t) throws Exception {
       
        return CrudUtil.executeUpdate("UPDATE Car SET  model=?, brand=?, vehicle_no=?, year=?, price_per_day=?, category_id=? WHERE car_id = ?",
                 t.getCategoryId(),
                 t.getVehiclleNo(),
                 t.getYear(),
                 t.getBrand(),
                 t.getModel(),
                 t.getRent(),
                 t.getCarId());
    }


    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Car WHERE car_id = ?", id);
    }

    @Override
    public CarEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Car WHERE car_id = ?", id);
        while (rst.next()) {
            CarEntity carEntity = new CarEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getDouble(7));
           return  carEntity;
        }
        return null;
    }


    @Override
    public ArrayList<CarEntity> getAll() throws Exception {
       ArrayList<CarEntity> carEntitys = new ArrayList<>();
       
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Car");
        while (rst.next()) {
            CarEntity entity = new CarEntity(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getDouble(7));
            carEntitys.add(entity);
        }
        return carEntitys;
    }

    
}
