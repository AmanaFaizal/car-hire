/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.entity;

/**
 *
 * @author ASS if
 */
public class CustomerEntity {
    private String custId;
    private String custName;
    private String nic;
    private String address;
    private String contactNo;

    public CustomerEntity() {
    }

    public CustomerEntity(String custId, String custName, String nic, String address, String contactNo) {
        this.custId = custId;
        this.custName = custName;
        this.nic = nic;
        this.address = address;
        this.contactNo = contactNo;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" + "custId=" + custId + ", custName=" + custName + ", nic=" + nic + ", address=" + address + ", contactNo=" + contactNo + '}';
    }
    
    
    
}
