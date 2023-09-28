/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.entity;

/**
 *
 * @author ASS if
 */
public class RentEntity {
    private String rentId;
    private String fromDate;
    private String toDate;
    private String carId;
    private String custId;
    private Double total;
    private Double advance;
    private Double balance;
    private String isReturn;

    public RentEntity() {
    }

    public RentEntity(String rentId, String fromDate, String toDate, String carId, String custId, Double total, Double advance, Double balance, String isReturn) {
        this.rentId = rentId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.carId = carId;
        this.custId = custId;
        this.total = total;
        this.advance = advance;
        this.balance = balance;
        this.isReturn = isReturn;
    }

    /**
     * @return the rentId
     */
    public String getRentId() {
        return rentId;
    }

    /**
     * @param rentId the rentId to set
     */
    public void setRentId(String rentId) {
        this.rentId = rentId;
    }

    /**
     * @return the fromDate
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * @param fromDate the fromDate to set
     */
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * @return the toDate
     */
    public String getToDate() {
        return toDate;
    }

    /**
     * @param toDate the toDate to set
     */
    public void setToDate(String toDate) {
        this.toDate = toDate;
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
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * @return the advance
     */
    public Double getAdvance() {
        return advance;
    }

    /**
     * @param advance the advance to set
     */
    public void setAdvance(Double advance) {
        this.advance = advance;
    }

    /**
     * @return the balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * @return the isReturn
     */
    public String getIsReturn() {
        return isReturn;
    }

    /**
     * @param isReturn the isReturn to set
     */
    public void setIsReturn(String isReturn) {
        this.isReturn = isReturn;
    }

    @Override
    public String toString() {
        return "RentEntity{" + "rentId=" + rentId + ", fromDate=" + fromDate + ", toDate=" + toDate + ", carId=" + carId + ", custId=" + custId + ", total=" + total + ", advance=" + advance + ", balance=" + balance + ", isReturn=" + isReturn + '}';
    }
    
}
