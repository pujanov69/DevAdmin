package com.pujanov.devadmin.newpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pujanov.devadmin.dto.CityDTO;

@Service
public class CtServiceImpl implements CtService{
	@Autowired
	private final StorageService stringStorage;
	
	public CtServiceImpl(StorageService stringStroage) {

		stringStorage = stringStroage;
	}
	
	@Override
	public void addCity(CityDTO query) {
		String preparingQuery = "INSERT INTO city(name, country_code, district, population) VALUE(" + "\'" + query.getName() + "\'"+ "," +  "\'" + query.getCountryCode() + "\'" + ","+ "\'" + query.getDistrict() + "\'" + ","+ query.getPopulation() + ")";
		stringStorage.query(preparingQuery); // or type "INSERT INTO 

	}

	@Override
	public void deleteCity(int cityId) {
		String preparedQuery = "DELETE FROM city WHRE id = " + cityId;
		stringStorage.query(preparedQuery); // neglect the return type

	}

	@Override
	public String getCityById(int cityId) {
		// TODO Auto-generated method stub
		return stringStorage.query("SELECT c.name from city c where id=" + cityId);
	}

	@Override
	public void updateCity(int cityId, CityDTO newCityInfo) {
		// TODO Auto-generated method stub
		
	}

}
