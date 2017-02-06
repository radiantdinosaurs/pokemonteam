package com.pokemonteam;

import java.util.Arrays;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import model.Pokemon;

public class RequestService {
	

	public Pokemon getPokemonFromAPI(String content) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("User-Agent", "");
		String query = "http://pokeapi.co/api/v2/pokemon/" + content;
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		return restTemplate.exchange(query, HttpMethod.GET, entity, Pokemon.class).getBody();
   }
	
}
