package org.studyeasy.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.studyeasy.entity.Post;

@Service
public class PostsService {
	
	

	static List<Post>posts= new ArrayList<>(
			Arrays.asList(
				new Post("datatype","integer",1),
				new Post("datatype","string",2),
				new Post("datatype","float",4),
				new Post("datatype","double",5))
			);
	
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

	public void updatePost(Post post, int id) {
		// TODO Auto-generated method stub
		for(int i=0;i<posts.size();i++)
		{
			Post tmp=posts.get(i);
			if(tmp.getid()==id)
			{
				posts.set(i, post);
				return;
			}
		}
		return;
	}
}
