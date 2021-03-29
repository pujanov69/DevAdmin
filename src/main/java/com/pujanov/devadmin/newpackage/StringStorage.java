package com.pujanov.devadmin.newpackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pujanov.devadmin.dao.CityDAO;
import com.pujanov.devadmin.service.DbService;

@Component
public class StringStorage implements StorageService {

	@Autowired
	DbService dbService;
	// String storage service only executes the string query..
	@Override
	public String query(String queryString) {
		
		CtDAO cityDao = dbService.getDao(CtDAO.class);
		return cityDao.runQuery(queryString);
	}

}
