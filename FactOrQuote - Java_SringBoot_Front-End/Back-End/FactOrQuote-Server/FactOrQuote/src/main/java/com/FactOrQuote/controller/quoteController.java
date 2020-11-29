package com.FactOrQuote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.FactOrQuote.dao.QuoteDAO;
import com.FactOrQuote.model.Quote;

@RestController
public class QuoteController {
	@Autowired
	private QuoteDAO quoteDAO;
	
	public QuoteController(QuoteDAO quoteDAO) {
		this.quoteDAO = quoteDAO;
	}
	
	@RequestMapping(path = "/quote/all", method = RequestMethod.GET)
	public List<Quote> allQuotes(){
		return quoteDAO.allQuotes();
	}
	
	@RequestMapping(path = "/quote", method = RequestMethod.GET)
	public String generatedQuote() {
		return quoteDAO.randomQuotes();
	}
}
