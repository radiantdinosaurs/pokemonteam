package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Model for Pokemon sprites
 * @author Bethany Corder
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sprite {

	private String backFemale;
	private String backShinyFemale;
	private String backDefault;
	private String frontFemale;
	private String frontShinyFemale;
	private String backShiny;
	private String frontDefault;
	private String frontShiny;
	
	public void setBackFemale(String backFemale) {
		this.backFemale = backFemale;
	}
	
	public void setBackShinyFemale(String backShinyFemale) {
		this.backShinyFemale = backShinyFemale;
	}
	
	public void setBackDefault(String backDefault) {
		this.backDefault = backDefault;
	}
	
	public void setFrontFemale(String frontFemale) {
		this.frontFemale = frontFemale;
	}
	
	public void setFrontShinyFemale(String frontShinyFemale) {
		this.frontShinyFemale = frontShinyFemale;
	}
	
	public void setBackShiny(String backShiny) {
		this.backShiny = backShiny;
	}
	
	public void setFrontDefault(String frontDefault) {
		this.frontDefault = frontDefault;
	}
	
	public void setFrontShiny(String frontShiny) {
		this.frontShiny = frontShiny;
	}
}
