package com.vgdemo.demo.repositories;

import com.vgdemo.demo.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<Blog,Integer> {
}
