package com.BlogApi.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.BlogApi.Modal.Blog;
import com.BlogApi.Repository.BlogRepository;

@Service
public class BlogService {

	@Autowired
	BlogRepository repo;
	
	public ResponseEntity<String> addBlog(Blog blog) {
		try {
			repo.save(blog);
			return new ResponseEntity<>("Ok, 1 blog posted",HttpStatus.CREATED);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>("Failed",HttpStatus.NOT_ACCEPTABLE);
	}
	public ResponseEntity<List<Blog>> getBlog() {
		try {
			return new ResponseEntity<>(repo.findAll(),HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
	}
	public ResponseEntity<String> updateBlog(Blog blog) {
		try {
			repo.save(blog);
			return new ResponseEntity<>("Ok, Blog Updated/Added",HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>("Failed",HttpStatus.NOT_ACCEPTABLE);
	}
	public ResponseEntity<String> deleteBlog(int id) {
		try {
			repo.deleteById(id);
			return new ResponseEntity<>("Ok, Blog Deleted",HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>("Failed",HttpStatus.NOT_ACCEPTABLE);
	}
}
