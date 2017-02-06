package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model for Pokemon form objects
 * @author Bethany Corder
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Form {
	
	private String url;
	private String name;
	
	public void setUrl(String url) {
		this.url = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
