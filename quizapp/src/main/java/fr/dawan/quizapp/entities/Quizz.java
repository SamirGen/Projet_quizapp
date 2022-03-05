package fr.dawan.quizapp.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

//import org.hibernate.annotations.Fetch;
//import org.hibernate.annotations.FetchMode;

//import fr.dawan.quizapp.entities.Question;


@Entity
@Table(name = "t_Quizz")

public class Quizz extends DbObject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Version
	private int version;
	
	private String sujet;

	@OneToMany(mappedBy = "quizz", fetch = FetchType.EAGER)
	private List<Question> questions= new ArrayList<Question>();
	
	@ManyToOne
	private Categorie categorie;
	
	public Quizz() {
        super();
    }
	
	
	

    public Quizz(Categorie categorie) {
		this.categorie = categorie;
	}
    
    

	public Quizz(String sujet, Categorie categorie) {
		this.sujet = sujet;
		this.categorie = categorie;
	}




	public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }


    public long getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }




	public Categorie getCategorie() {
		return categorie;
	}



	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}




	public String getSujet() {
		return sujet;
	}




	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	
	 	
    
    

}