package fr.dawan.quizapp.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Categorie extends DbObject{
	
	private String nomCategorie;
	
//	@Fetch(value=FetchMode.SUBSELECT)
//	@OneToMany(mappedBy = "categorie", fetch = FetchType.EAGER)
//	private List<Question> questions = new ArrayList<Question>();
	
	
	@OneToMany(mappedBy = "categorie", fetch = FetchType.EAGER)
	private List<Quizz> quizz = new ArrayList<>();

	public Categorie() {
	}

	public Categorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	
	

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

//	public List<Question> getQuestions() {
//		return questions;
//	}
//
//	public void setQuestions(List<Question> questions) {
//		this.questions = questions;
//	}

	public List<Quizz> getQuizz() {
		return quizz;
	}

	public void setQuizz(List<Quizz> quizz) {
		this.quizz = quizz;
	}



}
