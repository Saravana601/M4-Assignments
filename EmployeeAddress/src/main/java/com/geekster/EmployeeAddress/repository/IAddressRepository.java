package com.geekster.EmployeeAddress.repository;

import com.geekster.EmployeeAddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address,Long> {
}
