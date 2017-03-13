package com.pokemonteam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import model.Pokemon;
import model.Search;

@Controller
@SessionAttributes({"team"})
public class SearchController {

	@GetMapping("/search")
	public String displaySearchPage(Model model) {
		model.addAttribute("search", new Search());
		return "search";
	}
	   	   
	@PostMapping("/search")
	public String searchSubmit(@ModelAttribute Search search, Model model) {
		RequestService rq = new RequestService();
		Pokemon pokemon = rq.getPokemonFromAPI(search.getContent());
		String pokemonName = pokemon.getName();
		int pokemonWeight = pokemon.getWeight();
		int pokemonHeight = pokemon.getHeight();
		model.addAttribute("pokemonName", pokemonName);
		model.addAttribute("pokemonWeight", pokemonWeight);
		model.addAttribute("pokemonHeight", pokemonHeight);
		return "redirect:/result";
	}
}
