package com.pujanov.devadmin.dao;

import java.util.List;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.pujanov.devadmin.dto.CityDTO;

public interface CityDAO {

	@SqlQuery("SELECT * FROM city")
	@RegisterBeanMapper(CityDTO.class)
	public List<CityDTO> getAllCity();
	
	
	@SqlQuery("SELECT * FROM city WHERE id = :cityId")
	@RegisterBeanMapper(CityDTO.class)
	public CityDTO getCityById(@Bind("cityId") Integer cityId);
	
	@SqlUpdate("INSERT INTO city (name, country_code, district, population) VALUE(:name, :countryCode, :district, :population)")
	@GetGeneratedKeys
	public int addCity(@BindBean CityDTO cityDTO);
	
	@SqlUpdate("UPDATE city SET name = :name , country_code = :countryCode, district = :district , population = :population WHERE id = :cityId")
	public void updateCity(@Bind("cityId") int id, @BindBean CityDTO cityDTO);
	
	@SqlUpdate("DELETE FROM city WHERE id = :cityId")
	public void deleteCityById(@Bind("cityId") int id);
	
}
