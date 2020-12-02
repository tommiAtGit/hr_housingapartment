package com.myjava.housingrecoed.housingapartment.housingaparment.domain;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
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
public class ApartmentElectricity {

	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(length = 16, columnDefinition = "BINARY(16)", updatable = false, nullable = false)
	private UUID id;
	@Column(name = "CumulativeValue")
	private double cumulativeValue;
	@Column(name = "Consumption")
	private double consumptionValue;
	@Column(name = "MeasureDate")
	private Date measureDate;
	@Column(name = "Apartment")
	private UUID housingApartment;
}
