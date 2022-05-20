package org.studyeasy.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.studyeasy.entity.*;
import org.studyeasy.service.PostsService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnLists {

	@RequestMapping("/lists")
	public List<Post> list() {
	    return new PostsService().getPosts(); 
	}
	
	@RequestMapping("/lists/{id}")
	public Post getPost(@PathVariable int id)//PathVariable(telling the name is used diff name)
	{
		return new PostsService().getPost(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/lists")
	public void addPost(@RequestBody Post post)
	{
		new PostsService().addPost(post);
	}

}
