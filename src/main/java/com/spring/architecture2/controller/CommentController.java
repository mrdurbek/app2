package com.spring.architecture2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.architecture2.entity.Comments;
import com.spring.architecture2.repository.CommentRepository;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
	
	@Autowired
	CommentRepository commentRepository;
	
	@GetMapping
	public ResponseEntity<List<Comments>> getComment(){
		return ResponseEntity.ok(commentRepository.findAll());
	}
	
	
	@PostMapping
	public ResponseEntity<?> addComment(@RequestBody String text){
		Comments comment = new Comments();
		comment.setText(text);
		commentRepository.save(comment);
		return ResponseEntity.ok("Succesfully");
	}
}
