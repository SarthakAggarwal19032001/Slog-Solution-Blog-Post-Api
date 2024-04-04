package com.BlogApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BlogApi.Modal.Blog;


@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer>{

}
