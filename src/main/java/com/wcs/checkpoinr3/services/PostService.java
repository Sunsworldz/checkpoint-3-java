package com.wcs.checkpoinr3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.checkpoinr3.entity.Posts;
import com.wcs.checkpoinr3.repository.PostRepository;
import com.wcs.checkpoinr3.repository.UserRepository;

@Service
public class PostService {

    @Autowired
    UserRepository UserRepo;

    @Autowired
    PostRepository PostsRepo;

    public List<Posts> getAllPosts() {
        return PostsRepo.findAll();
    }

    public Posts getPostsById(Long id) {
        return PostsRepo.findById(id).get();
    }


}
