package com.elecguitar.server.model.repo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.elecguitar.server.dto.Car;

@Mapper
public interface CarRepo {
	
	List<Car> selectAll();
	
	List<Car> selectFilterPrice(Map<String,Object> map);
	
	List<Car> selectFilterElecMileage(Map<String,Object> map);
	
	List<Car> selectFilterCompany(Map<String,Object> map);
	
	List<Car> selectFilterPriceElecMileage(Map<String,Object> map);
	
	List<Car> selectFilterPriceCompany(Map<String,Object> map);
	
	List<Car> selectFilterElecMileageCompany(Map<String,Object> map);
	
	List<Car> selectFilterPriceElecMileageCompany(Map<String,Object> map);
	
}
