package com.FactOrQuote.model;

import javax.validation.constraints.NotEmpty;

public class Fact {
	@NotEmpty (message = "The field `fact_id` should not be blank.")
	private int fact_id;
	@NotEmpty (message = "The field `fact_desc` should not be blank.")
	private String fact_desc;
	
	public Fact() {}
	
	public Fact(int fact_id, String fact_desc) {
		this.fact_id = fact_id;
		this.fact_desc = fact_desc;
	}

	public int getFact_id() {
		return fact_id;
	}

	public void setFact_id(int fact_id) {
		this.fact_id = fact_id;
	}

	public String getFact_desc() {
		return fact_desc;
	}

	public void setFact_desc(String fact_desc) {
		this.fact_desc = fact_desc;
	}
}
