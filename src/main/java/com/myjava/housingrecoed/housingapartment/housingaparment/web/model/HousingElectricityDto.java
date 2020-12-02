package com.myjava.housingrecoed.housingapartment.housingaparment.web.model;

import java.util.Date;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HousingElectricityDto {
	private UUID id;
	
	private double cumulativeValue;
	
	private double consumptionValue;
	
	private Date measureDate;
	
	private UUID housingApartment;
}
