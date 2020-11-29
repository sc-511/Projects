package com.FactOrQuote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FactOrQuote.dao.FactDAO;
import com.FactOrQuote.model.Fact;

@RestController
public class FactController {
	@Autowired
	private FactDAO factDAO;
	
	public FactController(FactDAO factDAO) {
		this.factDAO = factDAO;
	}
	
	@RequestMapping(path = "/fact/all", method = RequestMethod.GET)
	public List<Fact> allFacts(){
		return factDAO.allFacts();
	}
	
	@RequestMapping(path = "/fact", method = RequestMethod.GET)
	public String generatedFact () {
		return factDAO.randomFact();
	}
}
