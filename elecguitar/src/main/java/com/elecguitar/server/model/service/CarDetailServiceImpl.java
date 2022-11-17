package com.elecguitar.server.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elecguitar.server.dto.CarDetail;
import com.elecguitar.server.model.repo.CarDetailRepo;

@Service
public class CarDetailServiceImpl implements CarDetailService{

	@Autowired
	private CarDetailRepo repo;
	
	@Autowired
	public void setCarDetailRepo(CarDetailRepo repo) {
		this.repo = repo;
	}
	
	@Autowired
	public CarDetailRepo getCarDetailRepo() {
		return repo;
	}
	
	@Override
	public CarDetail selectCarDetailById(int id) {
		// TODO Auto-generated method stub
		return repo.selectCarDetailById(id);
	}

}
