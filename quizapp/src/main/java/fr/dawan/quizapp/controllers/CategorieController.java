package fr.dawan.quizapp.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.quizapp.entities.Categorie;
import fr.dawan.quizapp.repositories.CategorieRepository;

@Controller
@RequestMapping("/categorie")
public class CategorieController {
	
	@Autowired
	private CategorieRepository categorieRepository;
	
	@GetMapping("/index")
	public String index(Model model) {
		List<Categorie> categories = categorieRepository.findAll();
		model.addAttribute("listCategories", categories);
		return "categories"; 
		}
		
		
	}
	
