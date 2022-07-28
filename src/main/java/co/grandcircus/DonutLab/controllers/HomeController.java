package co.grandcircus.DonutLab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.DonutLab.services.DonutServices;

@Controller
public class HomeController {
	
	@Autowired
	DonutServices donutService;
	
	@RequestMapping("/")
	public String showIndex(Model model) {
		model.addAttribute("donuts", donutService.getAllDonuts());
		return "index";
	}
	
	@RequestMapping("/details")
	public String details(Model model, @RequestParam int id) {
		model.addAttribute("donut", donutService.getDonutId(id));
		return "details";
	}
	

}
