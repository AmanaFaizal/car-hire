/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service.custom.Impl;

import car.hire.dao.DaoFactory;
import car.hire.dao.custom.CustomerDao;
import car.hire.dto.CustomerDto;
import car.hire.entity.CustomerEntity;
import car.hire.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author ASS if
 */
public class CustomerServiceImpl implements CustomerService{

    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public String addCustomer(CustomerDto dto) throws Exception {
        CustomerEntity ce = new CustomerEntity(dto.getCustId(),
                dto.getCustName(), dto.getNic(), dto.getAddress(), dto.getContactNo());

        if (customerDao.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
         CustomerEntity ce = new CustomerEntity(dto.getCustId(),
                dto.getCustName(), dto.getNic(), dto.getAddress(), dto.getContactNo());

        if (customerDao.update(ce)) {
            return "Successfully Update";
        } else {
            return "Fail";
        }
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
         if (customerDao.delete(id)) {
            return "Successfully Delete";
        } else {
            return "Fail";
        }
    }


    @Override
    public CustomerDto getCustomer(String id) throws Exception {
    CustomerEntity entity = customerDao.get(id);
        return new CustomerDto(entity.getCustId(), entity.getCustName(),
                entity.getNic(), entity.getAddress(), entity.getContactNo());
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
       ArrayList<CustomerDto>  customerDtos = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();
        
        for (CustomerEntity entity : customerEntitys) {
            CustomerDto dto = new CustomerDto(entity.getCustId(), entity.getCustName(),
                entity.getNic(), entity.getAddress(), entity.getContactNo());
            customerDtos.add(dto);
        }
        
        return customerDtos;
        
    }
}
