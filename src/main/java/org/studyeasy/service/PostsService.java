package org.studyeasy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.studyeasy.entity.Post;

@Service
public class PostsService {
	
	

	List<Post>posts= new ArrayList<>();
	public PostsService()
	{
		posts.add(new Post("datatype","integer",1));
		posts.add(new Post("datatype","string",2));
		posts.add(new Post("datatype","float",4));
		posts.add(new Post("datatype","double",5));
	}
	
	public List<Post> getPosts()
	{
		return posts;
	}
	
	public Post getPost(int id)
	{
		for(Post post: posts)
		{
			if(post.getid()==id)
			{
				return post;
			}
		}
		return null;
	}
	
	public void addPost(Post post) {
		posts.add(post);
	}
}
