package com.elecguitar.server.dto;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "Car : 전기차 관련 기사", description = "전기차 기사 리스트 화면에 제공할 기사 정보")
public class Article {
	private int articleId;
	private String title;
	private String writer;
	private String content;
	private String time;
	private String img;
	
	
	public Article() {
		super();
	}

	public Article(int articleId, String title, String writer, String content, String time, String img) {
		super();
		this.articleId = articleId;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.time = time;
		this.img = img;
	}
	
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
}
