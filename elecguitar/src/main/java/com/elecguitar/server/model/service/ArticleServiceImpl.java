package com.elecguitar.server.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elecguitar.server.dto.Article;
import com.elecguitar.server.model.repo.ArticleRepo;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	private ArticleRepo repo;

	@Override
	public List<Article> selectAllArticle() {
		return repo.selectAllArticle();
	}
	
}
