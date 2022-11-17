package com.elecguitar.server.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elecguitar.server.dto.Car;
import com.elecguitar.server.model.repo.CarRepo;

@Service
public class CarServiceImpl implements CarService{
	
	@Autowired
	private CarRepo repo;
	
	@Autowired
	public void setCarRepo(CarRepo repo) {
		this.repo = repo;
	}
	
	public CarRepo getCarRepo() {
		return repo;
	}

	@Override
	public List<Car> selectAll() {
		// TODO Auto-generated method stub
		return repo.selectAll();
	}

	@Override
	public List<Car> selectFilterPrice(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return repo.selectFilterPrice(map);
	}

	@Override
	public List<Car> selectFilterElecMileage(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return repo.selectFilterElecMileage(map);
	}

	@Override
	public List<Car> selectFilterCompany(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return repo.selectFilterCompany(map);
	}

	@Override
	public List<Car> selectFilterPriceElecMileage(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return repo.selectFilterPriceElecMileage(map);
	}

	@Override
	public List<Car> selectFilterPriceCompany(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return repo.selectFilterPriceCompany(map);
	}

	@Override
	public List<Car> selectFilterElecMileageCompany(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return repo.selectFilterElecMileageCompany(map);
	}

	@Override
	public List<Car> selectFilterPriceElecMileageCompany(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return repo.selectFilterPriceElecMileageCompany(map);
		
	}

}
