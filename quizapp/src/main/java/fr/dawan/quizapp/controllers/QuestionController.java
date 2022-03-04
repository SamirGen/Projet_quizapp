package fr.dawan.quizapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import fr.dawan.quizapp.entities.Question;
import fr.dawan.quizapp.services.QuestionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@RequestMapping( value="/index", method = RequestMethod.GET )
	 public String index(ModelMap modelMap) {
		List<Question> listQuestion = questionService.findAll();
		modelMap.addAttribute("questions", listQuestion);
		return "index";
		
	}

}
