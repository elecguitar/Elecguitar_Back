package com.elecguitar.server.model.repo;

import org.apache.ibatis.annotations.Mapper;

import com.elecguitar.server.dto.CarDetail;

@Mapper
public interface CarDetailRepo {
	
	CarDetail selectCarDetailById(int id);
	
}
