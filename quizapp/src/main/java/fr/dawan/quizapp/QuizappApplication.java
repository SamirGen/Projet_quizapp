package fr.dawan.quizapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.dawan.quizapp.entities.Categorie;
import fr.dawan.quizapp.entities.Question;
import fr.dawan.quizapp.entities.Quizz;
import fr.dawan.quizapp.entities.Reponse;
import fr.dawan.quizapp.repositories.CategorieRepository;
import fr.dawan.quizapp.repositories.QuestionRepository;
import fr.dawan.quizapp.repositories.QuizzRepository;
import fr.dawan.quizapp.repositories.ReponseRepository;

@SpringBootApplication
public class QuizappApplication implements CommandLineRunner{
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private QuizzRepository quizzRepository;
	
	@Autowired
	private CategorieRepository categorieRepository;
	
	@Autowired
	private ReponseRepository reponseRepository;

	public static void main(String[] args) {
		SpringApplication.run(QuizappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	//	questionRepository.save(new Question())
		
		Categorie categorie1 = new Categorie("Science");
		Categorie categorie2 = new Categorie("Informatique");
		Categorie categorie3 = new Categorie("Histoire");
		
		categorieRepository.save(categorie1);
		categorieRepository.save(categorie2);
		categorieRepository.save(categorie3);
		
		Quizz quizz1 = new Quizz("Symbole des elements", categorie1);
		Quizz quizz2 = new Quizz("Epidemie Pandemies", categorie1);
		Quizz quizz3 = new Quizz("unité de mesure", categorie1);
		
		Quizz quizz4 = new Quizz("Java", categorie2);
		Quizz quizz5 = new Quizz("PHP", categorie2);
		Quizz quizz6 = new Quizz("Python", categorie2);
		
		Quizz quizz7 = new Quizz("GM", categorie3);
		Quizz quizz8 = new Quizz("europe", categorie3);
		Quizz quizz9 = new Quizz("europe", categorie3);
		
		quizzRepository.save(quizz1);
		quizzRepository.save(quizz2);
		quizzRepository.save(quizz3);
		
		quizzRepository.save(quizz4);
		quizzRepository.save(quizz5);
		quizzRepository.save(quizz6);
		
		quizzRepository.save(quizz7);
		quizzRepository.save(quizz8);
		quizzRepository.save(quizz9);


		
		Question question1 = new Question("Une interface \"serializable\" permet", quizz4, true, 1);
		Question question2 = new Question("Quel est la difference entre les variables de type \"long\" et \"double\" ?", quizz4, true, 2);
		Question question3 = new Question("Comment afficher \"Hello Word\" dans la console ?", quizz4, true, 3);
		//Question question4 = new Question("L'objet Scanner permet " ?", quizz1, true, 2);
		//Question question5 = new Question("Quel environnement de développement est proposé par Java", quizz1, true, 1);
		//Question question6 = new Question("Quel est la difference entre les variables de type \"long\" et \"double\" ?", quizz1, true, 2);
		//Question question7 = new Question("Quel environnement de développement est proposé par Java", quizz1, true, 1);
		//Question question8 = new Question("Quel est la difference entre les variables de type \"long\" et \"double\" ?", quizz1, true, 2);

		
		questionRepository.save(question1);
		questionRepository.save(question2);
		questionRepository.save(question3);

		Reponse reponse1 = new Reponse(question1, "de sauvegarder ses objets dans un fichier", true);
		Reponse reponse2 = new Reponse(question1, "d'attribuer des n° de série a ses objets", false);
		Reponse reponse3 = new Reponse(question1, "de gérer ses objets sous forme de listes", false);
		Reponse reponse4 = new Reponse(question1, "d'empiler et dépiler ses objets", false);
		
		Reponse reponse5 = new Reponse(question2, "long occupe 4 octets et double 8 octets", false);
		Reponse reponse6 = new Reponse(question2, "double n'existe pas en Java", false);
		Reponse reponse7 = new Reponse(question2, "Long définit des entiers et double des nombres en virgule flottante", true);
		Reponse reponse8 = new Reponse(question2, "Long occupe 2 octets et double 4 octets", false);

		reponseRepository.save(reponse1);
		reponseRepository.save(reponse2);
		reponseRepository.save(reponse3);
		reponseRepository.save(reponse4);
		
		reponseRepository.save(reponse5);
		reponseRepository.save(reponse6);
		reponseRepository.save(reponse7);
		reponseRepository.save(reponse8);



		
		
		

	}

}
