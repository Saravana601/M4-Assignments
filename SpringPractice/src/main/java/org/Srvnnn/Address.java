package org.Srvnnn;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street;
    private String city;


    public Address() {
        this.street = "Unknown";
        this.city = "Unknown";
    }


    public String getStreet() {
        return street;
    }


    public String getCity() {
        return city;
    }


    public void setStreet(String street) {
        this.street = street;
    }


    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString(){
        return "Address [street=" + street + ", city=" + city + "]";
    }
}
