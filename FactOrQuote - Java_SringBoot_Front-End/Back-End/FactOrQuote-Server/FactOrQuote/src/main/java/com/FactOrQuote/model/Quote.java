package com.FactOrQuote.model;

import javax.validation.constraints.NotEmpty;

public class Quote {
	@NotEmpty (message = "The field `quote_id` should not be blank.")
	private int quote_id;
	@NotEmpty (message = "The field `quote_desc` should not be blank.")
	private String quote_desc;
	
	public Quote() {}
	
	public Quote(int quote_id, String quote_desc) {
		this.quote_id = quote_id;
		this.quote_desc = quote_desc;
	}

	public int getQuote_id() {
		return quote_id;
	}

	public void setQuote_id(int quote_id) {
		this.quote_id = quote_id;
	}

	public String getQuote_desc() {
		return quote_desc;
	}

	public void setQuote_desc(String quote_desc) {
		this.quote_desc = quote_desc;
	}
	
	
}
