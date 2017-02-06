package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model for Pokemon ability
 * @author Bethany Corder
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ability {

	private int slot;
	private boolean isHidden;
	private String url;
	private String name;
	
	public void setSlot(int slot) {
		this.slot = slot;
	}
	
	public void setIsHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
