package org.studyeasy.entity;

public class Post {
	String title;
	String body;
	int id;
	public Post(String title, String body, int id) {
		this.title = title;
		this.body = body;
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	
	
	
	
	
	
}
