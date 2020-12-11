package com.twitter.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twitter.api.model.PubModel;
import com.twitter.api.model.TagModel;
import com.twitter.api.repository.TagRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/tag")
public class TagController {

	@Autowired
	private TagRepository repository;
	
	@GetMapping
	public ResponseEntity<List<TagModel>> getAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	/*@GetMapping("/{tag}")
	public ResponseEntity<List<TagModel>> getByTag(@PathVariable String tag)
	{
		return ResponseEntity.ok(repository.findAllByTagContainingIgnoreCase(tag));
	}*/
	
	@GetMapping("/{tag}")
	public ResponseEntity<List<TagModel>> getTags() {
        List<TagModel> tags = repository.listPubAmountByTags();
        return new ResponseEntity<List<TagModel>>(tags, HttpStatus.OK);
    }
}
