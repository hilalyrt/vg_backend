package com.vgdemo.demo.controllers;

import com.vgdemo.demo.model.Blog;
import com.vgdemo.demo.services.BlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bloglar")
public class BlogController {

    private BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    public List<Blog> getAllBlogs(){
      return  blogService.getAllBlog();
    }

     @GetMapping("/{blogID}")
    public Blog getOneBlog(@PathVariable Integer blogID){
        return blogService.getOneBlog(blogID);
    }

    @GetMapping("/{blogId}/resim")
    public String getBase64(@PathVariable Integer blogId){
        return blogService.getBase64(blogId);
    }
}
