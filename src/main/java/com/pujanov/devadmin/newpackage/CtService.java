package com.pujanov.devadmin.newpackage;

import com.pujanov.devadmin.dto.CityDTO;

public interface CtService{
	public void addCity(CityDTO city);
	public void deleteCity(int cityId);
	public void updateCity(int cityId, CityDTO newCityInfo);
	public String getCityById(int cityId);
	
}
