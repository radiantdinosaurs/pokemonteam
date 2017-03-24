package com.pokemonteam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import database.DatabaseReader;
import database.DatabaseSeeder;
import model.Pokemon;
import model.Search;
import model.Team;

@Controller
@SessionAttributes("team")
public class TeamController {
	
	@RequestMapping(value="/team", method=RequestMethod.GET)
	public String displayTeamPage(Model model) {
		Team team = new Team();
		model.addAttribute("team", team);
		return "team";
	}
	
	@RequestMapping(params={"saveteamname"}, value="/team", method=RequestMethod.POST)
	public String saveTeamName(@ModelAttribute("team") Team team, Model model, BindingResult bindingResult) {
		model.addAttribute("team", team);
		return "team";
	}
	
	@RequestMapping(params={"search"}, value="/team", method=RequestMethod.POST)
	public String search(@ModelAttribute("team") Team team, Model model, BindingResult bindingResult) {
		RequestService rq = new RequestService();
		Pokemon pokemon = rq.getPokemonFromAPI(team.getPokemonName());
		String pokemonName = pokemon.getName();
		model.addAttribute("pokemonName", pokemonName);
		return "team";
	}
	
	@RequestMapping(params={"select"}, value="/team", method=RequestMethod.POST)
	public String select(@ModelAttribute("team") Team team, Model model, BindingResult bindingResult) {
		RequestService rq = new RequestService();
		Pokemon pokemon = rq.getPokemonFromAPI(team.getPokemonName());
		if(team.getPokemonInTeam().size() < 6) {
			team.getPokemonInTeam().add(pokemon);
			team.setPokemonName(null);
		}
		return "team";
	}
	
	@RequestMapping(params={"saveteamtodatabase"}, value="/team", method=RequestMethod.POST)
	public String saveTeamToDatabase(@ModelAttribute("team") Team team, Model model, BindingResult bindingResult) {
		DatabaseSeeder ds = new DatabaseSeeder();
		team.setTeamId(ds.insertTeamIntoDatabase(team));
		ds.insertPokemonIntoDatabase(team, team.getPokemonInTeam());
		return "index";
	}

}
