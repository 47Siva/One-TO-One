package com.entityRelationship.EmployeeOneToOne.dto;

import java.util.UUID;

import com.entityRelationship.EmployeeOneToOne.entity.Address;

import lombok.Data;

@Data
public class EmployeeDto {

	private UUID id;

	private String name;

	private String job;

	private long number;

	private Address address;
}
