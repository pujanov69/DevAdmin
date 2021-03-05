package com.pujanov.devadmin.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CityDTO {
	
	private int id;
	private String name;
	private String countryCode;
	private String district;
	private int population;

}
