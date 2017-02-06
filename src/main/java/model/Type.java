package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model for Pokemon types
 * @author Bethany Corder
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Type {
	
	private int slot;
	private String url;
	private String name;
	
    public void setTypeName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
