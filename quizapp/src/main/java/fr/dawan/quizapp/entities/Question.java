package fr.dawan.quizapp.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "t_question")
public class Question extends DbObject {
	

private static final long serialVersionUID = 1L;


@Version
private int version;



@Column(nullable = false)
private String content;


@OneToMany(mappedBy = "question")
private List<Reponse> reponses= new ArrayList<>();

//@ManyToOne
//private Categorie categorie;



@ManyToOne
//@JoinColumn(name = "id_question", referencedColumnName = "id_quizz")
private Quizz quizz;

private boolean isMultiple;

private int num_order;

public Question() {
    super();
}


public Question(String content, Quizz quizz, boolean isMultiple, int num_order) {
    super();
    this.content = content;
    this.quizz = quizz;
    this.isMultiple = isMultiple;
    this.num_order = num_order;
}




//
//public Question(String content, Categorie categorie, Quizz quizz, boolean isMultiple, int num_order) {
//	this.content = content;
//	this.categorie = categorie;
//	this.quizz = quizz;
//	this.isMultiple = isMultiple;
//	this.num_order = num_order;
//}


public int getVersion() {
    return version;
}




public void setVersion(int version) {
    this.version = version;
}




public String getContent() {
    return content;
}




public void setContent(String content) {
    this.content = content;
}




public List<Reponse> getReponses() {
    return reponses;
}




public void setReponses(List<Reponse> reponses) {
    this.reponses = reponses;
}


//public Categorie getCategorie() {
//	return categorie;
//}
//
//
//public void setCategorie(Categorie categorie) {
//	this.categorie = categorie;
//}


public Quizz getQuizz() {
	return quizz;
}


public void setQuizz(Quizz quizz) {
	this.quizz = quizz;
}


public boolean isMultiple() {
	return isMultiple;
}


public void setMultiple(boolean isMultiple) {
	this.isMultiple = isMultiple;
}


public int getNum_order() {
	return num_order;
}


public void setNum_order(int num_order) {
	this.num_order = num_order;
}






 /*
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String content;
private Set<Reponse> answers = new HashSet<Reponse>(0);



public Question() {
}


public Question(String content) {
	this.content = content;
}


public Question(String content, Set<Reponse> answers) {
	
	this.content = content;
	this.answers = answers;
}


public Integer getId() {
	return this.id;
}


public void setId(Integer id) {
	this.id = id;
}


@Column(name = "content", nullable = false)
public String getContent() {
	return this.content;
}


public void setContent(String content) {
	this.content = content;
	
}


@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
public Set<Reponse> getAnswers() {
	return this.answers;
}


public void setAnswers(Set<Reponse> answers) {
	this.answers = answers;
}
*/



}
