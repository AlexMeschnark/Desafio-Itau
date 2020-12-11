package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.repository.PubRepository;
import com.example.demo.valueobject.PubCountByHourOfDayVO;

import java.util.List;
public class PubController {

	@Autowired
    private PubRepository pubRepository;
	
	@RequestMapping(value = "/publicacao-por-hora", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<PubCountByHourOfDayVO>> getPubCountByHourOfDay() {
        List<PubCountByHourOfDayVO> pub = pubRepository.listPubCountByHourOfDay();
        return new ResponseEntity<List<PubCountByHourOfDayVO>>(pub, HttpStatus.OK);
    }
}
