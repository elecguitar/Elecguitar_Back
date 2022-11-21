package com.elecguitar.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elecguitar.server.dto.CarDetail;
import com.elecguitar.server.model.service.CarDetailService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/carapi")
@RestController
@Api(value="Elecguitar API V1")
public class CarDetailController {
	
	@Autowired
	private CarDetailService carDetailService;
	
	@ApiOperation(value="id에 해당하는 전기차의 정보를 반환한다.")
	@GetMapping("/car/{id}")
	public CarDetail  selectCarDetailById(@PathVariable int id) {
		return carDetailService.selectCarDetailById(id);
	}
	
}