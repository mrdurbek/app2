package com.spring.architecture2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.architecture2.entity.Comments;

public interface CommentRepository extends JpaRepository<Comments, Integer> {
}
