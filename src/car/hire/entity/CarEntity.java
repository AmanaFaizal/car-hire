/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.entity;

/**
 *
 * @author ASS if
 */
public class CarEntity {
    private String carId;
    private String categoryId;
    private String vehiclleNo;
    private String year;
    private String brand;
    private String model;
    private Double rent;

    public CarEntity() {
    }

    public CarEntity(String carId, String categoryId, String vehiclleNo, String year, String brand, String model, Double rent) {
        this.carId = carId;
        this.categoryId = categoryId;
        this.vehiclleNo = vehiclleNo;
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.rent = rent;
    }

    /**
     * @return the carId
     */
    public String getCarId() {
        return carId;
    }

    /**
     * @param carId the carId to set
     */
    public void setCarId(String carId) {
        this.carId = carId;
    }

    /**
     * @return the categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return the vehiclleNo
     */
    public String getVehiclleNo() {
        return vehiclleNo;
    }

    /**
     * @param vehiclleNo the vehiclleNo to set
     */
    public void setVehiclleNo(String vehiclleNo) {
        this.vehiclleNo = vehiclleNo;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the rent
     */
    public Double getRent() {
        return rent;
    }

    /**
     * @param rent the rent to set
     */
    public void setRent(Double rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "CarEntity{" + "carId=" + carId + ", categoryId=" + categoryId + ", vehiclleNo=" + vehiclleNo + ", year=" + year + ", brand=" + brand + ", model=" + model + ", rent=" + rent + '}';
    }

    
}
