/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.core_logics;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.component.html.HtmlOutputText;
import jakarta.faces.event.ValueChangeEvent;
import jakarta.inject.Named;

/**
 *
 * @author DecentCode
 */

@RequestScoped
@Named("carBooking")
public class CarBooking {
    private String Destination; 
    private HtmlOutputText
            VehicleName, 
            VehicleColor,
            VehicleNumber,
            DepartureTime,
            VehicleCapacity,
            Price; 
    
    public CarBooking(){}

    
    public void BookingDetails(ValueChangeEvent vce)
    {
        String id = vce.getNewValue().toString();
        String 
                vehicleName = " ", 
                vehicleColor = " ",
                vehicleNumber = " ",
                departureTime = " ",
                vehicleCapacity = " ",
                price = " ";
        if(id.compareTo("Lagos")==0)
        {
            vehicleName = "Mitsibushi"; 
            vehicleColor = "Red";
            vehicleNumber = "EG203ABJ";
            departureTime = "7:30AM";
            vehicleCapacity = "12";
            price = "5000";
        }
        else if(id.compareTo("PortHacourt")==0)
        {
            vehicleName = "Lorry"; 
            vehicleColor = "Red";
            vehicleNumber = "EG203ABJ";
            departureTime = "7:30AM";
            vehicleCapacity = "12";
            price = "5000";
        }
        else if(id.compareTo("Ibadan")==0)
        {
            vehicleName = "Jeep"; 
            vehicleColor = "Red";
            vehicleNumber = "EG203ABJ";
            departureTime = "7:30AM";
            vehicleCapacity = "12";
            price = "5000";
        }
        else if(id.compareTo("Sokoto")==0)
        {
            vehicleName = "Sports Car"; 
            vehicleColor = "Red";
            vehicleNumber = "EG203ABJ";
            departureTime = "7:30AM";
            vehicleCapacity = "12";
            price = "5000";
        }
        else if(id.compareTo("Akwaibom")==0)
        {
            vehicleName = "Volvo"; 
            vehicleColor = "Red";
            vehicleNumber = "EG203ABJ";
            departureTime = "7:30AM";
            vehicleCapacity = "12";
            price = "5000";
        }
        else if(id.compareTo("Aba")==0)
        {
            vehicleName = "Car"; 
            vehicleColor = "Red";
            vehicleNumber = "EG203ABJ";
            departureTime = "7:30AM";
            vehicleCapacity = "12";
            price = "5000";
        }
        
            getVehicleName().setValue(vehicleName); 
            getVehicleColor().setValue(vehicleColor);
            getVehicleNumber().setValue(vehicleNumber);
            getDepartureTime().setValue(departureTime);
            getVehicleCapacity().setValue(vehicleCapacity);
            getPrice().setValue(price);
    }
    
    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public HtmlOutputText getVehicleName() {
        return VehicleName;
    }

    public void setVehicleName(HtmlOutputText VehicleName) {
        this.VehicleName = VehicleName;
    }

    public HtmlOutputText getVehicleColor() {
        return VehicleColor;
    }

    public void setVehicleColor(HtmlOutputText VehicleColor) {
        this.VehicleColor = VehicleColor;
    }

    public HtmlOutputText getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(HtmlOutputText VehicleNumber) {
        this.VehicleNumber = VehicleNumber;
    }

    public HtmlOutputText getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(HtmlOutputText DepartureTime) {
        this.DepartureTime = DepartureTime;
    }

    public HtmlOutputText getVehicleCapacity() {
        return VehicleCapacity;
    }

    public void setVehicleCapacity(HtmlOutputText VehicleCapacity) {
        this.VehicleCapacity = VehicleCapacity;
    }

    public HtmlOutputText getPrice() {
        return Price;
    }

    public void setPrice(HtmlOutputText Price) {
        this.Price = Price;
    }
    
    
}
