package com.vgdemo.demo.controllers;

import com.vgdemo.demo.model.Yorum;
import com.vgdemo.demo.requests.YorumCreateRequest;
import com.vgdemo.demo.requests.YorumUpdateRequest;
import com.vgdemo.demo.service.YorumService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/yorumlar")
public class YorumController {

    private YorumService yorumService;

    public YorumController(YorumService yorumService) {
        this.yorumService = yorumService;
    }


    @GetMapping
    public List<Yorum> getAllYorum(@RequestParam Optional<Long> userId, @RequestParam Optional<Long> postId){
        return yorumService.getAllYorumWithParam(userId,postId);

    }

    @GetMapping("/{yorumId}")
    public Yorum getOneYorum(@PathVariable Long commentId){
        return yorumService.getOneYorumById(commentId);
    }

    @PostMapping
    public Yorum createOneYorum(@RequestBody YorumCreateRequest request){
        return yorumService.createOneYorumById(request);
    }

    @PutMapping("/{yorumId}")
    public Yorum updateOneYorum(@PathVariable Long commentId, @RequestBody YorumUpdateRequest request){
        return yorumService.updateOneYorumById(commentId,request);
    }


    @DeleteMapping("/{yorumId}")
    public void deleteOneYorum(@PathVariable Long commentId){
        yorumService.deleteOneYorumById(commentId);
    }
}
