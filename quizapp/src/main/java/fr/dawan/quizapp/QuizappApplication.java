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
		
		Quizz quizz1 = new Quizz("Faune et flore", categorie1);
		Quizz quizz2 = new Quizz("Anatomie corps humain", categorie1);
		Quizz quizz3 = new Quizz("Physique Chimie", categorie1);
		
		Quizz quizz4 = new Quizz("Java", categorie2);
		Quizz quizz5 = new Quizz("PHP", categorie2);
		Quizz quizz6 = new Quizz("Python", categorie2);
		
		Quizz quizz7 = new Quizz("Seconde GM", categorie3);
		Quizz quizz8 = new Quizz("Histoire de France", categorie3);
		Quizz quizz9 = new Quizz("La 1ere GM", categorie3);
		
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
		Question question3 = new Question("Pour empêcher de redéfinir une méthode on la déclare", quizz4, true, 3);
		Question question4 = new Question("Quel mot clé utiliser pour empêcher d'instancier une classe mère tout en permettant l'héritage ?", quizz4, true, 4);
		Question question5 = new Question("Le constructeur d'une classe doit porter le même nom que la classe", quizz4, true, 5);
		Question question6 = new Question("\"--\" est un opérateur de", quizz4, true, 6);
		Question question7 = new Question("Quelle est l'extension d'un fichier byte code ?", quizz4, true, 7);
		Question question8 = new Question("Une variable de classe, commune à toutes les instances d'une classe doit être déclarée", quizz4, true, 8);

		//Question question4 = new Question("L'objet Scanner permet " ?", quizz1, true, 2);
		//Question question5 = new Question("Quel environnement de développement est proposé par Java", quizz1, true, 1);
		//Question question6 = new Question("Quel est la difference entre les variables de type \"long\" et \"double\" ?", quizz1, true, 2);
		//Question question7 = new Question("Quel environnement de développement est proposé par Java", quizz1, true, 1);
		//Question question8 = new Question("Quel est la difference entre les variables de type \"long\" et \"double\" ?", quizz1, true, 2);

		
		questionRepository.save(question1);
		questionRepository.save(question2);
		questionRepository.save(question3);
		questionRepository.save(question4);
		questionRepository.save(question5);
		questionRepository.save(question6);
		questionRepository.save(question7);
		questionRepository.save(question8);

		// réponses  de la question numero 1
		Reponse reponse1 = new Reponse(question1, "de sauvegarder ses objets dans un fichier", true);
		Reponse reponse2 = new Reponse(question1, "d'attribuer des n° de série a ses objets", false);
		Reponse reponse3 = new Reponse(question1, "de gérer ses objets sous forme de listes", false);
		Reponse reponse4 = new Reponse(question1, "d'empiler et dépiler ses objets", false);
		
		// réponse  de la question numero 2
		Reponse reponse5 = new Reponse(question2, "long occupe 4 octets et double 8 octets", false);
		Reponse reponse6 = new Reponse(question2, "double n'existe pas en Java", false);
		Reponse reponse7 = new Reponse(question2, "Long définit des entiers et double des nombres en virgule flottante", true);
		Reponse reponse8 = new Reponse(question2, "Long occupe 2 octets et double 4 octets", false);
		
		//reponses  de la question numero 3
		Reponse reponse9 = new Reponse(question3, "final", true);
		Reponse reponse10 = new Reponse(question3, "private", false);
		Reponse reponse11= new Reponse(question3, "exclusive", false);
		Reponse reponse12= new Reponse(question3, "static", false);
		
		//reponses de la question numero 4
		Reponse reponse13 = new Reponse(question4, "private", false);
		Reponse reponse14 = new Reponse(question4, "global", false);
		Reponse reponse15= new Reponse(question4, "abstract", true);
		Reponse reponse16= new Reponse(question4, "protected", false);
		
		//reponses de la question numero 5
		Reponse reponse17= new Reponse(question5, "pas obligatoirement", false);
		Reponse reponse18= new Reponse(question5, "c'est déconseillé", false);
		Reponse reponse19= new Reponse(question5, "oui impérativement", true);
		Reponse reponse20= new Reponse(question5, "non, c'est interdit", false);
		
		//reponses de la question numero 6
		Reponse reponse21= new Reponse(question6, "commentaire", false);
		Reponse reponse22= new Reponse(question6, "soustraction", false);
		Reponse reponse23= new Reponse(question6, "décrementation", true);
		Reponse reponse24= new Reponse(question6, "négation", false);
		
		//reponses de la question numero 7
		Reponse reponse25= new Reponse(question7, ".j", false);
		Reponse reponse26= new Reponse(question7, ".bin", false);
		Reponse reponse27= new Reponse(question7, ".class", true);
		Reponse reponse28= new Reponse(question7, ".java", false);
		
		//reponses de la question numero 8
		Reponse reponse29= new Reponse(question8, "global", false);
		Reponse reponse30= new Reponse(question8, "static", true);
		Reponse reponse31= new Reponse(question8, "public", false);
		Reponse reponse32= new Reponse(question8, "private", false);

		

		reponseRepository.save(reponse1);
		reponseRepository.save(reponse2);
		reponseRepository.save(reponse3);
		reponseRepository.save(reponse4);
		
		reponseRepository.save(reponse5);
		reponseRepository.save(reponse6);
		reponseRepository.save(reponse7);
		reponseRepository.save(reponse8);

		reponseRepository.save(reponse9);
		reponseRepository.save(reponse10);
		reponseRepository.save(reponse11);
		reponseRepository.save(reponse12);
		
		reponseRepository.save(reponse13);
		reponseRepository.save(reponse14);
		reponseRepository.save(reponse15);
		reponseRepository.save(reponse16);
		
		reponseRepository.save(reponse17);
		reponseRepository.save(reponse18);
		reponseRepository.save(reponse19);
		reponseRepository.save(reponse20);
		
		reponseRepository.save(reponse21);
		reponseRepository.save(reponse22);
		reponseRepository.save(reponse23);
		reponseRepository.save(reponse24);
		
		reponseRepository.save(reponse25);
		reponseRepository.save(reponse26);
		reponseRepository.save(reponse27);
		reponseRepository.save(reponse28);
		
		
		reponseRepository.save(reponse29);
		reponseRepository.save(reponse30);
		reponseRepository.save(reponse31);
		reponseRepository.save(reponse32);







		
		
		

	}

}
