package com.BlogApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BlogApi.Modal.Blog;
import com.BlogApi.Service.BlogService;

@RestController
@RequestMapping("MyBlog")
public class BlogController {
	
	@Autowired
	BlogService apiService;
	
	@PostMapping("add")
	public ResponseEntity<String>addBlog(@RequestBody Blog blog){
		return apiService.addBlog(blog);
	}
	
	@GetMapping("get")
	public ResponseEntity<List<Blog>>getBlog(){
		return apiService.getBlog();
	}
	
	@PutMapping("update")
	public ResponseEntity<String>updateBlog(@RequestBody Blog blog){
		return apiService.updateBlog(blog);
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String>deleteBlog(@PathVariable int id){
		return apiService.deleteBlog(id);
	}

}
