package com.elecguitar.server.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elecguitar.server.dto.Car;
import com.elecguitar.server.model.service.CarService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RequestMapping("/carapi")
@RestController
@Api(value="Elecguitar API V1")
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@ApiOperation(value="모든 전기차의 정보를 반환한다.")
	@GetMapping("/car")
	public List<Car> selectAll(){
		return carService.selectAll();
	}
	
	@ApiOperation(value="price 범위 내의 전기차 정보를 반환한다.")
	@GetMapping("/car/price")
	public List<Car> selectFilterPrice(
			@RequestParam int startPrice, 
			@RequestParam int endPrice
			){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startPrice", startPrice);
		map.put("endPrice", endPrice);
		return carService.selectFilterPrice(map);
	}
	
	@ApiOperation(value="elecMileage 범위 내의 전기차 정보를 반환한다.")
	@GetMapping("/car/elecmileage")
	public List<Car> selectFilterElecMileage(
			@RequestParam int startElecMileage, 
			@RequestParam int endElecMileage
			){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startElecMileage", startElecMileage);
		map.put("endElecMileage", endElecMileage);
		return carService.selectFilterElecMileage(map);
	}
	
	@ApiOperation(value="company 리스트에 포함되는 전기차의 정보를 반환한다.")
	@GetMapping("/car/company")
	public List<Car> selectFilterElecMileage(
			@RequestParam List<String> companyList
			){
		List<Car> resultList = new ArrayList<Car>();
		for(String company: companyList) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("company", company);
			resultList.addAll(carService.selectFilterCompany(map));
		}
		return resultList;
	}
	
	@ApiOperation(value="price 범위와 elecMileage 범위 내의 전기차 정보를 반환한다.")
	@GetMapping("/car/price-elecmileage")
	public List<Car> selectFilterPriceElecMileage(
			@RequestParam int startPrice, 
			@RequestParam int endPrice, 
			@RequestParam int startElecMileage, 
			@RequestParam int endElecMileage
			){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startPrice", startPrice);
		map.put("endPrice", endPrice);
		map.put("startElecMileage", startElecMileage);
		map.put("endElecMileage", endElecMileage);
		return carService.selectFilterPriceElecMileage(map);
	}
	
	@ApiOperation(value="price 범위와 company 리스트에 포함되는 전기차 정보를 반환한다.")
	@GetMapping("/car/price-company")
	public List<Car> selectFilterPriceCompany(
			@RequestParam int startPrice, 
			@RequestParam int endPrice, 
			@RequestParam List<String> companyList 
			){
		List<Car> resultList = new ArrayList<Car>();
		for(String company: companyList) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("startPrice", startPrice);
			map.put("endPrice", endPrice);
			map.put("company", company);
			resultList.addAll(carService.selectFilterPriceCompany(map));
		}
		return resultList;
	}
	
	@ApiOperation(value="elecMileage 범위와 company 리스트에 포함되는 전기차 정보를 반환한다.")
	@GetMapping("/car/elecmileage-company")
	public List<Car> selectFilterElecMileageCompany(
			@RequestParam int startElecMileage, 
			@RequestParam int endElecMileage, 
			@RequestParam List<String> companyList 
			){
		List<Car> resultList = new ArrayList<Car>();
		for(String company: companyList) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("startElecMileage", startElecMileage);
			map.put("endElecMileage", endElecMileage);
			map.put("company", company);
			resultList.addAll(carService.selectFilterElecMileageCompany(map));
		}
		return resultList;
	}
	
	@ApiOperation(value="price 범위와 elecMileage 범위와 company 리스트에 포함되는 전기차 정보를 반환한다.")
	@GetMapping("/car/price-elecmileage-company")
	public List<Car> selectFilterPriceElecMileageCompany(
			@RequestParam int startPrice, 
			@RequestParam int endPrice, 
			@RequestParam int startElecMileage, 
			@RequestParam int endElecMileage, 
			@RequestParam List<String> companyList 
			){
		List<Car> resultList = new ArrayList<Car>();
		for(String company: companyList) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("startPrice", startPrice);
			map.put("endPrice", endPrice);
			map.put("startElecMileage", startElecMileage);
			map.put("endElecMileage", endElecMileage);
			map.put("company", company);
			resultList.addAll(carService.selectFilterPriceElecMileageCompany(map));
		}
		return resultList;
	}
	

	
}