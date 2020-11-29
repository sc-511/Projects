package com.FactOrQuote.dao;
import java.util.List;
import com.FactOrQuote.model.Quote;
public interface QuoteDAO {
		// displays all of the current quotes in the database
		List <Quote> allQuotes();
		// displays a randomly generated quote in the database
		String randomQuotes();
}
