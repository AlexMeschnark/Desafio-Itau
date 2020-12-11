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
import com.twitter.api.repository.PubRepository;

@RestController
@RequestMapping("/publicacao")
@CrossOrigin("*")
public class PubController {

	@Autowired
	private PubRepository repository;
	
	/*@GetMapping
	public ResponseEntity<List<PubModel>> GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{usuario}")
	public ResponseEntity<List<PubModel>> GetByUsuario(@PathVariable String usuario)
	{
		return ResponseEntity.ok(repository.findAllByUsuarioContainingIgnoreCase(usuario));
	}*/
	
	public ResponseEntity<List<PubModel>> getTweetCountByHourOfDay() {
        List<PubModel> pub = repository.listPubCountByHourOfDay();
        return new ResponseEntity<List<PubModel>>(pub, HttpStatus.OK);
    }
}
