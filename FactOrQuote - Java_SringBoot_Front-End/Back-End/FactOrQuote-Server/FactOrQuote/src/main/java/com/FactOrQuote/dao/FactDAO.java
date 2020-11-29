package com.FactOrQuote.dao;

import java.util.List;

import com.FactOrQuote.model.Fact;
public interface FactDAO {
	// displays all of the current facts in the database
	List <Fact> allFacts();
	// displays a randomly generated fact in the database
	String randomFact();
}
