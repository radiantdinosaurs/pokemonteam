package com.pokemonteam;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import model.Pokemon;

@SpringBootApplication
public class PokemonTeamApplication {

//	private static final Logger log = LoggerFactory.getLogger(PokemonTeamApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PokemonTeamApplication.class, args);
//		
//		RestTemplate restTemplate = new RestTemplate();
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		headers.set("User-Agent", "");
//
//		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
//		Pokemon pokemon = restTemplate.exchange("http://pokeapi.co/api/v2/pokemon/1", HttpMethod.GET, entity, Pokemon.class).getBody();
//		log.info(pokemon.toString());
//		log.info(pokemon.getName().toString());/	
		}
}