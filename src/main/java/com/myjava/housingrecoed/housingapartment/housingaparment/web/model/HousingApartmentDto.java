package com.myjava.housingrecoed.housingapartment.housingaparment.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HousingApartmentDto {
	private UUID id;
	private UUID userInfo;
	private UUID housingCooperative;
	private String apartment;
}
