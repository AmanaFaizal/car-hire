/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao.custom.impl;

import car.hire.dao.CrudUtil;
import car.hire.dao.custom.CustomerDao;
import car.hire.entity.CustomerEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASS if
 */
public class CustomerDaoImpl implements CustomerDao{

    @Override
    public boolean add(CustomerEntity t) throws Exception {
       return CrudUtil.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?,?)",
                t.getCustId(), t.getCustName(), t.getNic(), t.getAddress(),
                t.getContactNo());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Customer SET  cust_name=? ,nic_no=? ,cust_address=? , contact_no=? WHERE cust_id =?",
                 t.getCustName(), t.getNic(), t.getAddress(),
                t.getContactNo(),t.getCustId());
                }

    @Override
    public boolean delete(String id) throws Exception {
         return CrudUtil.executeUpdate("DELETE FROM Customer WHERE cust_id=?",
                id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select * FROM Customer WHERE cust_id = ?", id);
        
        while (rst.next()) {            
            CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));
        return customerEntity;
        }
        return null;
    }


    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
         ArrayList<CustomerEntity> customerEntitys = new ArrayList<>();
        
        ResultSet rst = CrudUtil.executeQuery("Select * FROM Customer");
        
        while (rst.next()) {            
            CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));
            
           customerEntitys.add(customerEntity);
        }
        
        return customerEntitys;
    }
}
  
