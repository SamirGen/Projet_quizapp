package fr.dawan.quizapp.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.dawan.quizapp.entities.Quizz;
import fr.dawan.quizapp.repositories.QuizzRepository;

@Controller
@RequestMapping("/quizz")
public class QuizzController {
	
	@Autowired
	private QuizzRepository quizzRepository;
	
	@GetMapping("/index")
	public String index(Model model) {
		List<Quizz> quizz = quizzRepository.findAll();
		model.addAttribute("listQuizz", quizz);
		return "quizz"; 
		}
		
		
	}