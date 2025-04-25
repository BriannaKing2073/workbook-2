package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private int phoneNumber;
    private String owner;

    public CellPhone(){
        this.serialNumber = 0;
        this.model = " ";
        this.carrier = " ";
        this.phoneNumber = 0;
        this.owner = " ";
    }
    public int getSerialNumber(){
        return this.serialNumber;
    }
    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getCarrier(){
        return this.carrier;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getOwner(){
        return this.owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "serialNumber=" + serialNumber +
                ", model='" + model + '\'' +
                ", carrier='" + carrier + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", owner='" + owner + '\'' +
                '}';
    }
}
