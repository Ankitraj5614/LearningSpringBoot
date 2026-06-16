package com.SpaceTech.practice.TimeStamp;
//package com.SpaceTech.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BlogServceImpl implements BlogService
{
	@Autowired
	private BlogPostRepo repo;
	
	@Override
	public void saveBlogs() {
		BlogPost post = new BlogPost();
		
		post.setpContent("java world");
		post.setTitle("core java");
		repo.save(post);
	}

	@Override
	public void updateBlogs(int id) {
		Optional<BlogPost> opt = repo.findById(id);
		if(opt.isPresent()) {
			BlogPost bp = opt.get();
			bp.setTitle("python");
			repo.save(bp);
		}
	}

}
