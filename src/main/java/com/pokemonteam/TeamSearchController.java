package com.pokemonteam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import database.DatabaseReader;
import model.Pokemon;
import model.Team;
import model.TeamSearch;

@Controller
public class TeamSearchController {
	
	@RequestMapping(value="/teamsearch", method=RequestMethod.GET)
	public String displayTeamPage(Model model) {
		model.addAttribute("teamsearch", new TeamSearch());
		return "teamsearch";
	}
	
	@RequestMapping(value="/teamsearch", method=RequestMethod.POST)
	public String search(@ModelAttribute("teamsearch") TeamSearch teamsearch, Model model) {
		DatabaseReader dr = new DatabaseReader();
		int teamId = dr.getTeamId(teamsearch);
		String teamName = dr.getTeamName(teamId);
		model.addAttribute("teamId", teamId);
		model.addAttribute("teamName", teamName);
		return "teamsearchresults";
	}

}
