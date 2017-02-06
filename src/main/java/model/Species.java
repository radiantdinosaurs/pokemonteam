package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model for Pokemon species
 * @author Bethany Corder
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Species {
	
	private String url;
	private String name;
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
