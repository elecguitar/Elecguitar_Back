package com.elecguitar.server.model.service;

import com.elecguitar.server.dto.CarDetail;

public interface CarDetailService {

	CarDetail selectCarDetailById(int id);
	
}
