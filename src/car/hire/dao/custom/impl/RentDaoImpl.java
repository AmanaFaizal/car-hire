/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao.custom.impl;

import car.hire.dao.CrudUtil;
import car.hire.dao.custom.RentDao;
import car.hire.entity.RentEntity;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author ASS if
 */
public class RentDaoImpl implements RentDao{

    @Override
    public boolean add(RentEntity t) throws Exception {
          return CrudUtil.executeUpdate("INSERT INTO Rent VALUES( ?,?,?,?,?,?,?,?,?)",
                  t.getRentId(), t.getFromDate(), t.getToDate(),
                  t.getCarId(), t.getCustId(), t.getTotal(),
                  t.getAdvance(), t.getBalance(), t.getIsReturn());
    }

    @Override
    public boolean update(RentEntity t) throws Exception {
       return CrudUtil.executeUpdate("UPDATE Rent SET from_date=? ,to_date=? , car_id=?, cust_id=? , total=?, advance=?, balance=? , is_return=? WHERE rent_id=? ",
              t.getFromDate(), t.getToDate(),
                  t.getCarId(), t.getCustId(), t.getTotal(),
                  t.getAdvance(), t.getBalance(),
                  t.getIsReturn(),t.getRentId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
     }

    @Override
    public RentEntity get(String id) throws Exception {
          ResultSet rst = CrudUtil.executeQuery("Select * FROM Rent WHERE rent_id = ?", id);
        
        while (rst.next()) {            
            RentEntity rentEntity = new RentEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getDouble(6),
                    rst.getDouble(7),
                    rst.getDouble(8),
                    rst.getString(9));
        return rentEntity;
        }
        return null;
    }
    
    @Override
    public ArrayList<RentEntity> getAll() throws Exception {
         ArrayList<RentEntity> rentEntitys = new ArrayList<>();
        
        ResultSet rst = CrudUtil.executeQuery("Select * FROM Rent");
        
        while (rst.next()) {            
            RentEntity rentEntity = new RentEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                     rst.getString(5),
                    rst.getDouble(6),
                    rst.getDouble(7),
                    rst.getDouble(8),
                    rst.getString(9));
            
           rentEntitys.add(rentEntity);
        }
        
        return rentEntitys;
    }
}
 
