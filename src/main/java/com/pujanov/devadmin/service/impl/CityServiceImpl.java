package com.pujanov.devadmin.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pujanov.devadmin.dao.CityDAO;
import com.pujanov.devadmin.dto.CityDTO;
import com.pujanov.devadmin.service.CityService;
import com.pujanov.devadmin.service.DbService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CityServiceImpl implements CityService{

	
	DbService dbService;
	
	public CityServiceImpl(DbService dbService) {
		this.dbService = dbService;
	}
	
	
	@Override
	public List<CityDTO> getAllCity() {
		// TODO Auto-generated method stub
		CityDAO cityDao = dbService.getDao(CityDAO.class);
		return cityDao.getAllCity();
	}

	@Override
	public CityDTO getACityById(int id) {
		// TODO Auto-generated method stub
		CityDAO cityDao = dbService.getDao(CityDAO.class);
		return cityDao.getCityById(id);
	}

	
	@Override
	public int addCity(CityDTO cityDTO) {
		// TODO Auto-generated method stub
		CityDAO cityDao = dbService.getDao(CityDAO.class);
		return cityDao.addCity(cityDTO);
	}

	@Override
	public void updateCity(int id, CityDTO cityDTO) {
		CityDAO cityDao = dbService.getDao(CityDAO.class);
		// TODO Auto-generated method stub
		cityDao.updateCity(id, cityDTO);
		
	}

	@Override
	public void deleteCity(int id) {
		// TODO Auto-generated method stub
		CityDAO cityDao = dbService.getDao(CityDAO.class);
		
	}

}
