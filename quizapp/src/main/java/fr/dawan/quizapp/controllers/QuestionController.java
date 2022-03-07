package fr.dawan.quizapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import fr.dawan.quizapp.entities.Question;
import fr.dawan.quizapp.services.QuestionService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@GetMapping( value="/index")
	 public String index(ModelMap modelMap) {
		List<Question> listQuestion = questionService.findAll();
		modelMap.addAttribute("questions", listQuestion);
		return "questions";
		
	}

}
