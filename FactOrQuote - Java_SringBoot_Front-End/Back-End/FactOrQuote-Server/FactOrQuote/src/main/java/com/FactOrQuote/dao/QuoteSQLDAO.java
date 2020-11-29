package com.FactOrQuote.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.FactOrQuote.model.Quote;

@Component
public class QuoteSQLDAO implements QuoteDAO {
	private JdbcTemplate jdbcTemplate;
	
	public QuoteSQLDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Quote> allQuotes(){
		List<Quote> quotes = new ArrayList<>();
		String sql = "SELECT quote_id, quote_desc FROM quotes";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()) {
			Quote theQuotes = mapRowToQuotes(results);
			quotes.add(theQuotes);
		}
		return quotes;
		
	}
	
	@Override
	public String randomQuotes() {
		int randomValue = (int) (Math.random() * 12);
		String sql = "SELECT quote_desc FROM quotes WHERE quote_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		String randomQuote = "";
		while(results.next()) {
			randomQuote = results.getString(1);
		}
		return randomQuote;
		
	}
	
	private Quote mapRowToQuotes(SqlRowSet rs) {
		Quote myQuote = new Quote();
		myQuote.setQuote_id(rs.getInt("quote_id"));
		myQuote.setQuote_desc(rs.getString("quote_desc"));
		return myQuote;
	}

	
}
