package com.elecguitar.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elecguitar.server.dto.CarDetail;
import com.elecguitar.server.model.service.CarDetailService;

@RequestMapping("/carapi")
@RestController
public class CarDetailController {
	
	@Autowired
	private CarDetailService carDetailService;
	
	@GetMapping("/car/{id}")
	public CarDetail  selectCarDetailById(@PathVariable int id) {
		return carDetailService.selectCarDetailById(id);
	}
	
}
