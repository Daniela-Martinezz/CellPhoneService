package com.pluralsight;

public class Cellphone {
   //fields (attributes)
    public String serialNumber;
    public String phoneModel;
    public String carrier;
    public String phoneNumber;
    public String owner;

    public Cellphone(String _serialNumber, String _phoneModel, String _carrier, String _phoneNumber, String _owner){
        this.serialNumber = _serialNumber;
        this.phoneModel = _phoneModel;
        this.carrier = _carrier;
        this.phoneNumber = _phoneNumber;
        this.owner = _owner;
    }

    public Cellphone(){
        //empty method
    }
    public void displayInfo() {
        System.out.println("Owner: " + owner + "\nSerial Number: " + serialNumber +
                "\nPhone Model: " + phoneModel + "\nCarrier: " + carrier +
                "\nPhone Number: " + phoneNumber);
    }
}

