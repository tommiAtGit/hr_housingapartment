package com.myjava.housingrecoed.housingapartment.housingaparment.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class HousingApartment {
	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(length = 16, columnDefinition = "BINARY(16)", updatable = false, nullable = false)
	private UUID id;
	@Column(name = "UserInfo")
	private UUID userInfo;
	@Column(name = "HousingCooperative")
	private UUID housingCooperative;
	@Column(name = "Apartment")
	private String apartment;
}
