package com.pujanov.devadmin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pujanov.devadmin.dto.CityDTO;
import com.pujanov.devadmin.dto.ResponseDTO;
import com.pujanov.devadmin.exception.CustomSqlException;
import com.pujanov.devadmin.service.CityService;

@RequestMapping("/city")
@RestController
public class CityController {

	private final CityService cityService;
	
	public CityController(CityService cityService) {
		this.cityService = cityService;
	}
	

	@GetMapping("/all")
	public ResponseDTO<List<CityDTO>> getAllCity() throws CustomSqlException {
		return new ResponseDTO<List<CityDTO>> (cityService.getAllCity());
	}
	
	@GetMapping("/{id}")
	public ResponseDTO<CityDTO> getCityById(@PathVariable("id") int id) throws CustomSqlException {
		return new ResponseDTO<CityDTO> (cityService.getACityById(id));
	}
	
	@PostMapping("")
	public ResponseDTO<Integer> addCity(@RequestBody CityDTO cityDTO) throws CustomSqlException {
		//System.out.println("cityDTO--->" + cityDTO.toString() );
		return new ResponseDTO<Integer> (cityService.addCity(cityDTO));
	}
	
	@PutMapping("/{id}")
	public void updateCity(@RequestBody CityDTO cityDTO, @PathVariable("id") int id) throws CustomSqlException {
		cityService.updateCity(id, cityDTO);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCity(@PathVariable("id") int id) throws CustomSqlException{
		cityService.deleteCity(id);
	}
}
