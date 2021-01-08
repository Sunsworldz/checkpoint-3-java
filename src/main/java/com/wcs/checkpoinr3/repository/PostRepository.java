package com.wcs.checkpoinr3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcs.checkpoinr3.entity.Posts;

public interface PostRepository extends JpaRepository<Posts, Long>{

}