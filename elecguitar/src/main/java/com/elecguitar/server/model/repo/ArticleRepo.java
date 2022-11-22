package com.elecguitar.server.model.repo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.elecguitar.server.dto.Article;

@Mapper
public interface ArticleRepo {
	List<Article> selectAllArticle();
}
