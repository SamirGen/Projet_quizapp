package fr.dawan.quizapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import fr.dawan.quizapp.entities.Reponse;
import fr.dawan.quizapp.repositories.ReponseRepository;

@Controller
@RequestMapping("/reponse")
public class ReponseController {
		
	@Autowired
	ReponseRepository reponseRepository;
	
	@GetMapping("/index")
	public String index(Model model) {
		List<Reponse> reponse = reponseRepository.findAll();
		model.addAttribute("listReponse", reponse);
		return "reponse"; 
		}

}
