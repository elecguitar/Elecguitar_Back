package com.elecguitar.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elecguitar.server.dto.Article;
import com.elecguitar.server.dto.Car;
import com.elecguitar.server.model.service.ArticleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/article-api")
@RestController
@Api(value="Elecguitar API V1")
public class ArticleCotroller {

	@Autowired
	private ArticleService articleService;
	
	@ApiOperation(value="모든 전기차 관련 기사의 정보를 반환한다.")
	@GetMapping("/article")
	public List<Article> selectAllArticle(){
		return articleService.selectAllArticle();
	}
	
}
