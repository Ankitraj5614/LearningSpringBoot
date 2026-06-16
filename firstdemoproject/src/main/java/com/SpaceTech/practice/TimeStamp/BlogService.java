package com.SpaceTech.practice.TimeStamp;
//package com.SpaceTech.service;

import org.springframework.stereotype.Service;

@Service
public interface BlogService {
	void saveBlogs();
	void updateBlogs(int id );
}
