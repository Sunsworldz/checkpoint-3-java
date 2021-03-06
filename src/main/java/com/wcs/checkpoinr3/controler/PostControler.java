package com.wcs.checkpoinr3.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wcs.checkpoinr3.entity.Posts;
import com.wcs.checkpoinr3.repository.PostRepository;
import com.wcs.checkpoinr3.services.PostService;



@CrossOrigin(origins = "https://javangular-checkpoint3.jsrover.wilders.dev", maxAge = 3600)
@RestController
@RequestMapping("/posts")

public class PostControler {


    @Autowired
    PostService  postService;

    @Autowired
    PostRepository postRepository;

    @GetMapping
    public List<Posts> readAll() {
        return postService.getAllPosts();
    }

    @GetMapping("/{id}")
    public Posts read(@RequestParam(value="id") Long id) {
        return postService.getPostsById(id);
    }
}