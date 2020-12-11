package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.TagRepository;
import com.example.demo.valueobject.PubByTagByUserIdiomVO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class TagController {

	
	@Autowired
    private TagRepository tagRepository;
	
	/*
	@Operation(description = "Total de postagens agrupadas por Hora do dia", tags = {"v1"})
    @ApiResponses(value = {
            @ApiResponse(description = "Sucesso", responseCode = "200")
    })*/
	
    @RequestMapping(value = "/tag", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<PubByTagByUserIdiomVO>> getTags() {
        List<PubByTagByUserIdiomVO> tags = tagRepository.listPubAmountByTagsByUser();
        return new ResponseEntity<List<PubByTagByUserIdiomVO>>(tags, HttpStatus.OK);
    }
}
