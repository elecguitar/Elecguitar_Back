package com.elecguitar.server.model.service;

import java.util.List;

import com.elecguitar.server.dto.Article;

public interface ArticleService {
	List<Article> selectAllArticle();
}
