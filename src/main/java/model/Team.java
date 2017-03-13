package model;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
	private int teamId;
	public String teamName;
	private String pokemonName;
	List<Pokemon> pokemonInTeam = new ArrayList<Pokemon>();
	private String[] mans;

	public int getTeamId() {
		return teamId;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public List<Pokemon> getPokemonInTeam() {
		return pokemonInTeam;
	}
	
	public String getPokemonName() {
		return pokemonName;
	}
	
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
}
