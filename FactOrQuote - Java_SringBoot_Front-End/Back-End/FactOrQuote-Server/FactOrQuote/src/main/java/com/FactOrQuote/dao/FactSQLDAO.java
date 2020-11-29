package com.FactOrQuote.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;
import com.FactOrQuote.model.Fact;

@Component
public class FactSQLDAO  implements FactDAO{
	private JdbcTemplate jdbcTemplate;
	
	public FactSQLDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public List<Fact> allFacts(){
		List<Fact> facts = new ArrayList<>();
		String sql = "SELECT fact_id, fact_desc FROM facts";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()) {
			Fact theFact = mapRowToFacts(results);
			facts.add(theFact);
		}
		return facts;
		
	}
	
	@Override
	public String randomFact() {
		int randomValue = (int) (Math.random() * 12);
		String sql = "SELECT fact_desc FROM facts WHERE fact_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		String randomFact = "";
		while(results.next()) {
			randomFact = results.getString(1);
		}
		return randomFact;
		
	}
	
	private Fact mapRowToFacts(SqlRowSet rs) {
		Fact myFact = new Fact();
		myFact.setFact_id(rs.getInt("fact_id"));
		myFact.setFact_desc(rs.getString("fact_desc"));
		return myFact;
	}
}
