package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model for game indices, which includes the index of the Pokemon in game versions
 * @author Bethany Corder
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GameIndice {
	
	private String url;
	private String name;
	private int gameIndex;
	
    public void setUrl(String url) {
        this.url = url;
    }
    
    public void setTypeName(String name) {
        this.name = name;
    }
    
    public void setGameIndex(int gameIndex) {
        this.gameIndex = gameIndex;
    }

}
