package com.vgdemo.demo.services;

import com.vgdemo.demo.model.Blog;
import com.vgdemo.demo.repositories.BlogRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    private BlogRepo blogRepo;

    public BlogService(BlogRepo blogRepo) {
        this.blogRepo = blogRepo;
    }


    public List<Blog> getAllBlog() {
        return blogRepo.findAll();
    }

    public Blog getOneBlog(Integer id){
        return blogRepo.findById(id).orElse(null);
    }

    public String getBase64(Integer blogId) {
        return blogRepo.findById(blogId).get().getResim();
    }
}
