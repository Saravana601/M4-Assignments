package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("addresses")
    public String addAddresses(@RequestBody Address address){
        return addressService.addAddresses(address);
    }

    @GetMapping("addresses/{addressId}")
    public Address getAddressesById(@PathVariable Long addressId){
        return addressService.getAddressesById(addressId);
    }

    @GetMapping("addresses")
    public List<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }

    @PutMapping("addresses/{addressId}")
    public String updateAddresses(@PathVariable Long addressId,@RequestBody Address address){
        return addressService.updateAddresses(addressId,address);
    }

    @DeleteMapping("addresses/{addressId}")
    public String deleteAddresses(@PathVariable Long addressId){
        return addressService.deleteAddressesById(addressId);
    }
}
