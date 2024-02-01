package com.entityRelationship.EmployeeOneToOne.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entityRelationship.EmployeeOneToOne.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, UUID> {

}
