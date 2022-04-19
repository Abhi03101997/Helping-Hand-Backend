package com.example.helpinghand.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Request extends User{

    @Column(nullable = false)
    private String itemName;

    @Column(nullable = false)
    private double quantity;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String traMod;

    @Column(nullable = false)
    private String details;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private Date currentDate;

    @Column(nullable = false)
    private Date targetDate;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTraMod() {
        return traMod;
    }

    public void setTraMod(String traMod) {
        this.traMod = traMod;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public Boolean getAccepted() {
        return isAccepted;
    }

    public void setAccepted(Boolean accepted) {
        isAccepted = accepted;
    }

    @Column(nullable = false)
    private Boolean isAccepted;

}
