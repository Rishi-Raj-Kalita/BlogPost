package org.studyeasy.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.studyeasy.entity.*;
import org.studyeasy.service.PostsService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnLists {

	@RequestMapping("/lists")
	public List<Post> list() {
	    return new PostsService().getPosts(); 
	}

}
