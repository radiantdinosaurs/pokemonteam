package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model for items that may be held by Pokemon caught in the wild
 * @author Bethany Corder
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeldItem {
	
	private String url;
	private String name;
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
