package com.example.demo9;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

    //Autowiring by property
  //1)  @Autowired
    private Address address;

    //Autowiring by setter method
    //2) @Autowired
    public void setAddress(Address address) {
        System.out.println("Setting values");
        this.address = address;
    }

    public Emp() {
    }

    //3) Autowiring using constructor
    @Autowired
    public Emp(Address address) {
        System.out.println("Inside constructor");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

}
