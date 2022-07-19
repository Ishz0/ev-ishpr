package com.praish.web;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.praish.model.Charger;
import com.praish.service.ChargerService;

@Controller 
public class ChargerController {
	
	private ChargerService chargerService;

	public ChargerController(ChargerService chargerService) {
		super();
		this.chargerService = chargerService;
	}
	
	@GetMapping("/chargers")
	public String listChargers(Model model) {
		model.addAttribute("chargers", chargerService.getAllChargers());
		
		return "chargers";
	}
	
	@GetMapping("/chargers/new")
	public String createChargerForm(Model model) {
		
		// create charger object to hold charger form data
		Charger charger = new Charger();
		model.addAttribute("charger", charger);
		return "create_charger";
		
	}
	
	@PostMapping("/chargers")
	public String saveCharger(@ModelAttribute("charger") Charger charger) {
		chargerService.saveCharger(charger);
		return "redirect:/chargers";
	}
	
	@GetMapping("/chargers/edit/{id}")
	public String editChargerForm(@PathVariable Long id, Model model) {
		model.addAttribute("charger", chargerService.getChargerById(id));
		System.out.println("fcedag");
		return "edit_charger";
		
	}
	
	@PostMapping("/chargers/{id}")
	public String updateCharger(@PathVariable Long id,
			@ModelAttribute("charger") Charger charger,
			Model model) {
		
		// get charger from database by id
		Charger existingCharger = chargerService.getChargerById(id);
		existingCharger.setId(id);
		existingCharger.setName(charger.getName());
		existingCharger.setLevel(charger.getLevel());
		existingCharger.setRatekw(charger.getRatekw());
		
		// save updated Charger object
		chargerService.updateCharger(existingCharger);
		return "redirect:/chargers";		
	}
	
	// handler method to handle delete charger request
	
	@GetMapping("/chargers/{id}")
	public String deleteCharger(@PathVariable Long id) {
		chargerService.deleteChargerById(id);
		return "redirect:/chargers";
	}

}
