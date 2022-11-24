package com.elecguitar.server.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elecguitar.server.model.service.FirebaseCloudMessageService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/fcmapi")
@RestController
@CrossOrigin("*")
@Api(value="Elecguitar API V1")
public class TokenController {
	
	private static final Logger logger = LoggerFactory.getLogger(TokenController.class);

    @Autowired
    FirebaseCloudMessageService service;
    
    @ApiOperation(value="토큰을 등록한다.")
    @PostMapping("/token")
    public String registToken(@RequestParam String token) {
    	logger.info("registToken : token:{}", token);
        service.addToken(token);
        return "'"+token+"'" ;
    }
    
    @ApiOperation(value="이유호가 쏜다!")
    @PostMapping("/broadcast")
    public Integer broadCast(String title, String body) throws IOException {
    	logger.info("broadCast : title:{}, body:{}", title, body);
    	return service.broadCastMessage(title, body);
    }

    @ApiOperation(value="메시지를 보낸다.")
    @PostMapping("/sendMessageTo")
    public void sendMessageTo(String token, String title, String body) throws IOException {
    	logger.info("sendMessageTo : token:{}, title:{}, body:{}", token, title, body);
        service.sendMessageTo(token, title, body);
    }
}
