package com.pujanov.devadmin.service;

import java.util.List;

import com.pujanov.devadmin.dto.CityDTO;

public interface CityService {

	public List<CityDTO> getAllCity();
	
	public CityDTO getACityById(int id);
	
	public int addCity(CityDTO cityDTO);
	
	public void updateCity(int id, CityDTO cityDTO);
	
	public void deleteCity(int id);
	
}
