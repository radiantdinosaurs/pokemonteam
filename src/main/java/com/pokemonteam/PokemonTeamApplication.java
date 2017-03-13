package com.pokemonteam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import database.CreateDatabase;
import database.CreateTables;

@SpringBootApplication
public class PokemonTeamApplication {

//	private static final Logger log = LoggerFactory.getLogger(PokemonTeamApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PokemonTeamApplication.class, args);
        CreateDatabase cd = new CreateDatabase();
        CreateTables ct = new CreateTables();
        cd.createDatabase();
        ct.createPokemonTableInDatabase();
        ct.createTeamTableInDatabase();
		}
}