package com.vgdemo.demo.controllers;

import com.vgdemo.demo.model.Gonderi;
import com.vgdemo.demo.requests.GonderiCreateRequest;
import com.vgdemo.demo.requests.GonderiUpdateRequest;
import com.vgdemo.demo.services.GonderiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class GonderiController {

    private GonderiService gonderiService;

    public GonderiController(GonderiService gonderiService) {
        this.gonderiService = gonderiService;
    }


    @GetMapping
    public List<Gonderi> getAllGonderi(@RequestParam Optional<Long> userId){
        return gonderiService.getAllGonderi(userId);
    }


    @GetMapping("/{gonderiId}")
    public Gonderi getOneGonderi(@PathVariable Long gonderiId){

        return gonderiService.getOneGonderiById(gonderiId);
    }


    @PostMapping
    public Gonderi createOneGonderi(@RequestBody GonderiCreateRequest newPostRequest){

        return gonderiService.createOneGonderi(newPostRequest);
    }


    @PutMapping("{postId}")
    public Gonderi updateOneGonderi(@PathVariable Long postId, @RequestBody GonderiUpdateRequest updateGonderiRequest){
        return gonderiService.updateOneGonderiById(postId,updateGonderiRequest);
    }

    @DeleteMapping("{postId}")
    public void deleteOneGonderi(@PathVariable Long postId){
        gonderiService.deleteOneGonderiById(postId);
    }


    @GetMapping("{postId}/resim")
    public String getBase64(@PathVariable Long postId ){
        return gonderiService.getBase64(postId);
    }

    @PostMapping("/{postId}/like")
    public void likePost(@PathVariable Long postId) {
        gonderiService.increaseLikesCount(postId);
    }

    @PostMapping("/{postId}/comment")
    public void commentOnPost(@PathVariable Long postId) {
        gonderiService.increaseCommentsCount(postId);
    }

}
/*


/users
/users/ {userId}
/users/{userId}/profile

/posts
/posts?usertd=(userid}
/posts/{postid}



/conments
/conment's?posttd={posttd}
/conments?userId={userid}
/conment's/ {comment 1d}



/ Likes
/likes?post1d={post1d}
/likes?user={userid}
/likes/{likeId}


 */