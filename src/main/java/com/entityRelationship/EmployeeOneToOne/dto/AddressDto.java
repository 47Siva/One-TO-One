package com.entityRelationship.EmployeeOneToOne.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class AddressDto {
	
	private UUID address_id;
	
	private String state;
	
	private String district;
	
	private String place;

}
