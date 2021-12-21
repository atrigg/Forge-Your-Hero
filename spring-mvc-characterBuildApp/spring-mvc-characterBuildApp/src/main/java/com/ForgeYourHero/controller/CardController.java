package com.ForgeYourHero.controller;

import javax.servlet.http.HttpSession;

import com.ForgeYourHero.entity.Barbarian;
import com.ForgeYourHero.entity.CardGame;
import com.ForgeYourHero.entity.Knight;
import com.ForgeYourHero.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CardController {

	private static final String Battlefield = null;
	private static final String Battlefield1 = null;
	private static final String Battlefield2 = null;
	private static final String Knight = null;
	private static final String Barbarian = null;
	@GetMapping("/")
	public String welcome(Model model) {
		return "index";
	}

	@GetMapping("/sign-up")
	public ModelAndView signUp(Model model) {
		return new ModelAndView("sign-up", "user", new User());
	}

	@PostMapping("/sign-up")
	public String handleSignUp(Model model, @ModelAttribute("user") User user, HttpSession session) {
		model.addAttribute("user", user);
		return "index";
	}

	@GetMapping("/log-in")
	public ModelAndView logIn(Model model) {
		return new ModelAndView("log-in", "user", new User());
	}

	@PostMapping("/log-in")
	public String logIn(Model model, @ModelAttribute("user") User user, HttpSession session) {
		model.addAttribute("user", user);
		return "index";
	}

	@GetMapping("/card-game")
	public ModelAndView cardGame(Model model) {
		return new ModelAndView("card-game", "user", new User());
	}

	@GetMapping("/user")
	public ModelAndView user(Model model) {
		return new ModelAndView("index", "user", new User());
	}

	@PostMapping("/user")
	public String user(Model model, @ModelAttribute("user") User user, HttpSession session) {
		model.addAttribute("user", user);
		return "index";
	}

	@GetMapping("/attack-points")
	public ModelAndView attackPoints(Model model) {
		return new ModelAndView("card-game", "CardList", new User());
	}

	@PostMapping("/attack-points")
	public String attackPoints(Model model, @ModelAttribute("CardList") User user, HttpSession session) {
		model.addAttribute("card-game", "CardList");
		return "card-game";
	}
	@GetMapping("/health-points")
	public ModelAndView healthPoints(Model model) {
		return new ModelAndView("card-game", "CardList", new User());
	}
	@PostMapping("/health-points")
	public String healthPoints(Model model, @ModelAttribute("CardList") User user, HttpSession session) {
		model.addAttribute("card-game", "CardList");
//		if Barbarian == Battlefield && Knight == Battlefield) {
//		int tempHealth = Knight.getHealth() -1 ;
//		Barbarian.getAttack();
//		Knight.setHealth();
//		}
//		
//		if Barbarian == Battlefield1 && Knight == Battlefield1) {
//			int tempHealth = Knight.getHealth() -1 ;
//			Barbarian.getAttack();
//			Knight.setHealth();
//			}
//		
//		if Barbarian == Battlefield2 && Knight == Battlefield2) {
//			int tempHealth = Knight.getHealth() -1 ;
//			Barbarian.getAttack();
//			Knight.setHealth();
//			}
		
		return "health";
	
}
}
