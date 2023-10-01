package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepository iAddressRepository;

    // Add Address
    public String addAddresses(Address address) {
        iAddressRepository.save(address);
        return "Address added";
    }

    // Get Address By I'd
    public Address getAddressesById(Long addressId) {
        return iAddressRepository.findById(addressId)
                .orElseThrow(() -> new IllegalArgumentException("Address not found"));
    }

    // Get All Address
    public List<Address> getAllAddresses() {
        return iAddressRepository.findAll();
    }

    // Update Address by I'd
    public String updateAddresses(Long addressId, Address address) {
        Address existingAddress = iAddressRepository.findById(addressId)
                .orElseThrow(() -> new IllegalArgumentException("Address not found"));

        existingAddress.setStreet(address.getStreet());
        existingAddress.setCity(address.getCity());
        existingAddress.setState(address.getState());
        existingAddress.setZipcode(address.getZipcode());

        iAddressRepository.save(existingAddress);

        return "Address updated";
    }

    // Delete Address by I'd
    public String deleteAddressesById(Long addressId) {
        iAddressRepository.deleteById(addressId);
        return "Address deleted";
    }
}
